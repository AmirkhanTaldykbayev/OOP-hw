package hw5.View;

import hw5.Controller.iGetView;
import hw5.Model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements iGetView {

    /**
     * Метод, выводящий список студентов в консоль
     * @param students Список студентов*/
    public void printAllStudents(List<Student> students){
        System.out.println("-------список студентов-------");
        for(Student stud: students){
            System.out.println(stud);
        }
        System.out.println("==============================");
    }

    /**
     * Метод, принимающий команду из консоли
     * @param msg Сообщение, выводящееся в консоль перед получением команды
     * */
    @Override
    public String prompt(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        return scan.nextLine();
    }

    /**
     * Метод, принимающий из консоли ID студента на удаление
     * */
    @Override
    public Long getStudentIdToDelete() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    @Override
    public Long getStudentIdToUpdate() {
        return null;
    }

    @Override
    public Student readStudent() {
        return null;
    }

    @Override
    public void displayStudents(List<Student> students) {

    }
}
