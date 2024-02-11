package chap_04;

public class _05_For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i += 2) {
            System.out.print(i +" ");
        }
        System.out.println();

        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
