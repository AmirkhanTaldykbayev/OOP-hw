package hw5.View;

import hw5.Controller.iGetView;
import hw5.Model.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {
    /**
     * Method that displays a list of students in the console
     * @param students List of students*/
    @Override
    public void printAllStudents(List<Student> students){
        System.out.println("-------List of students-------");
        for(Student stud: students){
            System.out.println(stud);
        }
        System.out.println("==============================");
    }

    /**
     * Method accepting a command from the console
     * @param msg Message printed to the console before the command is received
     * */
    @Override
    public String prompt(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        return scan.nextLine();
    }

    /**
     * Method that accepts from the console the student's ID for deletion
     * */
    @Override
    public Long getStudentIdToDelete() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    @Override
    public Long getStudentIdToUpdate() {
        return null;
    }

    @Override
    public Student readStudent() {
        return null;
    }

    @Override
    public void displayStudents(List<Student> students) {

    }
}
