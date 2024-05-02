package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), e = sc.nextInt();
        if( e == 0) {
            System.out.println(-1);
            return;
        }
        List<Edge1504>[] graph = new List[n+1];
        int[] cost = new int[n+1];
        for(int i = 1; i<=n; i++) {
            graph[i] = new ArrayList<>();
            cost[i] = INF;
        }
        for(int i = 0; i < e; i++) {
            int s = sc.nextInt(), d = sc.nextInt(), c = sc.nextInt();
            graph[s].add(new Edge1504(d, c));
            graph[d].add(new Edge1504(s, c));
        }
        int v1 = sc.nextInt(), v2 = sc.nextInt();
        int answer1 = dijkstra(graph, 1, v1) + dijkstra(graph, v1, v2) + dijkstra(graph, v2, n);
        int answer2 = dijkstra(graph, 1, v2) + dijkstra(graph, v2, v1) + dijkstra(graph, v1, n);
        int ans = Math.min(answer2, answer1);
        if(ans >= INF) System.out.println(-1);
        else System.out.println(ans);
    }
    static int INF = 100000000;
    static int dijkstra(List<Edge1504>[] graph, int start, int end) {
        int[] cost = new int[graph.length];
        PriorityQueue<Edge1504> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });
        pq.offer(new Edge1504(start, 0));
        for(int i = 1; i < cost.length; i++) {
            cost[i] = INF;
        }
        cost[start] = 0;
        while(!pq.isEmpty()) {
            Edge1504 now = pq.poll();
            if(cost[now.dist] < now.cost) continue;
            for(Edge1504 next: graph[now.dist]) {
                // 여기서 next.cost는 now에서 next로 가는 cost
                if(cost[next.dist] > cost[now.dist] + next.cost) {
                    cost[next.dist] = cost[now.dist] + next.cost;
                    // 여기서 cost는 start에서 next까지 가는 총 최소비용
                    pq.offer(new Edge1504(next.dist, cost[next.dist]));
                }
            }
        }
        return cost[end];
    }
}

class Edge1504 {
    int dist, cost;

    public Edge1504(int dist, int cost) {
        this.dist = dist;
        this.cost = cost;
    }
}