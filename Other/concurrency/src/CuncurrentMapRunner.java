import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class CuncurrentMapRunner {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

        String str = "ABCD ABCD ABCD";
        for(char character:str.toCharArray()) {
            if (character == ' ') {
                continue;
            }
            // 아래 식의 연산은 concurrent collection을 이용해서 주석을 한 줄로 줄여준다. (put도 해줌)
            occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
//            LongAdder longAdder = occurances.get(character);
//            if(longAdder == null) {
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            occurances.put(character, longAdder);
        }
        System.out.println(occurances);

    }
}
