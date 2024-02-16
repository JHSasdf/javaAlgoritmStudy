package _05_class.inheritance;

public class Student extends Person{
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
}
