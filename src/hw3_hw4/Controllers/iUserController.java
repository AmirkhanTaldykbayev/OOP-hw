package hw3_hw4.Controllers;

import hw3_hw4.StudentDomen.User;

public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);

}
