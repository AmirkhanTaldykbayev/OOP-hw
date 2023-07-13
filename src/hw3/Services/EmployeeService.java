package hw3.Services;

import hw3.StudentDomen.Employee;
import hw3.StudentDomen.Student;

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
