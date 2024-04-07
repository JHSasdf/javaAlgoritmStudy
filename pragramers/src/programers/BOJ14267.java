package programers;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ14267 {
    static List<Integer>[] tree;
    static int[] parents;
    static int[] like;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        tree = new List[n + 1];
        like = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n + 1; i++) {
            int parent = sc.nextInt();
            if (parent != -1) {
                tree[parent].add(i);
            }
        }
        for (int i = 0; i < m; i++) {
             int num1 = sc.nextInt();
             int num2 = sc.nextInt();
             like[num1] += num2;
        }
        sum(1);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n+1; i++) {
            sb.append(like[i] + " ");
        }
        System.out.println(sb);
    }

    public static void sum(int node) {
        for(int child: tree[node]) {
            like[child] += like[node];
            sum(child);
        }
    }

}
