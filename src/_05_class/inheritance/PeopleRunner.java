package _05_class.inheritance;

public class PeopleRunner {
    public static void main(String[] args) {
        StudentWorker studentWorker = new StudentWorker("jihun", 27, 4, 1);
        System.out.println(studentWorker);
        Person student = new Student("suzy", 14, 2); // 가능, 주소값은 Student로 들어감.
        // 즉 construcor는 Student 걸로 만들었으니까 실질적으로 Student 클래스를 만들었는데 변수에 참조값 저장은 Person 클래스라고 저장해서
        // Java가 알아서 이건 Person 클래스의 인스턴스인 student다 라고 인식해서 다른 메소드를 못쓰는 듯.
        // 타입스크립트도 이런다.
        System.out.println(student.getAge());
        System.out.println(student);

        Person person = new Person("suzy", 14);
        System.out.println(person);

    }
}
