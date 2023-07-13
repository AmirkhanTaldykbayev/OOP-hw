package hw3_hw4.Controllers;

import hw3_hw4.Services.TeacherService;
import hw3_hw4.StudentDomen.Teacher;

public class TeacherController implements iUserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();

    /**
     * Метод создания экземпляра класса учитель и их сортировки по возрасту*/
    @Override
    public void create(String firstName, String secondName, int age) {
        teacherService.create(firstName,secondName,age);
        teacherService.getSortTeachersByAge();
    }
}
