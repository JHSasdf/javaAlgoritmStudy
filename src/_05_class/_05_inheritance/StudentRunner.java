package _05_class._05_inheritance;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student("김토딩", 20, "경희");
        Person person1 = new Student("MESSI", 20, "경희");
        // 인스턴스를 생성했을 때, Student로 생성했으니까 인스턴스에 있는 printCampus라는 메소드는 하나밖에 있지 않기 때문에
        // 오버라이딩된 Student의 메소드를 기준으로 삼는다.
        // 그리고 그 참조값의 타입을 Person으로 받아도 같은 이름의 메소드를 불러오기 때문에 부모클래스로 타입을 정해도 자식 클래스의 메소드가 되는 듯.
        // abstract class 쓸때 이 기능이 쓰이기 때문에 이렇게 설정해 놓은 것 같다.

        person1.printCampus();
        // Case1. 부모, 자식 클래스의 필드가 public인 경우
        // Person(부모) 클래스로부터 상속받은 필드 값 읽기
        System.out.println(std1.name);
        // 자식 클래스 필드 값 읽기
        std1.setCampus("kyonghee");
        System.out.println(std1.campus);
        
        // 부모 메소드 호출
        std1.say();
        std1.eat("Pizza");
        std1.printCampus();
    }
}
