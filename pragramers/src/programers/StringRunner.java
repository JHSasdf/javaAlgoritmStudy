package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringRunner {

    int solution(int n, int k) {
        String num = "";
        String numOpposite = "";
        int count = 0;
        while(n > 0) {
            num += String.valueOf(n%k);
            n /= k;
        }
        for(int i = num.length()-1; i >= 0 ; i--) {
            numOpposite += num.charAt(i);
        }
        String[] numArray = numOpposite.split("0");
        if(Arrays.asList(numArray).isEmpty()) {
            return 0;
        }
        HashMap<String, Boolean> isPrime = new HashMap<>();
        for(String number: numArray) {
            if(number.isEmpty()){
                continue;
            }
            if(isPrime.containsKey(number)) {
                if(isPrime.get(number)) {
                    count++;
                }
            } else {
                boolean prime = true;

                for (int i = 2; i <= Math.sqrt(Long.parseLong(number)); i++) {
                    if (Long.parseLong(number) % i == 0) {
                        prime = false;
                    }
                }
                if(number.equals("1")) {
                    prime = false;
                }

                if(prime) {
                    count++;
                }
                isPrime.put(number, prime);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringRunner main = new StringRunner();
        System.out.println(main.solution(437674, 3));
    }
}
