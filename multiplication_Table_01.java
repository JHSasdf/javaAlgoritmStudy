
package UDEMY_JAVA.javaWorkSpace;

public class multiplication_Table_01 {
    public static void main(String[] args) {
        System.out.printf("%d * %d = %d\n", 5, 7, 5 * 7);
        System.out.printf("%f + %d + %d = %f\n", 5.5, 6, 7, 5.5 + 6 + 7);
        System.out.printf("Thi\bs is %s\n", "Testing");

        System.out.println(" --------------- -------------------------------exercise 1 --------------------------------------------");
        int a = 3;
        int b = 34;
        int c = 456;
        System.out.printf("a + b + c = %d\n", a + b + c);
        a = 5;
        System.out.printf("a + b + c = %d\n", a + b + c);

        b = a;
        b++;
        System.out.printf("a : %d\n", a);
        System.out.printf("b : %d\n", b);

        System.out.println(1 + "3" + 5);
//        ------------------------------------
        int num1 = 3;
        int num2 = 5;
        int num3 = 7;
        int num4 = 10;
        if (num1+num2 > num3 +num4) {
            System.out.println("good!");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println( (int) (Math.floor(Math.random()*10+1)));
        }

    }
}
