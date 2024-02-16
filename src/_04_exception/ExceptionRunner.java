package _04_exception;

// 예외
// - 일반 예외 (Exception) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
// - 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

// => Java는 예외가 발생하면 예외 클래스로부터 객체 생성하며, 해당 객체는 예외 처리시 사용됨
// 예외 발생 시 프로그램의 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드를 예외 처리 코드라고 함
// try-catch-finally 블록으로 처리

// try블록에서 작성한 코드가 예외 없이 정상 실행 -> catch는 실행 안됨.
// finally는 무조건 실행.
// 만약 try, catch 블록에서 return을 해도 finally는 실행됨 (생략 가능)

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRunner {

    public static String divide(int x, int y){
        return "X / y = " + (x / y);
    }

    public static int getLength(String word) {
        return word.length();
    }

    public static int getValueByIndex(int[] numbers, int idx) {
        return numbers[idx];
    }

    public static void main(String[] args) {
        // case 1. 예외 발생 코드
        // System.out.println(divide(3, 0)); // java.lang.ArithmeticException

        // case 2. 예외 처리 코드
        try {
            System.out.println("연산시작");
            System.out.println(divide(3, 0));
        } catch (ArithmeticException e) {
            // 예외 출력 방법
            // 방법 1: 예외 발생한 이유만 보여줌
            System.out.println("나누기 중 에러 발생 >>" + e.getMessage());

            // 방법 2: 예외 종류 리턴
            System.out.println("나누기 중 에러 발생 >>" + e.toString());

            // 방법 3: 예외가 어디서 발생했는지 추적한 내용 출력
//            e.printStackTrace();

        } finally {
            System.out.println("연산 종료!");
        }

        /////////////////////////////////
        //case 2. 예외 발생 코드
        String word = null;
        try {
        System.out.println(getLength(word));

        } catch(NullPointerException e) {
            System.out.println("단어 길이 연산 중 에러 발생 >>" + e.toString());
        }

        //////////////////////////////////
        // case 3. 예외 발생 코드
        try {
        int[] numbers = {1,3,5,7};
        System.out.println(getValueByIndex(numbers, numbers.length));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열 indexing 중 에러 발생 >>>" + e);
        }

        ///////////////////////////////////
        // case 4. 예외발생 코드
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("정수 입력");
        int number = scanner.nextInt();
        System.out.println("입력 정수 >>" + number);
        } catch (InputMismatchException e) {
            System.out.println("인풋 미스매치 익셉셥 >> " + e);
        }

        scanner.close();
    }
}
