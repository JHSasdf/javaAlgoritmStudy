package _02_control_statement;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();
        if (age < 1) {
            System.out.println("you aren't born");
        } else if (age < 8) {
            System.out.println("유아");
        } else if (age < 14) {
            System.out.println("초등학생");
        } else if (age < 17) {
            System.out.println("중학생");
        } else if (age < 20) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        System.out.println("이름을 입력하세요");
        String name = scanner.next();
        String result = switch (name) {
            case "홍길동" -> "남자";
            case "성춘향" -> "여자";
            default -> "모르겠어요";
        };
        System.out.println(result);
        scanner.close();
    }
}
