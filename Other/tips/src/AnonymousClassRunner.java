import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class LengthComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String str1, String str2) {
//        return Integer.compare(str1.length(), str2.length());
//    }
//}
public class AnonymousClassRunner {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("Ant", "lick", "cat", "Ball", "elephant"));
        // 익명클래스
        // 일회용 클래스
        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int result = Integer.compare(str1.length(), str2.length());
                if (result == 0) {
                    result = str1.compareTo(str2);
                }
                return result;
            }
        });
        System.out.println(animals);
    }
}
