import java.util.Arrays;


public class EnumRunner {
    public static void main(String[] args) {

        Season season = Season.AUTUMN;
        System.out.println(season);

        Season season1 = Season.valueOf("WINTER");

        System.out.println(season1);
        // ordinal: Enum의 index
        System.out.println(season1.ordinal());
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SPRING.getValue());

        System.out.println(Arrays.toString(Season.values()));
    }
}
