import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class asobi {
    public static BigInteger calc(long N, long M) {
        BigInteger upside = new BigInteger("1");
        BigInteger downside = new BigInteger("1");
        for (long i = 0; i < N; i++) {
            upside = upside.multiply(BigInteger.valueOf(M - i));
            downside = downside.multiply(BigInteger.valueOf(N - i));
        }
        return upside.divide(downside);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(buffer.readLine());
        for (int i = 0; i < num; i++) {
            String[] lst = buffer.readLine().split(" ");
            long N = Integer.parseInt(lst[0]);
            long M = Integer.parseInt(lst[1]);
            System.out.println(calc(N, M));
        }
    }
}
