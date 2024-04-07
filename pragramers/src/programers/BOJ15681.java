package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ15681 {
    static List<Integer>[] tree;
    static boolean[] check;
    static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int q = sc.nextInt();
        tree = new List[n+1];
        check = new boolean[n+1];
        nums = new int[n+1];
        for(int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            tree[node1].add(node2);
            tree[node2].add(node1);
        }
        sum(r);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q ; i++) {
            sb.append(nums[sc.nextInt()]+ "\n");
        }
        System.out.println(sb);
    }

    public static int sum(int node) {
        if(nums[node] != 0) {
            return nums[node];
        }
        check[node] = true;
        int sum = 1;
        for(int i = 0; i < tree[node].size(); i++) {
            int child =  tree[node].get(i);
            if (!check[child]) {
            sum+= sum(child);
            }
        }
        return nums[node] = sum;
    }
}
