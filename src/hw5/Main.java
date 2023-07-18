package hw5;

import hw5.Controller.Controller;
import hw5.Controller.iGetModel;
import hw5.Controller.iGetView;
import hw5.Model.HashModel;
import hw5.Model.ModelFile;
import hw5.Model.ModelList;
import hw5.Model.Student;
import hw5.View.View;
import hw5.View.ViewEng;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Сергей", "Иванов", 23, 101);
        Student s2 = new Student("Андрей", "Иванов", 22, 111);
        Student s3 = new Student("Иван", "Петров", 21, 121);
        Student s4 = new Student("Игорь", "Сидоров", 45, 301);
        Student s5 = new Student("Даша", "Цветкова", 35, 171);
        Student s6 = new Student("Лена", "Незабудка", 27, 104);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);



        ModelFile fmodel = new ModelFile("StudentDB.txt");
        //fmodel.saveAllStudentsToFile(listStud);

        iGetModel modelFile = fmodel;

        iGetModel model = new ModelList(listStud);
        iGetView view = new View();
        iGetView viewEng = new ViewEng();

        Controller control = new Controller(model, view);
        Controller controlEng = new Controller(model, viewEng);

//      control.update();
//        control.run();
        controlEng.runEng();


    }
}
