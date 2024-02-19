package _07_generic;

// 사람 객체간 상속 관계
// Person
// ㄴ Teacher
// ㄴ Student
//   ㄴ WebStudent
//   ㄴ MobileStudent

class Person{}

class Student extends Person{}
class Teacher extends Person{}
class WebStudent extends Student{}
class MobileStudent extends Student{}

// 등록
// - 특정 종류 (T)의 Applicant를 나타내는 클래스
class Applicant<T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}
// 과정
// 
class Course {
    // 모든 사람이 등록 가능
    public static void registerCourseA(Applicant<?> applicant) {
        System.out.println("kind: " + applicant.kind);
        System.out.println("kind.getClass(): " + applicant.kind.getClass());
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course A를 등록함");
    }

    // Student 혹은 자식만 가능
    public static void registerCourseB(Applicant<? extends Student> applicant) {
        System.out.println("kind: " + applicant.kind);
        System.out.println("kind.getClass(): " + applicant.kind.getClass());
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course B를 등록함");
    }
    static void registerCourseC(Applicant<? super Teacher> applicant) {
        System.out.println("kind: " + applicant.kind);
        System.out.println("kind.getClass(): " + applicant.kind.getClass());
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course C를 등록함");
    }
    // Student 객체만 등록 가능
    // Teacher 가능, Student가 아닌 Person 가능

    // 참고. getClass(), getSimpleName() 메소드
    // - object 클래스에서 제공되는 메소드
    // - getClass(): 객체 클래스 정보 반환, 반환 값은 클래스 객체 (ex. class java.lang.String)
    // - getSimpleName(): Class 클래스의 메소드로, 클래스의 간결한 이름 반환, 패키지 정보 제외한 클래스 이름만 얻어올 때 사용
}

public class GenericRunner3 {
    public static void main(String[] args) {
        // Course A 모든 사람이 신청 가능
        System.out.println("=====================================================");
        Course.registerCourseA(new Applicant<Person>(new Person()));
        System.out.println();
        Course.registerCourseA(new Applicant<Teacher>(new Teacher()));
        System.out.println();
        Course.registerCourseA(new Applicant<WebStudent>(new WebStudent()));

        // couseB Student 만 등록 가능 (Student의 서브 클래스도 가능)
        System.out.println("=====================================================");
//        Course.registerCourseB(new Applicant<Person>(new Person())); // 불가능
//        System.out.println();
//        Course.registerCourseB(new Applicant<Teacher>(new Teacher())); // 불가능
//        System.out.println();
        Course.registerCourseB(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseB(new Applicant<MobileStudent>(new MobileStudent()));
        Course.registerCourseB(new Applicant<Student>(new Student()));

        System.out.println();
        System.out.println("=====================================================");
        // courseC 는 Teacher / Teacher의 super class, 즉 Student가 아닌 Person만 가능
        // person 클래스의 자식은 Teacher와 Student 밖에 없으니까.
//        Course.registerCourseC(new Applicant<WebStudent>(new WebStudent())); // 불가능
        Course.registerCourseC(new Applicant<Teacher>(new Teacher()));
        Course.registerCourseC(new Applicant<Person>(new Teacher()));
        Course.registerCourseC(new Applicant<Person>(new Person()));
    }
}
