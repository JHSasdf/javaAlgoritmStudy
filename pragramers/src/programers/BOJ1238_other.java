package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1238_other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        List<_Edge>[] forward = new ArrayList[n+1];
        List<_Edge>[] backword = new ArrayList[n+1];
        for(int i = 1; i<=n; i++) {
            forward[i] = new ArrayList<>();
            backword[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt(), d = sc.nextInt(), c = sc.nextInt();
            forward[s].add(new _Edge(d, c));
            backword[d].add(new _Edge(s, c));
        }
        int[] forwardCost = dijkstra(forward, x);
        int[] backwardCost = dijkstra(backword, x);
        int ans = 0;
        for(int i = 1; i <=n; i++) {
            ans = Math.max(ans, forwardCost[i] + backwardCost[i]);
        }
        System.out.println(ans);
    }

    static int[] dijkstra(List<_Edge>[] graph, int start) {
        PriorityQueue<_Edge> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });
        pq.offer(new _Edge(start, 0));
        int[] cost = new int[graph.length];
        final int INF = 1000000000;
        for(int i = 1; i < cost.length; i++) {
            cost[i] = INF;
        }
        cost[start] = 0;
        while(!pq.isEmpty()) {
            _Edge now = pq.poll();
            if(cost[now.dist] < now.cost) {
                continue;
            }
            for(_Edge next: graph[now.dist]) {
                if(cost[next.dist] > cost[now.dist] + next.cost) {
                    cost[next.dist] = cost[now.dist] + next.cost;
                    pq.offer(new _Edge(next.dist, cost[next.dist]));
                }
            }
        }
        return cost;
    }
}
class _Edge {
    int dist, cost;

    public _Edge(int dist, int cost) {
        this.dist = dist;
        this.cost = cost;
    }
}
