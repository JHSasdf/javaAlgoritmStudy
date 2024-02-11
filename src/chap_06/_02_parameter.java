package chap_06;

public class _02_parameter {
    public static long plus (int x, int y) {
        return (long) Math.pow(x,y);
    }
    public static void main(String[] args) {
        System.out.println(plus(9, 110));
    }
}
