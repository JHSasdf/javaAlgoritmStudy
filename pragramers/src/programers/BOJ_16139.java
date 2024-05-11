package programers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_16139 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        dp = new int[26][str.length];
        dp[str[0] - 'a'][0] =1;
        int length = str.length;
        for(int i = 1; i < length; i++) {
            for(int j = 0; j < 26; j++) {
                dp[j][i] = dp[j][i-1];
            }
            dp[str[i]-'a'][i]++;
        }
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            sb.append(find(s)+"\n");
        }
        System.out.println(sb);
    }
    private static int find(String[] s) {
        char c = s[0].charAt(0);
        int start = Integer.parseInt(s[1]);
        int end = Integer.parseInt(s[2]);
        if(start == 0) return dp[c-'a'][end];
        else return dp[c-'a'][end] - dp[c-'a'][start-1];
    }
}
