package _05_class._04_final;

public class StudentRunner {
    final String name = "아마데우스"; // 1. 필드 선언 시 초기화
    final String sid; // 2. 선언 해두고 constructor 에서 초기화

    public StudentRunner(String sid) {
        this.sid = sid;
    }


    public static void main(String[] args) {
        StudentRunner std1 = new StudentRunner("s001");
        System.out.println(std1.name + std1.sid);

        // final 필드 값 변경 불가능
        // std1.name = "홍길동"; // 에러

    }
}
