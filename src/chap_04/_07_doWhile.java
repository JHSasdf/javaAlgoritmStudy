package chap_04;

public class _07_doWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 25;
        do {
            System.out.print("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while ((move + height < distance));
        System.out.println("도착");

    }
}
