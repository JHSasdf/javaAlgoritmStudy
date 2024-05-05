package programers;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1655 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> small = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> big = new PriorityQueue<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(small.size() == big.size()) small.offer(num);
            else big.offer(num);
            if(!small.isEmpty() && !big.isEmpty()) {
            int s = small.peek();
            int b = big.peek();
                if( s > b) {
                    small.poll();
                    big.poll();
                    big.offer(s);
                    small.offer(b);
                }
            }
                ans.append(small.peek() + "\n");
        }
        System.out.println(ans);
    }
}
