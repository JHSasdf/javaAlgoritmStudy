package _05_class.inheritance;

// 상속 Step1
// - Java는 다중 상속 지원 X, extends 뒤에는 하나의 부모 클래스만 올 수 있음
// - 부모 클래스 (슈퍼 클래스) / 자식 클래스 (서브 클래스)
public class Person {
    // Case1. 필드가 public인 경우
    private String name;
    private int age;

    // Case2. 필드가 private인 경우


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
