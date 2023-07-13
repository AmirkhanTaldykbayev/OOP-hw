package hw3.Controllers;

import hw3.Services.TeacherService;
import hw3.StudentDomen.Teacher;

import javax.security.auth.callback.NameCallback;

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
