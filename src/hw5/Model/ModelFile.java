package hw5.Model;

import hw5.Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ModelFile implements iGetModel {

    private String fileName;

    public ModelFile(String fileName) {
        this.fileName = fileName;
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudentsToFile(List<Student> students){
        try(FileWriter fw = new FileWriter(fileName, true)){
            for(Student pers: students){
                fw.write(pers.getFirstName() + " " + pers.getSecondName()+ " " +pers.getAge() + " " + pers.getIdStudent());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!= null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers);
                line = reader.readLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public int deleteStudentById(Long id) {
        return -1;
    }
}
