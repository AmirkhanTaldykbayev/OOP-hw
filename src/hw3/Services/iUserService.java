package hw3.Services;

import java.util.List;

public interface iUserService<T> {
    List<T> getAll();

    void create(String firstName, String secondName, int age);
}
