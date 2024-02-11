package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); // 문자열이 같으면 true, 다르면 false\
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equalsIgnoreCase("jAVA"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조, 위치 주소)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true(내용)
        System.out.println(s1 == s2); // false(참조, 위치주소)
    }
}
