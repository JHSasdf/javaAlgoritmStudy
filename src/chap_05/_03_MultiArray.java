package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3(row)x5(column) 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats[1][1]);
        for (String[] rows:seats) {
            for (String columns:rows) {
                System.out.print(columns+" ");
            }
            System.out.println();
        }
    }
}
