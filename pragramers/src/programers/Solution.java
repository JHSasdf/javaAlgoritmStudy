package programers;

import java.util.*;

public class Solution {

    public int solution(int[] friends, int x) {
        int result = 0;

        TreeSet<Integer> set = new TreeSet<>();
        Arrays.stream(friends).forEach(e -> set.add(e));


        while (true) {
            if(set.isEmpty()) {
                break;
            }
            if(set.first() + set.last() == x) {
                result++;
                set.remove(set.first());
                set.remove(set.last());

            } else if(set.first() + set.last() > x) {
                set.remove(set.last());
            }
            else {
                set.remove(set.first());

            }
            if(set.isEmpty()) {
                break;
            }
        }
        return result;
    }

}
