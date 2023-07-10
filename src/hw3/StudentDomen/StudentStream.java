package hw3.StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> stream;
    private long streamId;

    public StudentStream(List<StudentGroup> stream, long streamId) {
        this.stream = stream;
        this.streamId = streamId;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < stream.size();
            }

            @Override
            public StudentGroup next() {
                if(!hasNext()){
                    return null;
                }
                return stream.get(index++);
            }
        };
    }

//    @Override
//    public int compareTo(StudentGroup o) {
//        if(this.stream.size() == o.getStudents().size()) return 0;
//        else if (this.stream.size() < o.getStudents().size()) return -1;
//        else return 1;
//    }
}

