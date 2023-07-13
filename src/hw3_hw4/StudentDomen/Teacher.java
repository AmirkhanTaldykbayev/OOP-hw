package hw3_hw4.StudentDomen;


public class Teacher extends User{

    private String acadDegree;
    private int idTeacher;
    public Teacher(String firstName, String secondName, int age,  int idTeacher){
        super(firstName, secondName, age);
//        this.acadDegree = acadDegree;
        this.idTeacher = idTeacher;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "firstName = " + super.getFirstName() +
                ", secondName = " + super.getSecondName() +
                ", age = " + super.getAge() +
                ", acadDegree = " + acadDegree +
                "}";
    }
}
