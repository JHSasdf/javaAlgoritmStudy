package chap_06;

public class _04_ParameterAndReturn {
    // 전환값과 반환값이 함께 있는 메소드
    public static int getPower(int num) {
        return (int) Math.pow(num, num);
    }

    public static void main(String[] args) {
        int retVal = getPower(2);
        System.out.println(retVal);
    }
}
