package programers;

import java.util.Arrays;

public class HIndexRunner {
    int solution (int[] citations) {
        Arrays.sort(citations);
        int[] distictArray = Arrays.stream(citations).distinct().toArray();
        if(distictArray.length == 1 && distictArray[0] == 0) {
            return 0;
        }
        for(int i = citations[citations.length -1] ; i > -1; i--) {
            int num = i;
            int ans = Integer.parseInt(String.valueOf(Arrays.stream(citations).filter(e-> e >= num).count()));
            if(ans >= num) {
                System.out.println(num);
                return num;
            }
        }
        return 0;

    }


    public static void main(String[] args) {
        HIndexRunner main = new HIndexRunner();
        System.out.println(main.solution(new int[] {4, 3, 3, 3, 0, 0, 0}));
    }
}
