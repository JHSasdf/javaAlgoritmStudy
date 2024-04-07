package programers;

import java.util.ArrayList;
import java.util.List;

public class Space {
    public List<Integer> solution(int []arr) {
        if (arr.length == 0) {
            return new ArrayList<>();
        }
       List<Integer> answer = new ArrayList<>();
       int lastIndex = 0;
       answer.add(arr[0]);
       for (int i = 1; i < arr.length; i++) {
            if(answer.get(lastIndex) == arr[i]) {
                continue;
            }
            lastIndex++;
            answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Space main = new Space();
        System.out.println(main.solution(new int[] {1,1,3,3,0,1,1}));
    }
}
