package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ11725 {
    static List<Integer>[] tree;
    static int[] parents;
    static boolean[] check;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];
        for(int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }

        for(int i = 0; i < n - 1; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            tree[node1].add(node2);
            tree[node2].add(node1);
        }
        find(1);
            StringBuilder sb = new StringBuilder();
        for(int i = 2; i < n+1; i++) {
            sb.append(parents[i]+"\n");
        }
        System.out.println(sb);
    }
    public static void find(int node) {
            check[node] = true;
            for(int i = 0; i < tree[node].size(); i++) {
                int child = tree[node].get(i);
                if(!check[child]) {
                    parents[child] = node;
                    find(child);
                }
            }
    }
}
