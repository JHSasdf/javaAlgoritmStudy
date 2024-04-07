package programers;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public int[] solution(int[][] numsArray) {
        ArrayList<ArrayList<Integer>> graph;

        int[] result = new int[4];
        int max = 0;

        for (int[] nums : numsArray) {
            max = Integer.max(max, Integer.max(nums[0], nums[1]));
        }
        int[] incoming = new int[max+1];
        graph = new ArrayList<ArrayList<Integer>>(max + 1);
        boolean[] visited = new boolean[max + 1];
        for (int i = 0; i <= max; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] nums : numsArray) {
            graph.get(nums[0]).add(nums[1]);
            incoming[nums[1]]++;
        }
        int generatedDot = 0;
        for (int i = 1; i < max; i++) {
            if (!visited[i]) {
                if (graph.get(i).size() >= 2 && incoming[i] == 0) {
                    generatedDot = i;
                    visited[generatedDot] = true;
                }
                if(graph.get(i).isEmpty() && incoming[i] == 0) {
                    visited[i] = true;
                }
            }
        }

        for(int i : graph.get(generatedDot)) {
            incoming[i]--;
        }


        result[0] = generatedDot;
        int totalCount = graph.get(generatedDot).size();
        for (int i = 1; i <= max; i++) {
            if (!visited[i]) {
                if ((graph.get(i).isEmpty() && i != generatedDot)) {
                    result[2]++;
                    visited[i] = true;
                    for(int j : graph.get(i)) {
                        incoming[j]--;
                    }
                }
            }
        }


        for (int i = 1; i <= max; i++) {
            if (!visited[i]) {
                if(incoming[i] >= 2) {
                        result[3]++;
                        visited[i] = true;
                    for(int j : graph.get(i)) {
                        incoming[j]--;
                    }
                }
            }
        }

        result[1] += totalCount - result[3] - result[2];
        return result;
    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.solution(new int[][]{{1,324},{324,721},{721,324},{1,352}})));
    }

}