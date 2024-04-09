package programers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BOJ12851_숨바꼭질2 {

    static int[] range = new int[1000001];
    static int[] count = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        bfs(n,k);
    }

    public static void bfs(int n, int k) {

        range[n] = 1;
        count[n] = 1;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(n);
        while (!q.isEmpty()) {
            int now = q.poll();
            if (now == k) {
                break;
            }
            int[] next = {now - 1, now + 1, 2 * now};
            for(int i = 0; i < 3; i++) {
                if(!isRange(next[i])) continue;
                if(range[next[i]] == 0) {
                    range[next[i]] = range[now] + 1;
                    count[next[i]] = count[now];
                    q.add(next[i]);
                } else if( range[next[i]] == range[now] + 1) {
                    count[next[i]] += count[now];
                }
            }
        }
        System.out.println(range[k] -1);
        System.out.println(count[k]);
    }

    public static boolean isRange(int x) {
        return x >= 0 && x <= 100000;
    }
}
