package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2309_일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int height1 = 0;
        int height2 = 0;
        boolean loop = false;
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            int height = sc.nextInt();
            sum+= height;
            arr[i] = height;
        }
        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    height1 = arr[i];
                    height2 = arr[j];
                    Arrays.sort(arr);
                    for(int k = 0; k < 9; k++) {
                        if(arr[k] == height1 || arr[k] == height2) continue;
                        System.out.println(arr[k]);
                    }
                    loop = true;
                    break;
                }
            }
            if(loop) break;
        }
    }
}
