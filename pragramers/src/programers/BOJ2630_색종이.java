package programers;

import java.util.Scanner;

public class BOJ2630_색종이 {
    static int[][] board;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        recur(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void recur(int r, int c, int length) {
        int sameResult = isSame(r, c, length);
        if (sameResult == 1) {
            blue++;
        } else if (sameResult == 0) {
            white++;
        } else {
            int half = length / 2;
            recur(r, c, half);
            recur(r + half, c, half);
            recur(r, c + half, half);
            recur(r + half, c + half, half);
        }
    }

    public static int isSame(int r, int c, int length) {
        int start = board[r][c];
        for (int i = r; i < r + length; i++) {
            for (int j = c; j < c + length; j++) {
                if (start != board[i][j]) {
                    return -1;
                }
            }
        }
        if (start == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
