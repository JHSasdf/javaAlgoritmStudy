package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s.length()); // 29

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("java"));

        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("and",12));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("C."));
    }
}
