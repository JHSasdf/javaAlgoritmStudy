package chap_01;

public class _07_typeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로
        int score = 93;
        System.out.println(score);
        System.out.println((double) score+4231.12345642);

        float score_f = 93.3F;
        double score_d = 98.84123;
        System.out.println((int) score_d);
        System.out.println((int) score_f);

        // 정수 + 실수 연산
        score = score + (int) score_d;
        System.out.println(score);

        score_d = 93 + 98.8; // double 값에 넣을때는 둘다 (double)이 자동적으로 걸림
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_d;
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        s2 = Float.toString(98.8F);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble(s2);
        System.out.println(d+3);
    }
}
