package UDEMY_JAVA.javaWorkSpace;

public class method {
    public static void helloWorldTwice(int num1, int num2) {
        System.out.printf("%d + %d = %d ", num1, num2, num1+num2).println();
    }
    public static void helloWorldTwice(int num1, int num2, int num3) {
        System.out.printf("%d + %d + %d = %d ", num1, num2, num3, num1+num2+num3).println();
    }
    public static void sayHelloWorld(int num) {
        for (int i = 0; i < num ; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void printSquares(int num) {
        for (int i = 1; i <= num ; i++) {
            System.out.println((int) Math.pow(i,2));
        }
    }

    public static void print() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", 5, i, 5*i);
        }
    }
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

}
