package programers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1697_숨바꼭질 {
    static int[] range = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(bfs(n,k));
    }
    public static int bfs(int n, int k) {
        if(n == k) {
            return 0;
        }
        range[n] = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(n);
        while(!q.isEmpty()) {
            int now = q.poll();
            if(isRange(now+1)) {
                q.add(now+1);
                range[now+1] = range[now] +1;
                if(now+1 == k) {
                    return range[now+1];
                }
            }
            if(isRange(now-1)) {
                q.add(now-1);
                range[now-1] = range[now] +1;
                if(now-1 == k) {
                    return range[now-1];
                }
            }
            if(isRange(now * 2)) {
                q.add(now * 2);
                range[now * 2] = range[now] +1;
                if(now * 2 == k) {
                    return range[now * 2];
                }
            }
        }
        return -1;
    }
    public static boolean isRange(int x) {
        return x >= 0 && x <= 100000 && range[x] == 0;
    }
}
