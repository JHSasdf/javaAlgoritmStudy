package programers;

import java.util.Scanner;

public class recur1 {

    public static void asc(int n) {
        if (n == 0) {
            return;
        }
        asc(n-1);

        System.out.print(n);
    }

    public static void desc(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n);
        desc(n-1);
    }
    static int[] cache = new int[50];
    public static int pivonachi(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        cache[n] = pivonachi(n-1) + pivonachi(n-2);
        return cache[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        asc(10);
        System.out.println();
        desc(10);

        System.out.println("답" + pivonachi(8));
    }
}
