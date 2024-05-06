package programers;
import java.io.*;
import java.util.*;
public class Softeer_연탄 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] houses = new int[n];
        int max = 0;
        int result = 0;
        for(int i = 0; i < n; i++) {
            int tan = sc.nextInt();
            houses[i] = tan;
            max = Math.max(tan, max);
        }
        for(int i = 2; i <= max; i++) {
            int count = 0;
            for(int house: houses) {
                if(house % i == 0) count++;
            }
            result = Math.max(result, count);
        }
        System.out.println(result);

    }
}

