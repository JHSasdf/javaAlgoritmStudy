package _05_class._04_final;

// final 변수
// - final 키워드가 지정된 변수는 한번 초기화 하면 값을 변경할 수 없음

public class FinalVariableRunner {
    public static void main(String[] args) {
        // final 변수 선언 및 초기환
        // 초기화가 된 값을 변경하려고 하면 컴파일 에러 발생
        // 읽기 전용
        final int number= 13;
//        number = 230; // 컴파일 에러

    }
}
