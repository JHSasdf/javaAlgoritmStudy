package _02_control_statement;

public class LoopControlRunner {
    public static void main(String[] args) {
        // 기본 for문
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while문
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //do while문
        // - 적어도 한 번은 실행
        // 조건식이 뒤
            int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        ////////////////////////////

        // for each 문
        // collection type 데이터에서 데이터가 존재하는 개수만큼 반복 실행
        // collection type: 데이터를 저장하고 관리하는 자료구조 클래스의 모음
        // ArrayList, set, Map
        String[] words = {"김탁구", "선지훈", "what should I do"};
        for (String word: words) {
            System.out.println(word);
        }
    }
}
