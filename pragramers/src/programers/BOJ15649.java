package programers;

// 백트래킹 재귀함수 안에서 for 돌면서 숫자 선택(이때 방문여부 확인)
// 재귀함수에서 M개를 선택할 경우 print

// 시간복잡도
// N!: 10까지 가능

// 자료구조
// 결과값 저장 int[]
// 방문여부 체크 bool[]
import java.util.ArrayList;
import java.util.Scanner;


public class BOJ15649 {

    static int[] numbers;
    static boolean[] check;
    static int[] output;
    static int n;

    public static void recur(int depth) {
        if(depth == n) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int out: output) {
                stringBuilder.append(out + " ");
            }
            System.out.println(stringBuilder);
            return;
        }

        for(int i = 0; i < numbers.length; i++) {
            if(!check[i]) {
                check[i] = true;
                output[depth] = numbers[i];
                recur(depth+1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        n = sc.nextInt();


        numbers = new int[m];
        check = new boolean[m];
        output = new int[n];
        for(int i = 1; i <= m; i++) {
            numbers[i-1] = i;
        }
        recur(0);


    }
}
