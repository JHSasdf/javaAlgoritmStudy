package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ14888 {
    static int[] nums;
    static int[] count = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            count[i] = sc.nextInt();
        }
        recur(nums[0], 0, count[0], count[1], count[2], count[3]);
        System.out.println(max);
        System.out.println(min);
    }


    public static void recur(int sum, int depth, int plus, int minus, int mul, int div) {
        if (plus < 0 || minus < 0 || mul < 0 || div < 0) {
            return;
        }
        if (depth == nums.length - 1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        recur(sum + nums[depth + 1], depth + 1, plus - 1, minus, mul, div);
        recur(sum - nums[depth + 1], depth + 1, plus, minus - 1, mul, div);
        recur(sum * nums[depth + 1], depth + 1, plus, minus, mul - 1, div);
        recur(sum / nums[depth + 1], depth + 1, plus, minus, mul, div - 1);

    }
}
