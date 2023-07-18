package hw5.Model;

import hw5.Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashModel implements iGetModel {
    private HashMap<Long, Student> students;

    /**
     * Конструктор класса*/
    public HashModel(HashMap<Long, Student> students){
        this.students = students;
    }

    /**
     * Метод возвращения списка студентов*/
    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        for(var stud : students.entrySet()) studentList.add(stud.getValue());
        return studentList;
    }
    /**
     * Метод удаления студента
     * @param id ID студента
     * В контроллере на основе возвращаемого результата прописаны действия
     * 1 - удаление успешно
     * -1 - удаление невозможно*/
    @Override
    public int deleteStudentById(Long id) {
        if (students.containsKey(id)){
            students.remove(id);
            return 1;
        }
        return -1;
    }
}
