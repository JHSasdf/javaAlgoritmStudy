package _08_collection._set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PracticeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        while(true) {
            System.out.print("정수 입력: ");
            int input = scanner.nextInt();
            if (input == -1 ) {
                break;
            }
            set.add(input);

        }
        System.out.println("중복 제거된 정수 목록: " + set);
    }
}
