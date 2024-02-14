package _03_Array;

// 표준 배열
// 배열
// - 배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야 함
// - 배열의 원소가 다 같은 타입
// - 처음 선언한 배열 크기를 변경할 수 없음 - 정적 할당 (단, ArrayList 등의 collection의 경우 동적으로 크기 조절 가능)

import java.util.Arrays;
import java.util.Collections;

public class ArrayRunner {
    public static void main(String[] args) {
        // 배열 변수 선언
        // - 두 가지 방법이 있으나 관례적으로 첫 번째 방법 사용
        // - 1. 타입[] 변수;
        // - 2. 타입 변수[];
        int[] arr1;
        int arr2[];

        // - 배열 변수는 참조 변수임. 배열도 객체이므로 휩 영역에 생성되고, 배열 변수에는 휩 영역에 생성된 객체의 주소값이 저장됨.
        // - null 저장 가능. ( null로 초기화)
        // ex) type[] variable = null;
        // => 배열 변수가 null 값을 가진 상태에서 변수[index]로 접근할 시 예외가 발생하여 nullPointerException이라는 예외 발생
        int[] numbers = null;
        System.out.println(numbers); // null
//        System.out.println(numbers[0]); // nullPointerException

        // 값 목록으로 배열 변수 선언과 배열 생성
        int[] intArray = {16, 22, 1324, 24, 2};
        System.out.println(intArray[4]);
        // 변수에는 참조 주소값이 있으므로 element를 출력하려면 toString 이용해야 함.
        intArray[0] = 437;
        System.out.println(Arrays.toString(intArray));

        // 주의. 중괄호 감싼 목록을 배열 변수에 대입할 떄, 배열 변수 미리 선언한 후에는 값 목록을 대입 불가
        char[] charArray;
//        charArray = {'A', 'B', 'C'}; // 컴파일 에러
        // 배열 변수 선언 시점과, 값 목록 대입하는 시점이 다르다면 "new type[]을 줄괄호 앞에 붙여 대입
        charArray = new char[]{'A', 'B', 'C'};


        // - new 연산자로 배열 선언과 생성
        // : new 연산자로 배열 처음 생성하면 기본값으로 초기화 됨.
        double[] doubleArr = new double[3];
        doubleArr[0] = 3.57;
        System.out.println(Arrays.toString(doubleArr));
        System.out.println(doubleArr.length);
        System.out.println(doubleArr[doubleArr.length -1]); // 마지막 index value

        // 다차원 배열
        // 배열 안에 또 다른 배열이 존재하는 배열
        // 2 * 3 배열 생성 및 초기화
        int [][] matrix = {{1,2,3},{4,5,6}};
        System.out.println("matrix1: ");
        for(int[] firstDimensionArr: matrix) {
            for(int num: firstDimensionArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 3 * 2 배열 생성 및 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;
        System.out.println("matrix2: ");
        for(int[] firstDimensionArr: matrix2) {
            for(int num: firstDimensionArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // 3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1,2,3}, {4,5,6}}, {{7,8,9}, {10,11,12}}};
        System.out.println("Three DimensionArr");
        for (int[][] secondDimensionArr: threeDimensionArr) {
            for(int[] firstDimensionARr: secondDimensionArr) {
                for(int num : firstDimensionARr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Array method
        // 배열 복사
        // - 배열은 크기 고정
        // -> 더 많은 저장 공간 필요하다면 더 큰 길이의 배열을 새로 만들어 기존 배열을 복사

        // -> ver1. 반복문으로 요소 하나씩 복사
        int[] originArray = {1,2,3};
        int[] newArray = new int[5];

        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        System.out.println(Arrays.toString(newArray)); // [1,2,3,0,0]

        // ver2. arrayCopy() 사용
        // System.arrayCopy(Object src (원본 배열), int srcPosition (원본 배열의 복사 시작 인덱스), object dest (새 배열), int destPositon(새 배열의 붙여넣기 시작 인덱스), int length)
        String[] originalFruits = {"apple", "banana", "grape"};
        String[] anotherNewArray = new String[6];
        System.arraycopy(originalFruits, 0, anotherNewArray, 1, originalFruits.length);
        System.out.println(Arrays.toString(anotherNewArray));

        // Arrays 메소드
        // copyOf(arr, copyArrLength)
        int[] originalArray = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originalArray, 3);
        System.out.println(Arrays.toString(copiedArray)); // [1,2,3]

        // copyOfRange(arr, sIdx, eIdx);
        int[] rangeArray = Arrays.copyOfRange(originalArray, 0, originalArray.length);
        System.out.println(Arrays.toString(rangeArray));

        // fill(arr, n);
        int[] fillArray = new int[37];
        Arrays.fill(fillArray, 3);
        System.out.println(Arrays.toString(fillArray));

        int[] unSortedArray = {3,4,873,1,2,456,423,87};
        Arrays.sort(unSortedArray);
        System.out.println(Arrays.toString(unSortedArray));

        // equals
        // 원소가 똑같으면 true, 참조값 안의 원시값을 비교, equals 메소드.
        System.out.println("first: " + Arrays.equals(originalArray, copiedArray));
        System.out.println("second with equals: " + Arrays.equals(originalArray, rangeArray)); // true
        System.out.println("second: with ==: " + (originalArray == rangeArray)); // false

        // deepEquals(arr1, arr2);
        // 다차원일 때
        int[][][] deepArray1 = {{{1,2},{3,4}},{{5,6}, {7,8}}};
        int[][][] deepArray2 = {{{1,2},{3,4}},{{5,6}, {7,9}}};
        int[][][] deepArray3 = {{{1,2},{3,4}},{{5,6}, {7,8}}};
        System.out.println("deepEquals1 with 2: " + Arrays.deepEquals(deepArray1, deepArray2)); // false
        System.out.println("deepEquals1 with 3: " + Arrays.deepEquals(deepArray1, deepArray3)); // true
        System.out.println("using '==' 1 with 3: " + (deepArray1 == deepArray3)); // false

        // binarySearch(arr, val) 메소드 (단, 배열이 정렬된 상태여야 함.) 미리 sort 해야함.
        // 탐색
        int[] sortedArray = {10,20,30,40,60};
        System.out.println(Arrays.binarySearch(sortedArray, 40));
    }
}
