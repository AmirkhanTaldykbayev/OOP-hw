package hw5.Model;

import hw5.Controller.iGetModel;

import java.util.List;
import java.util.Objects;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    /**
     * Метод удаления студента
     * @param id ID студента
     * В контроллере на основе возвращаемого результата прописаны действия
     * 1 - удаление успешно
     * -1 - удаление невозможно*/
    public int deleteStudentById(Long id) {

        for (Student pers : students) {
            if (Objects.equals(pers.getIdStudent(), id)) {
                students.remove(pers);
                return 1;
            }
        }
        return -1;
    }
}
