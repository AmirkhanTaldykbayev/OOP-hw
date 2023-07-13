package hw3_hw4.Services;

import hw3_hw4.StudentDomen.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> employees;

    public EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, int age) {

    }
}
