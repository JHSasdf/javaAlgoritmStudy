package programers;

import java.util.Arrays;
import java.util.Scanner;

public class Baek14425 {

    int solution(String[] array1, String[] array2) {
        int ans = 0;
        for(String str: array2) {
            int start = 0;
            int end = array1.length-1;
            while(start <= end) {
                int l = (start + end) / 2;
                if (array1[l].equals(str)) {
                    ans++;
                    break;
                } else if(array1[l].compareTo(str)>0) {
                    end = l-1;
                } else if(array1[l].compareTo(str)<0) {
                    start = l+1;
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        Baek14425 main = new Baek14425();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] strArray1 = new String[N];
        String[] strArray2 = new String[M];
        for (int i = 0; i < N; i++) {
            strArray1[i] = sc.nextLine();
        }
        Arrays.sort(strArray1);
        for (int i = 0; i < M; i++) {
            strArray2[i] = sc.nextLine();
        }
        System.out.println(main.solution(strArray1, strArray2));
    }
}
