package hw3.Controllers;

import hw3.Services.StudentService;
import hw3.StudentDomen.Student;

public class StudentController implements iUserController<Student>{
    private final StudentService dataService = new StudentService();

    //Метод регистрации студента в базе данных
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
        dataService.getSortByFIOStdLst();

    }
}
