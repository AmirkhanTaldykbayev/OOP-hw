package hw5.Controller;

import hw5.Model.Student;

import java.util.List;

public interface iGetModel {
    public List<Student> getAllStudents();

    public int deleteStudentById(Long id);
}
