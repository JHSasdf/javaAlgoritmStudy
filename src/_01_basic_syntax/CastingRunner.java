package _01_basic_syntax;

public class CastingRunner {
    public static void main(String[] args) {

        // 묵시적 형변환 (wider Conversion
        // - 더 작은 타입에서 더 큰 타입으로의 자동 형변환
        // - 반대의 경우에는 묵시적 형변환 X -> 명시적으로 변환해야 함.
        float smallNumber = 120.5f;
        double bigNumber = smallNumber;

        // 명시적 형변환 (narrow Conversion
        // - 더 큰 타입에서 더 작은 타입으로 강제 형변환
        byte realSmallNumber = (byte) smallNumber;

        System.out.println(bigNumber);
        System.out.println(realSmallNumber);

        // 데이터 손실에 주의
        int largeNumber = 123456789;
        byte smallByte = (byte) largeNumber;
        System.out.println(smallByte);
    }
}

