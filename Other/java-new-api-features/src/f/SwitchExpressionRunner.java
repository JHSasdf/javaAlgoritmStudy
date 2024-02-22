package f;

public class SwitchExpressionRunner {
    public static String findDayOfTheWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> {
                System.out.println("Do some complex logic here");
                // return하려면 yield로
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid Option" + day);
        };
        return dayOfWeek;
    }


    public static void main(String[] args) {

        System.out.println(findDayOfTheWeek(0));
    }
}
