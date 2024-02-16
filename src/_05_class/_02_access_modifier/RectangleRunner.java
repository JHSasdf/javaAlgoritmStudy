package _05_class._02_access_modifier;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleRunner {
    public static void printAll(ArrayList<Rectangle> list) {
        for (Rectangle rectangle : list) {
            int width = rectangle.getWidth();
            int height = rectangle.getHeight();
            System.out.println(" 가로 길이는: " + width);
            System.out.println(" 세로 길이는: " + height);
            System.out.println(" 넓이는: " + (width * height));
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {
        ArrayList<Rectangle> rect = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if (width == 0 && height == 0) {
                printAll(rect);
                break;
            }
            Rectangle rec = new Rectangle(width);
            rec.setHeight(height);
            rect.add(rec);
        }
        System.out.println("콜링카운트: " + Rectangle.getCallingCount());
        scanner.close();
    }
}

