package hw3_hw4.Controllers;

import hw3_hw4.Services.EmployeeService;
import hw3_hw4.StudentDomen.Employee;


public class EmployeeController implements iUserController<Employee>{
    private final EmployeeService employeeService = new EmployeeService();
    @Override
    public void create(String firstName, String secondName, int age) {
        employeeService.create(firstName, secondName, age);
    }

    public static <T extends Employee> void paySalary(T user){
        System.out.println(user.getFirstName() + " выплачена зарплата 10000р. ");
    }
}
