package h;

public class RecordsRunner {

    // record : toString, equals, getter, constructor, 정적필드 만들어줌
    // 정적필드, static initializers, static method는 추가 가능
    // instance 변수와 instance initializer는 추가 불가능.
    record Person(String name, String email, String phoneNumber) {
    static int a = 1;
        // constructor 안만들어도 됨. 이런식으로 유효성 검증 하고 싶으면 이렇게 추가 가능
        // compact constructor: 생성자 인자와 this.name = name같은거 지워도 됨
        // 레코드에서만 가능
        Person {
            if (name == null) {
                throw new IllegalArgumentException("name is Null");
            }
        }

        public String name() {
            System.out.println("Do Something");
            return name;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ranga", "Ranga@in28minutes.com", "123-456-7890");
        Person person2 = new Person("Ranga", "Ranga@in28minutes.com", "123-456-7890");

        System.out.println(person1.equals(person2));
        System.out.println(person1.name());

    }
}
