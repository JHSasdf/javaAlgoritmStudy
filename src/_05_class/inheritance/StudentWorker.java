package _05_class.inheritance;

public class StudentWorker extends Student{
    private int workingYears;

    public StudentWorker(String name, int age, int grade, int workingYears) {
        super(name, age, grade);
        this.workingYears = workingYears;
    }

    @Override
    public String toString() {
        return "하하" + getName() + getAge() + getGrade() + getWorkingYears();
    }

    public int getWorkingYears() {
        return workingYears;
    }


}
