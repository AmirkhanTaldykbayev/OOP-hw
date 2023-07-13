package hw3_hw4;

import hw3_hw4.Services.AverageAge;
import hw3_hw4.StudentDomen.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Сергей", "Иванов", 25);
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

        StudentGroup group = new StudentGroup(listStud, 22);

//        for (Student stud: group) System.out.println(stud);
//
//        Collections.sort(group.getStudents());
//        System.out.println("--------------после сортировки--------------");
//
//        for (Student stud: group) System.out.println(stud);


        //--------------------------------------Домашнее задание3-----------------------------------//

        Student a1 = new Student("Amir", "T", 29, 23);
        Student a2 = new Student("David", "B", 25, 85);
        Student a3 = new Student("Olga", "K", 23, 19);
        Student a4 = new Student("Egor", "B", 26, 7);

        List<Student> listStud2 = new ArrayList<>();

        listStud2.add(a1);
        listStud2.add(a2);
        listStud2.add(a3);
        listStud2.add(a4);

        StudentGroup group2 = new StudentGroup(listStud2, 17);
//
////        for (Student stud : group2) {
////            System.out.println(stud);
////        }
//
        Student b1 = new Student("Aleskandr", "W", 33, 96);
        Student b2 = new Student("Alexey", "G", 42, 55);

        List<Student> listStud3 = new ArrayList<>();

        listStud3.add(b1);
        listStud3.add(b2);
//
        StudentGroup group3 = new StudentGroup(listStud3, 47);
//
////        for (Student stud : group3) {
////            System.out.println(stud);
////        }
//
        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(group);
        studentGroupList.add(group2);
        studentGroupList.add(group3);


        StudentStream studentStream = new StudentStream(studentGroupList, 1);
//
//        for (StudentGroup sG: studentStream) {
//            System.out.println(sG.getStudents());
//        }
//
//        Collections.sort(studentStream.getStream());
//
//        for (StudentGroup sG: studentStream) {
//            System.out.println(sG.getStudents());
//        }
        //--------------------------------------Домашнее задание4-----------------------------------//

        Teacher t1 = new Teacher("a", "b", 46, 1); // создание экземпляра класса Teacher

        System.out.println(AverageAge.meanAge(group.getStudents())); // вызов статического метода и вывод в консоль

        double gr1 = AverageAge.meanAge(group.getStudents());
        double gr2 = AverageAge.meanAge(group2.getStudents());
        double gr3 = AverageAge.meanAge(group3.getStudents());

        double allGroupsMeanAge = gr1 + gr2 + gr3; // подсчет среднего возраста студентов из трёх групп

        System.out.println(allGroupsMeanAge);


    }
}
