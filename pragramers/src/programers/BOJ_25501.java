package programers;

import java.util.Scanner;

public class BOJ_25501 {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sc.nextLine();
        for(int i = 0; i <n; i++) {
            char[] arr = sc.nextLine().toCharArray();
            num = 0;
            sb.append(isPalindrome(arr) + " " + num + "\n");
        }
        System.out.println(sb);
    }

    private static int recursion(char[] s, int l, int r) {
        num++;
        if(l >= r) return 1;
        else if(s[l] != s[r]) return 0;
        else return recursion(s, l+1, r-1);
    }
    private static int isPalindrome(char[] s) {
        return recursion(s, 0, s.length-1);
    }
}
