package programers;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class BOJ1208 {
    static int s;
    static int[] numbers;
    static Map<Integer, Integer> cnt = new HashMap<>();
    static long answer = 0;

    public static int status = -1;
    static final int LEFT = 0;
    static final int RIGHT = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.nextInt();
        numbers = new int[n];
        for(int i = 0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }

        status = LEFT;
        solve(0,n/2, 0);

        status = RIGHT;
        solve(n/2, n, 0);

        if(s == 0) answer--;
        System.out.println(answer);
    }

    public static void solve(int index, int end, int sum) {
        if(index == end) {
            // TODO: map s = sum 코드 작성
            if(status == LEFT) {
                int prev = cnt.getOrDefault(sum, 0);
                cnt.put(sum, prev + 1);
            } else if (status == RIGHT) {
                answer += cnt.getOrDefault(s-sum, 0);
            }
            return;
        }

        // recursive
        solve(index + 1, end, sum);
        solve(index + 1, end, sum + numbers[index]);
    }
}
