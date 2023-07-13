package hw3.Controllers;

import hw3.StudentDomen.User;

public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);

}
