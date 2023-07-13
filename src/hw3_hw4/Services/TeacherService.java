package hw3_hw4.Services;

import hw3_hw4.StudentDomen.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private List<Teacher> teachers;

    public TeacherService(){
        this.teachers = new ArrayList<Teacher>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Метод создания и подсчета кол-ва учителей
     * count - счетчик*/
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher user = new Teacher(firstName, secondName, age, count);
        count++;
        teachers.add(user);
    }

    /**
     * Метод сортировки по возрасту*/
    public void getSortTeachersByAge(){
        teachers.sort(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if(o1.getAge() == o2.getAge()){
                    return 0;
                } else if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else return 1;
            }
        });
    }
}
