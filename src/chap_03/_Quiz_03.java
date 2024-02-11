package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String num = "980219-1590438";
        System.out.println(num.substring(0,8));
        System.out.println(num.substring(0,num.indexOf("-")+2));
    }
}
