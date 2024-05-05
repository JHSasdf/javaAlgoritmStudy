package programers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i < n * n; i++) {
            long x = sc.nextInt();
            if(pq.size() < n) {
                pq.offer(x);
            } else {
                if(pq.isEmpty()) break;
                if(x > pq.peek()) {
                pq.poll();
                pq.offer(x);
                }
            }
        }

        System.out.println(pq.poll());
    }
}
