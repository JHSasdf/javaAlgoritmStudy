package programers;

import java.util.*;
import java.util.stream.Collectors;

public class DounutFail {

    public int[] solution(int[][] numsArray) {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        int[] result = new int[4];
        int max = 0;
        LinkedList<Integer> numSet = new LinkedList<>();
        for (int[] nums: numsArray) {
            numSet.add(nums[1]);
            max = Integer.max(max, Integer.max(nums[0], nums[1]));
            if(!hashMap.containsKey(nums[0])) {
                hashMap.put(nums[0], new HashSet<>());
            }
            hashMap.get(nums[0]).add(nums[1]);
        }


        for (int i = 1; i < max ; i++) {
            if(!hashMap.containsKey(i)) {
                hashMap.put(i, new HashSet<Integer>());
            }
        }

        int generatedDot = 0;
        for (int i = 1; i < max; i++) {
            if(hashMap.get(i).size() >= 2 && !numSet.contains(i)) {
                generatedDot = i;
                break;
            }
        }

        result[0] = generatedDot;

//         int totalCount = hashMap.get(generatedDot).size();
//         hashMap.get(generatedDot).stream().forEach(numSet::remove);
//         hashMap.remove(generatedDot);
//         for (int i = 1; i <= max; i++) {
//             if ( (i != generatedDot) && !numSet.contains(i) ) {
//                 result[2]++;
//                 hashMap.remove(i);
//             }
//         }

//         Set<Integer> distinct = new HashSet<>();
//         for(int i: hashMap.keySet()) {
//             for(int j: hashMap.get(i) ) {
//                 if(!distinct.add(j)) {
//                     result[3]++;
//                 }
//             }
//         }
        // result[1] += totalCount - result[3] - result[2];
        return result;
    }
}
