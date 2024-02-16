package _05_class._04_final;

import java.util.Scanner;

public class FinalPracticeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("반지름 입력.");
        FinalPractice fP = new FinalPractice(scanner.nextDouble());
        System.out.println("원의 반지름: " + fP.getRadius());
        System.out.println("원의 넓이: " + fP.calculateArea());
        scanner.close();
    }
}
