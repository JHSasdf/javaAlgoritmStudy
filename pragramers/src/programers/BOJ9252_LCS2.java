package programers;

import java.util.Scanner;
import java.util.Stack;

public class BOJ9252_LCS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = (' ' + sc.nextLine()).toCharArray();
        char[] arr2 = (' ' + sc.nextLine()).toCharArray();
        int[][] dp = new int[arr1.length][arr2.length];
        for(int i = 1; i < arr1.length; i++) {
            for(int j = 1; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        Stack<Character> s = new Stack<>();
        int p1 = arr1.length-1;
        int p2 = arr2.length-1;
        while(true) {
            if(arr1[p1] == arr2[p2]) {
                s.add(arr1[p1]);
                p1--;
                p2--;
            } else {
                if(dp[p1 - 1][p2] > dp[p1][p2 -1]) p1--;
                else p2--;
            }
            if(dp[p1][p2] == 0) break;
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(dp[arr1.length-1][arr2.length-1]);
        while(!s.isEmpty()) {
            sb.append(s.pop());
        }
        System.out.println(sb);
    }
}
