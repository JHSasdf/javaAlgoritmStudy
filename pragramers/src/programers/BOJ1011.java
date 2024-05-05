package programers;

import java.util.Scanner;

public class BOJ1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            long dis = y - x;
            for(int j = 1; j <= 46341; j++) {
                if( dis > (long)j * j - j && dis <= (long) j * j) {
                    System.out.println( 2 * j -1);
                    break;
                } else if ( dis > (long) j * j && dis <= (long) j * j + j) {
                    System.out.println(2 * j);
                    break;
                }
            }
        }
    }
}
