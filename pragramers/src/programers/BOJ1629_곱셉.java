package programers;

import java.util.Scanner;

public class BOJ1629_곱셉 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(solve(a,b,c));
    }

    public static long solve(int a, int b, int c) {
        if( b == 1) {
            return a % c;
        }
        long half = solve(a, b/2, c);

        if ( b % 2 == 0) {
            return (half * half) % c;
        } else {
            return (((half * half) % c) * a) % c;
        }
    }
}
