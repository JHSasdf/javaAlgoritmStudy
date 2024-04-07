package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2661_좋은수열 {
    static int[] numbers = new int[80];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        recur(0);


    }

    public static boolean recur(int endIndex) {
    if(endIndex == n) {
        for(int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
        }
        return true;
    } else {
        for(int i = 1; i <=3; i++) {
            numbers[endIndex] = i;
            if(!isBad(endIndex)) {
                if(recur(endIndex + 1)) return true;
            }
        }
    }
    return false;
    }

    static boolean isBad(int endIndex) {
        for(int i = 1; i <= (endIndex + 1) / 2; i++) {
            boolean isSame = true;
            for(int j = 0; j < i; j++) {
                if(numbers[endIndex - j] != numbers[endIndex - j - i]) {
                    isSame = false;
                    break;
                }
            }
        if(isSame) return true;
        }
        return false;
    }
}
