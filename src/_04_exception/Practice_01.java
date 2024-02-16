package _04_exception;

import java.util.*;

public class Practice_01 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }

        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> numList = new ArrayList<>();
//        try {
//        int inputCount = scanner.nextInt();
//        for(int i = 0; i < inputCount; i++) {
//            int inputNum = scanner.nextInt();
//            numList.add(inputNum);
//        }
//            int sum = numList.stream().reduce(0, Integer::sum);
        // 둘 다 int 또는 long일 때 분모 0으로 나눌 때 ArithmetisException 익셉션 발생
//            System.out.println((double)  (sum / numList.size()));
//        } catch (InputMismatchException | ArithmeticException e) {
//            System.out.println("에러 발생 >>" + e);
//        }

        ArrayList<Integer> numList = new ArrayList<>();
        try {
            int inputCount = scanner.nextInt();
//            int[] numArr = new int[inputCount];
//            for(int i = 0; i < inputCount; i++) {
//                numArr[i] =scanner.nextInt();
//            }
//            Arrays.sort(numArr);
//            for(int i = 0; i < numArr.length -1; i++) {
//                if(numArr[i] == numArr[i+1]) {
//                    numList.add(numArr[i]);
//                }
//            }
//            List<Integer> distinctArr  = numList.stream().distinct().toList();
//            numList.addAll(distinctArr);
//            Collections.sort(numList);
            for (int i = 0; i < inputCount; i++) {
                numList.add(scanner.nextInt());
            }
            List<Integer> distinctArr = numList.stream().distinct().toList();
            for (int distinctNum : distinctArr) {
                numList.remove(Integer.valueOf(distinctNum));
            }
            distinctArr = numList.stream().distinct().toList();
            numList.addAll(distinctArr);
            Collections.sort(numList);
            System.out.println(numList);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Error! >> " + e);
        } finally {
        scanner.close();
        }

    }
}
