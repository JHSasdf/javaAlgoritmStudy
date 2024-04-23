package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ2108 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static long sum = 0;
    static int[] howMany = new int[8001];
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i< n; i++) {
            int num = sc.nextInt();
            howMany[num + 4000]++;
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
            arr[i] = num;
        }
        long avg = sum / n + ((n/2 < sum % n)? 1: 0);
        if(sum < 0) {
            avg = sum / n + ((n/2 < Math.abs(sum) % n)? -1: 0);
        }
        int maxCount = Arrays.stream(howMany).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        for( int i = 0; i< 8001; i++) {
            if(list.size() == 2) {
                break;
            }
            if(howMany[i] == maxCount) {
                list.add(i-4000);
            }
        }

        int result3 = list.size() == 1 ? list.get(0):list.get(1);
        System.out.println(avg);
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
        System.out.println(result3);
        System.out.println(max - min);
    }
}
