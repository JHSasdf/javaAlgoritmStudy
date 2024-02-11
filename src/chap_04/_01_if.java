package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 15;
        if (hour < 14) {
            System.out.println("지금 시간은 " + hour + "시니까 커피를 마십니다.");
            System.out.println("주문 완료");
        }
        else {
            System.out.println("지금 시간은 " + hour + "시니까 커피를 마시지 않습니다.");
        }

        hour = 15;
        boolean morningCoffee = true;
        if (!morningCoffee && hour < 14) {
            System.out.println("주문합니다.");
        }
        else {
            if (morningCoffee && hour < 14) {
                System.out.println("모닝커피를 마셨으므로 주문하지 않습니다.");
            } else if (hour >=14 && !morningCoffee) {
                System.out.println("시간이 늦었으므로 주문하지 않습니다.");
            }
            else {
                System.out.println("모닝도 마시고 시간도 늦었으므로 주문 x");
            }
        }
    }
}
