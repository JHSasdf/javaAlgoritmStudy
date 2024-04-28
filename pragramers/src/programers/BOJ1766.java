package programers;

import java.util.*;

public class BOJ1766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] arr = new List[n+1];
        int[] cnt = new int[n+1];
        int[] check = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i< m; i++) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            arr[a].add(b);
            cnt[b]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if(cnt[i] == 0 && check[i] == 0) {
                pq.offer(i);
                check[i]++;
            }
        }
            while(!pq.isEmpty()) {
                int now = pq.poll();
                sb.append(now + " ");
                for(int next: arr[now]) {
                    if(check[next] == 1) continue;
                    cnt[next]--;
                    if(cnt[next] == 0) {
                        pq.offer(next);
                        check[next]++;
                    }
                }
            }
        System.out.println(sb);
    }
}
