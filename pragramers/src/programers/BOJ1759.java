package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1759 {
    static String[] chars;
    static boolean[] check;
    static String[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l =  sc.nextInt();
        int c = sc.nextInt();
        chars = new String[c];
        check = new boolean[c];
        output = new String[l];
        for(int i = 0; i < c; i++) {
            chars[i] = sc.next();
        }
        Arrays.sort(chars);
//        recur(0, l, 0);
        generate(0,0,0);
        System.out.println(sb);
    }


    public static void recur(int depth, int to, int start) {
        if(depth == to) {
            if(isValid()) {
                StringBuilder password = new StringBuilder();
                 for(String out: output) {
                     password.append(out);
                 }
                sb.append(password + "\n");
            }
            return;
        }
        for(int i = start; i < chars.length; i++) {
            if(!check[i]) {
                check[i] = true;
                output[depth] = chars[i];
                recur(depth+1, to, i+1);
                check[i] = false;
            }
        }
    }

    public static void generate(int length, int index, int vowelCount) {
        if(length == output.length) {
            if(isValid()) {
                StringBuilder password = new StringBuilder();
                for(String out: output) {
                    password.append(out);
                }
                sb.append(password + "\n");
            }
            return;
        }
        if(index == chars.length) {
            return;
        }
        output[length] = chars[index];
        int cnt = isVowel(output[length])?1:0;
        generate(length+1, index+1, vowelCount+cnt);
        output[length] = "";
        generate(length, index+1, vowelCount);

    }

    public static boolean isVowel(String str) {
        return (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u"));
    }


    public static boolean isValid() {
        int vowelCount = 0;
        int conCount;
        for(String str: output) {
            if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                vowelCount++;
            }
        }
        conCount = output.length - vowelCount;
        return (vowelCount >0 && conCount > 1);
    }
}
