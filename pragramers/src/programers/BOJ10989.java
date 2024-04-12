package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10989 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
        Arrays.sort(arr);
    StringBuilder sb =new StringBuilder();
    for(int i = 0; i < n; i++) {
        sb.append(arr[i] + "\n");
    }
        System.out.println(sb);
    }
}
