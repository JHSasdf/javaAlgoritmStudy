package programers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ20920 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] a = bf.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String word = bf.readLine();
            if(word.length() < m) continue;
            if(hashMap.containsKey(word)) hashMap.put(word, hashMap.get(word) + 1);
            else hashMap.put(word, 1);
        }
        List<String> words = new ArrayList<>(hashMap.keySet());
        words.sort((o1, o2) -> {
            if(Objects.equals(hashMap.get(o1), hashMap.get(o2)) && o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else if (Objects.equals(hashMap.get(o1), hashMap.get(o2))) {
                return o2.length() - o1.length();
            } else {
                return hashMap.get(o2) - hashMap.get(o1);
            }
        });
        for(String w: words) sb.append(w+"\n");
        System.out.println(sb);
    }
}
