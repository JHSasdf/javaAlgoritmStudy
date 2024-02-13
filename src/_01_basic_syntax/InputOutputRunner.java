package _01_basic_syntax;

import java.util.Scanner;

public class InputOutputRunner {
    public static void main(String[] args) {
        System.out.println("하이요");
        System.out.print("This is what i meant");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("공백으로 이름/나이/키/결혼여부");
        String name = scanner.next();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        boolean isMarried = scanner.nextBoolean();
        System.out.printf("name: %s, age: %d, height: %f, isMarried: %b", name, age, height, isMarried);
        scanner.close();
    }
}
