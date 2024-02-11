package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;
        System.out.println(name+"님 배달이 " + hour + "시에 시작됩니다.");
        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score +" 점입니다.");
        System.out.println("학점은 " + grade + "입니다.");
        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? \t" + pass);

        double d = 3.141234564516;
        float g = 3.141223456465162F;
//      float형일 때 소수점을 넣을 때는 뒤에 f를 넣어줘야함

        System.out.println("d = " + d);
        System.out.println("g = " + g);

//      int형은 21억까지 가능

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

//        int, long, float, double, string, char, boolean
    }
}
