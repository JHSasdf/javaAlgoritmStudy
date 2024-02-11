package chap_04;

public class _10_break {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            if (i ==3) {
                break;
            }
        }
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i < 50 ; i++) {
            if (i == noShow) {
                System.out.println(i +"번손님 노쇼");
                continue;
            }
            System.out.println(i + " 번 손님");
            sold++;
            if (sold == max) {
                System.out.println("재고 소진");
                break;
            }

        }
    }
}
