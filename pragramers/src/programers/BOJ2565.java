package programers;

import java.util.*;

public class BOJ2565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>[] strs = new List[n];
        for(int i = 0; i <n; i++) {
            strs[i] = new ArrayList<>();
                strs[i].add(sc.nextInt());
                strs[i].add(sc.nextInt());
        }
        Arrays.sort(strs, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                int dpJ = strs[j].get(1);
                int dpI = strs[i].get(1);
                if(dpI > dpJ) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int result = Arrays.stream(dp).max().getAsInt();
        System.out.println(n - result);
    }
}
