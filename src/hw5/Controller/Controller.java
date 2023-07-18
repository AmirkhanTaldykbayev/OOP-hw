package hw5.Controller;

import hw5.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private iGetView viewEng;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view){
        this.model = model;
        this.view = view;
    }

    public void ControllerEng(iGetModel model, iGetView viewEng){
        this.model = model;
        this.viewEng = viewEng;
    }

    private boolean testData(List<Student> students){
        if(students.size()>0){
            return true;
        } else{
            return false;
        }
    }

    public void update(){
        //MVP
        students = model.getAllStudents();
        if(testData(students)){
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }


        //MVC
        //view.printAllStudents(model.getAllStudents());
    }
    public void updateEng(){
        //MVP
        students = model.getAllStudents();
        if(testData(students)){
            view.printAllStudents(students);
        } else {
            System.out.println("List of students is empty!");
        }


        //MVC
        //viewEng.printAllStudents(model.getAllStudents());
    }

    public void run(){
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration){
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com)
            {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case UPDATE:
                    update();
                    break;
                case DELETE:
                    System.out.println("Какого студента удалить? (Выберите idStudent)");
                    Long id = view.getStudentIdToDelete(); // Буфер принятого из консоли ID студента
                    if(model.deleteStudentById(id) == 1) System.out.println("Студент удален!");
                    else if (model.deleteStudentById(id) == -1) System.out.println("Такого студента не существует!");
                    break;
                default:
                    System.out.println("Введена неверная команда!");
                    break;
            }
        }
    }

    public void runEng(){
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration){
            String command = view.prompt("Enter the command: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com)
            {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Program exit!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case UPDATE:
                    update();
                    break;
                case DELETE:
                    System.out.println("Which student you want to delete? (Choose idStudent)");
                    Long id = view.getStudentIdToDelete();
                    if(model.deleteStudentById(id) == 1) System.out.println("Student deleted!");
                    else if (model.deleteStudentById(id) == -1) System.out.println("This student doesn't exist!");
                    break;
                default:
                    System.out.println("Wrong command!");
                    break;
            }
        }
    }

}
