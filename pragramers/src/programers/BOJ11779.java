package programers;

import java.util.*;

public class BOJ11779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INF = 1000000000;
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Edge11779>[] graph = new List[n + 1];
        int[] cost = new int[n+1];
        int[] path = new int[n+1];
        for (int i = 0; i <= n; i++) {
            cost[i] = INF;
            graph[i] = new ArrayList<>();
        }

        for( int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dist = sc.nextInt();
            int c = sc.nextInt();
            graph[src].add(new Edge11779(dist, c));
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        PriorityQueue<Edge11779> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });
        pq.offer(new Edge11779(start, 0));
        cost[start] = 0;
        while(!pq.isEmpty()) {
            Edge11779 now = pq.poll();
            // 이미 다음 dist에 대한 업데이트가 된 경우
            if(cost[now.dist] < now.cost) continue;
            for(Edge11779 next: graph[now.dist]) {
                if(cost[now.dist] + next.cost < cost[next.dist]) {
                    cost[next.dist] = cost[now.dist] + next.cost;
                    pq.offer(new Edge11779(next.dist, cost[next.dist]));
                    path[next.dist] = now.dist;
                }
            }
        }
        System.out.println(cost[end]);
        Stack<Integer> stack = new Stack<>();
        int now = end;
        while(now != 0) {
            stack.push(now);
            now = path[now];
        }
        System.out.println(stack.size());
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

class Edge11779 {
    int dist;
    int cost;

    public Edge11779(int dist, int cost) {
        this.dist = dist;
        this.cost = cost;
    }
}
