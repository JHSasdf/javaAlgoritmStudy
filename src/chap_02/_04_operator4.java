package chap_02;

public class _04_operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;
        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        System.out.println(김치찌개 && 계란말이 && 제육볶음);
        김치찌개 = false;
        계란말이 = false;
        제육볶음 = false;
        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        System.out.println();
        System.out.println(5 > 3 && 5 > 7); // false
        System.out.println(5 > 3 || 5 > 7); // true
        System.out.println();

        System.out.println(!true);
        System.out.println(! (5>3));
    }
}
