package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1182 {
    static int[] nums;
    static boolean[] check;
    static int[] subSequence;
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        nums = new int[n];
        check = new boolean[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        for( int i = 1; i <= n; i++) {
            subSequence = new int[i];
            recur(0,i,s,0);
        }
        System.out.println(count);
    }

    static void recur(int depth, int length, int s, int start) {
        if (length == depth) {
            int sum = Arrays.stream(subSequence).sum();
            if(sum == s) {
                count++;
            }
                return;
        }

            for(int i = start; i < nums.length; i++) {
                if(!check[i]) {
                    check[i] = true;
                    subSequence[depth] = nums[i];
                    recur(depth+1, length, s, i+1);
                    check[i] = false;
                }
            }

    }
}
