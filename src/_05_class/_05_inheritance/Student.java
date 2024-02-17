package _05_class._05_inheritance;

public class Student extends Person{
    public String campus;

    public Student(String name, int age, String campus) {
        // 2-1. 부모 클래스가 기본 생성자
//        this.name = name;
//        this.age = age;
        
        // 2-2. 부모 클래스가 매개변수 받는 생성자
         super(name, age); // 생략됨 (컴파일시 자동 추가)
        this.campus= campus;
    }

    public String getCampus() {
        return campus;
    }

    @Override
    public void printCampus() {
        System.out.println(this.campus + "에서 공부중");
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
