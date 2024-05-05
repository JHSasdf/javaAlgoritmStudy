package programers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1927 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(priorityQueue.isEmpty()) sb.append("0" + "\n");
                else sb.append(priorityQueue.poll() + "\n");
            } else {
                priorityQueue.offer(x);
            }
        }
        System.out.println(sb);
    }
}
