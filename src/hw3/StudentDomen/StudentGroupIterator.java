package hw3.StudentDomen;

import java.util.List;
import java.util.Iterator;

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
