package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ10597_순열장난 {

    static boolean[] check;
    static char[] input;
    static int n = 0;
    static List<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.next().toCharArray();

        n = input.length > 9 ? 9 + (input.length - 9) / 2 : input.length;
        check = new boolean[n+1];
        recur(0, 0);

    }

    public static void recur(int depth, int num) {
        if (num >= input.length) {
            StringBuilder sb = new StringBuilder();
            for(var an: answer) {
                sb.append(an +" ");
            }
            System.out.println(sb);
            System.exit(0);
            return;
        }

        int next = (input[num] - 48);
        if (!check[next]) {

            check[next] = true;
            answer.add(next);
            recur(depth + 1, num + 1);
            answer.remove(answer.size()-1);
            check[next] = false;
        }
        if (num < input.length - 1) {
            next = ((input[num] -48) *10) + input[num + 1] - 48;
            if (n >= next && !check[next]) {
                check[next] = true;
                answer.add(next);
                recur(depth + 1, num + 2);
                answer.remove(answer.size()-1);
                check[next] = false;
            }
        }

    }
}
