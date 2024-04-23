package programers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ11279 {
    public static void main(String[] args) {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>((a, b) -> Math.toIntExact(b - a));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            long next = sc.nextInt();
            if(next == 0) {
                if(priorityQueue.isEmpty()) System.out.println(0);
                else System.out.println(priorityQueue.poll());
            } else {
                priorityQueue.add(next);
            }
        }
    }
}
