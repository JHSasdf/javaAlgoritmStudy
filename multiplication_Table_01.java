
package UDEMY_JAVA.javaWorkSpace;

public class multiplication_Table_01 {
    public static void printMultyTable(int num) {

        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d, ", num, j, num * j);
        }
        System.out.println();
    }

    public static void printMultyTable(int num1, int num2) {
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d, ", num1, j, num1 * j);
        }
        System.out.println();

        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d, ", num2, j, num2 * j);
        }
        System.out.println();
    }

    public  static int getLastAngle(int num1, int num2) {
        if (num1 + num2 >= 180) {
            System.out.println("it's not a triangle");
            return 0;
        } else {
            return 180 - num1 -num2;
        }

    }

    public static void main(String[] args) {
        printMultyTable(3);
        printMultyTable(7, 8);
        System.out.println(getLastAngle(12, 180));

//        클래스 살펴보기
        multiplication_Table_01 earth = new multiplication_Table_01();
        System.out.println(earth.getLastAngle(70,40));
    }
}
