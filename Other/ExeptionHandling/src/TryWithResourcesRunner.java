package UDEMY_JAVA.javaWorkSpace.ExeptionHandling.src;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {

        // tryWithResources => 자동으로 실행이 끝난 다음에 scanner.close 불러줌,
        // AutoCloseable 안의 close method가 오류가 생겼을 때 특정 변수에 기능을 해줌
        // 그래서 catch, finally 없이 try만 해도 됨.
       try( Scanner scanner = new Scanner(System.in)) {
           int[] numbers = {1, 3, 4, 5, 7};
           int number = numbers[21];
       } catch(Exception ex) {
           ex.printStackTrace();
       }




        System.out.println("Just before closing out main");
        }
    }

