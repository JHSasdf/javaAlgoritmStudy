package _05_class._01_class;

public class ClassNameRunner {

    public static void main(String[] args) {
        // 객체 생성 (인스턴스화) new는 새로운 클래스를 만들고 클래스의 주소값을 return해준다. 그래서 className이라는 변수에는 인스턴스의 주소값이 들어간다.
    ClassName className = new ClassName("지훈", 26);
    className.testMethod();
        System.out.println(className);
    }

}
