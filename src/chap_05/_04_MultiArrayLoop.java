package chap_05;

import java.util.Arrays;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        for (String[] rows:seats) {
            for (String columns:rows) {
                System.out.print(columns+" ");
            }
            System.out.println();
        }

        String[][] newSeats = new String[10][15];

        for (int i = 0; i < newSeats.length; i++){
            for (int j = 0; j < newSeats[i].length ; j++) {
                newSeats[i][j] = String.valueOf((char) (i+65)) + (j+1);
            }
        }
        System.out.println("____________________________________________");
        newSeats[7][8] = "__";
        newSeats[7][9] = "___";
        for (int i = 0; i < newSeats.length; i++){
            for (int j = 0; j < newSeats[i].length ; j++) {
                System.out.print(newSeats[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(newSeats[i]));
        }


    }
}
