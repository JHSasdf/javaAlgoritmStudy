package programers;

import java.util.Scanner;

public class Softeer_진정한효도 {
    public static void main(String[] args) {
        int result = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++) {
            result = Math.min(result, narashi(board[i][0], board[i][1], board[i][2]));
            result = Math.min(result, narashi(board[0][i], board[1][i], board[2][i]));
        }
        System.out.println(result);
    }
    private static int narashi(int a, int b, int c) {
        if(a == b && a == c) return 0;
        if(a == b || a == c) return (a == b)?Math.abs(a-c): Math.abs(a-b);
        if(b == c) return Math.abs(a-b);
        return 2;
    }
}
