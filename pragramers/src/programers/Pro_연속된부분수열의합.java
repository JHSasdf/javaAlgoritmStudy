package programers;

import java.util.ArrayList;
import java.util.List;

public class Pro_연속된부분수열의합 {
    public static List<Integer> solution(int[] sequence, int k) {
        int left = 0;
        int right = 0;
        int ans1 = 0;
        int ans2 = 0;
        int min = Integer.MAX_VALUE;
            int sum = sequence[left];
        while (true) {
            System.out.println(sum);
            System.out.println("지금렢 " + left);
            System.out.println("지금랏 " + right);
            System.out.println();
            if(left >= sequence.length) {
                break;
            }

            if (sum > k) {
                sum-= sequence[left];
                left++;
            } else if(sum < k) {
                if (right == sequence.length-1) {
                    sum-= sequence[left];
                    left++;
                } else {
                right++;
                sum += sequence[right];
                    System.out.println("더한썸" + sum);
                }
            }
            if(sum == k ){
                System.out.println("sfsf");
                if (min > (right - left)) {
                    System.out.println("민"+min);
                    System.out.println("랏 - 렢"+ (right - left));
                    System.out.println("sf"+sum);
                    System.out.println();
                    min = right - left;
                    ans1 = left;
                    ans2 = right;
                }
                sum -= sequence[left];
                left++;
            }
        }
        return List.of(ans1, ans2);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,2,2,2,2},6));
    }
}
