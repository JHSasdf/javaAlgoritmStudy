package _05_class._05_inheritance;

// 상속 Step1
// - Java는 다중 상속 지원 X, extends 뒤에는 하나의 부모 클래스만 올 수 있음
// - 부모 클래스 (슈퍼 클래스) / 자식 클래스 (서브 클래스)
public class Person {
    // Case1. 필드가 public인 경우
    public String name;
    public int age;

    // Case2. 필드가 private인 경우


    // 상속
    // 2-1. 부모 클래스가 "기본생성자"를 갖는 경우


//    public Person() {
//        System.out.println("부모 클래스 Person()생성자 실행");
//    }

    // 2-2 부모 클래스가 "매개변수를 갖는 생성자" 를 갖는 경우
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("부모 클래스 Person(String name, int age)생성자 실행");
    }

    public void say() {
        System.out.println("HI!");
    }

    public void printCampus() {
        System.out.println("몰러");
    }

    public void eat(String food) {
        System.out.println(food + "를 먹고 있따.");
    }


}
