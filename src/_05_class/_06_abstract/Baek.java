package _05_class._06_abstract;

public class Baek extends Student{
    public Baek(String name, int age, int sid, String school) {
        super(name, age, sid, school);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자\n");
    }

    @Override
    public String toString() {
        return "------" + getName() + "학생의 정보" + "------\n" + "학교: " + getSchool() + "\n나이: " +getAge() +
                "\n 학번: " +getSid();
    }
}
