package hw3_hw4.Controllers;

import hw3_hw4.Services.StudentService;
import hw3_hw4.StudentDomen.Student;

public class StudentController implements iUserController<Student>{
    private final StudentService dataService = new StudentService();

    //Метод регистрации студента в базе данных
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
        dataService.getSortByFIOStdLst();

    }
}
