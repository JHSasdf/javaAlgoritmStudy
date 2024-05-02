package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        List<Edge1238>[] graph = new List[n+1];
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 1; i <= m; i++) {
            int s = sc.nextInt(), d = sc.nextInt(), c = sc.nextInt();
            graph[s].add(new Edge1238(d, c));
        }
        int max = 0;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, dijkstra(graph, i, x) + dijkstra(graph, x, i));
        }
        System.out.println(max);
    }

    public static int dijkstra(List<Edge1238>[] graph, int start, int end) {
        final int INF = 1000000000;
        PriorityQueue<Edge1238> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });
        int[] cost = new int[graph.length];
        for(int i = 1; i < graph.length; i++) {
            cost[i] = INF;
        }
        cost[start] = 0;
        pq.offer(new Edge1238(start, 0));
        while(!pq.isEmpty()) {
            Edge1238 now = pq.poll();
            if(cost[now.dist] < now.cost) continue;
            for(Edge1238 next: graph[now.dist]) {
                if(cost[next.dist] > cost[now.dist] + next.cost) {
                    cost[next.dist] = cost[now.dist] + next.cost;
                    pq.offer(new Edge1238(next.dist, cost[next.dist]));
                }
            }
        }
        return cost[end];
    }
}
class Edge1238{
    int dist;
    int cost;
    public Edge1238(int dist, int cost) {
        this.dist = dist;
        this.cost = cost;
    }
}