package programers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BOJ9019_DSLR {
    static String[] graph;
    static boolean[] visited;
    static int start;
    static int end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i < n; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            graph = new String[10000];
            visited = new boolean[10000];
            bfs();
            System.out.println(graph[end]);
        }
    }
    public static void bfs() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        graph[start] = "";
        visited[start] = true;
        while(!q.isEmpty()) {
            int now = q.poll();
            if (now == end) {
                break;
            }
            int[] dslr = makeDSLR(now);
            for(int i= 0; i < dslr.length; i++) {
                if(!visited[dslr[i]]) {
                    visited[dslr[i]]= true;
                    q.add(dslr[i]);
                    if(i == 0) {
                        graph[dslr[i]] = graph[now] + "D";
                    } else if(i == 1) {
                        graph[dslr[i]] = graph[now] + "S";
                    }  else if(i == 2) {
                        graph[dslr[i]] = graph[now] + "L";
                    } else {
                        graph[dslr[i]] = graph[now] + "R";
                    }
                }
            }

        }
    }
    public static int[] makeDSLR(int now) {
        return new int[] {(now * 2) % 10000, (now == 0)? 9999: now-1, now / 1000 + (now % 1000) * 10, now / 10 + (now % 10 * 1000)};
    }
}
