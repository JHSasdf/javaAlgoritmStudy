package programers;

import java.util.Scanner;
import java.util.TreeSet;

public class BOJ2751_수정렬하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for ( int i = 0; i < n; i++) {
            treeSet.add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        while(true) {
            sb.append(treeSet.pollFirst() + "\n");
            if(treeSet.isEmpty()) break;
        }
        System.out.println(sb);
    }
}
