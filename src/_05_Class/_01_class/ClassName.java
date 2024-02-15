package _05_Class._01_class;

public class ClassName {
    // 필드 (변수)
    private String name;
    private int number;

    // 메소드 (함수)
    // 생성자 constructer-> 클래스명과 동일한 이름
    // 기본생성자(defualt)는 구현하지 않더라도 자동으로 생성되서 객체를 만들어준다. => 생략 가능.
    public ClassName(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void testMethod() {
        System.out.println("I'm felling pretty good!");
    }

    @Override
    public String toString() {
        return "마이 네임: " + name + "/ 마이 넘버" + number;
    }

    public static void main(String[] args) {
        ClassName newClass = new ClassName("지훈", 56);
        System.out.println(newClass);
        newClass.testMethod();
        // 현재 클래스 안의 메인메소드이므로 private 접근 가능.
        System.out.println(newClass.name);
    }
}
