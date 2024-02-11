package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String busNumber = "1234";
        int remainTime = 10;
        float remainDistance = 10.0F;
        System.out.println(busNumber + "버스, 남은 시간 : " + remainTime + "분, 남은 거리 : " + remainDistance +"km" );
        remainTime -= 3;
        remainDistance -= 3.5;
        System.out.println(busNumber + "버스, 남은 시간 : " + remainTime + "분, 남은 거리 : " + remainDistance +"km" );

    }
}
