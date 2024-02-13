package UDEMY_JAVA.javaWorkSpace.ExeptionHandling.src;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] numbers = {1, 2, 3, 4};
            int number = numbers[2];

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Before Scanner close");
            if (scanner!=null) {
            scanner.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
