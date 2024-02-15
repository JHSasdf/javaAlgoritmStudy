package _05_Class._01_class;

import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Rectangle firRect = new Rectangle(width, height);
        System.out.println(firRect.getArea());
    }
}
