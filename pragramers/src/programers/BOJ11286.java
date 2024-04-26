package programers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ11286 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) == Math.abs(o2)) return o1 - o2;
            return Math.abs(o1) - Math.abs(o2);
        });
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(pq.isEmpty()) sb.append("0"+"\n");
                else sb.append(pq.poll() + "\n");
            } else pq.offer(x);
        }
        System.out.println(sb);
    }
}
