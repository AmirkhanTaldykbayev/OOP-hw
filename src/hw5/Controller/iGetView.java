package hw5.Controller;

import hw5.Model.Student;

import java.util.List;

public interface iGetView {
    void printAllStudents(List<Student> students);

    String prompt(String msg);

    Long getStudentIdToDelete();

    void displayStudents(List<Student> students);

    Student readStudent();

    Long getStudentIdToUpdate();
}
