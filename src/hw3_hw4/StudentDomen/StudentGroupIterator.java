package hw3_hw4.StudentDomen;

import java.util.List;

public class StudentGroupIterator {
    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students){
        this.students = students;
        this.counter = 0;
    }

    public boolean hasNext(){
        return counter < students.size();
    }

    public Student next(){
        if(!hasNext()){
            return null;
        }
        return students.get(counter++);
    }
}
