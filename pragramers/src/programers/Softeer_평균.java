package programers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Softeer_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] f = br.readLine().split(" ");
        int n = Integer.parseInt(f[0]);
        int m = Integer.parseInt(f[1]);


        BigDecimal[] arr = new BigDecimal[n+1];
        BigDecimal[] sum = new BigDecimal[n+1];
        sum[0] = new BigDecimal(0);
        String[] input = br.readLine().split(" ");
        for(int i = 0; i <n; i++) {
            arr[i+1] = new BigDecimal(input[i]);
            sum[i+1] = sum[i].add(arr[i+1]);
        }
        for(int i = 0; i < m; i++) {
            String[] mArr = br.readLine().split(" ");
            int start = Integer.parseInt(mArr[0]);
            int end = Integer.parseInt(mArr[1]);
            BigDecimal avg = sum[end].subtract(sum[start-1]);
            avg = avg.divide(BigDecimal.valueOf(end - start + 1), 2, 0);
            sb.append(avg + "\n");
        }
        System.out.println(sb);
    }
}
