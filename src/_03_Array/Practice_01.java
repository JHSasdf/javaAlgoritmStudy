package _03_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Practice_01 {
    public static double getAverage(String numsInput) {
        String[] nums = numsInput.split(" ");
        double length = nums.length;
        int result = Arrays.stream(nums).map(Integer::parseInt).reduce(0, Integer::sum);
        return result / length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력.");
        String numsInput = scanner.nextLine();
        System.out.println(getAverage(numsInput));

    }
}
