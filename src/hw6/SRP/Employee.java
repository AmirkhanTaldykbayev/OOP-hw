package hw6.SRP;

import java.util.Date;

public class Employee {
    private String name; // Имя сотрудника
    private Date dob; // Дата рождения
    private int baseSalary; // Зарплата до вычета налогов

    /**
     * Конструктор
     * @param name Сюда передается имя
     * @param dob Дата рождения
     * @param baseSalary Зарплата*/
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Метод получения информации об имени и дате рождения сотрудника
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    /**
     * Метод (геттер) для получения информации о зарплате*/
    public int getSalaryInfo(){
        return calculateNetSalary();
    }

    /**
     * Метод подсчета заработной платы
     */
    private int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); // Налоговый вычет
        return baseSalary - tax;
    }
}
