package hw3.Services;

import hw3.StudentDomen.Student;
import hw3.StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;

    public StudentService(){
        this.students = new ArrayList<Student>();
    }

    public List<Student> getAll(){
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student user = new Student(firstName, secondName, age, count);
        count++;
        students.add(user);
    }

    public void getSortByFIOStdLst(){
        //List<Student> newStudentList = new ArrayList<Student>(students);
        students.sort(new UserComparator<Student>());
        //return newStudentList;
    }


}
