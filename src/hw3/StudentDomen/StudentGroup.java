package hw3.StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private long groupId;

    public StudentGroup(List<Student> students, long groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {

        this.students = students;
    }

//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(students);
//    }

    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;

            public boolean hasNext() {
                return index < students.size();
            }

            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }
        };
    }
    /**
     * Переоопределение метода Comparable для сравнения групп по количеству студентов*/
    @Override
    public int compareTo(StudentGroup o) {
        if(this.getStudents().size() == o.getStudents().size()){
            return 0;
        } else if (this.getStudents().size() < o.getStudents().size()) {
            return -1;
        }
        else return 1;
    }
}
