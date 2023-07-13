package hw3_hw4.StudentDomen;

public class Employee  extends User{
    private String special;
    public Employee(String firstName, String secondName, int age, String special){
        super(firstName, secondName, age);
        this.special = special;
    }
}
