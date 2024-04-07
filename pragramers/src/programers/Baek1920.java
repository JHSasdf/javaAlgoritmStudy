package programers;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1920 {
    int solution(int[] numArray, int X) {
        int start =0;
        int end = numArray.length-1;
        while(start <= end) {
            int l = (start + end) / 2;
            if(numArray[l] > X) {
                end = l-1;
            } else if (numArray[l] < X) {
                start = l+1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Baek1920 main = new Baek1920();
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int[] firstArr = new int[firstNum];
        for (int i = 0 ; i < firstNum; i++) {
                firstArr[i] = sc.nextInt();
        }
        Arrays.sort(firstArr);
        int secondNum = sc.nextInt();
        int[] secondArr = new int[secondNum];
        for (int i = 0 ; i < secondNum; i++) {
            secondArr[i] = sc.nextInt();
        }
        for(int second: secondArr) {
            System.out.println(main.solution(firstArr, second));
        }
    }
}
