package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(7,8));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")+1));
        s = "                     I love Java.           ";
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        s += " and Python";
        System.out.println(s);
        String s1 = "and whatever";
        System.out.println(s.concat(", ").concat(s1));
    }
}
