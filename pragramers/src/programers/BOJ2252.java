package programers;


import java.util.*;

public class BOJ2252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] list = new List[n+1];
        StringBuilder sb = new StringBuilder();
        int[] indegree = new int[n+1];
        int[] check = new int[n+1];
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dist = sc.nextInt();
            list[src].add(dist);
            indegree[dist]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            if(indegree[i] == 0) q.offer(i);
        }
        while(!q.isEmpty()) {
            int now = q.poll();
            check[now] = 1;
            sb.append(now + " ");
            for(int next : list[now]) {
                if(check[next] == 1) continue;
                indegree[next]--;
                if(indegree[next] == 0) q.offer(next);
            }
        }
        System.out.println(sb);
    }
}
