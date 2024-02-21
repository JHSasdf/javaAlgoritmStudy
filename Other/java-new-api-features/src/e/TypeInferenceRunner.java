package e;

import java.util.List;
import java.util.stream.Stream;

class a {
//    public var a = 7; // 멤버 변수 못씀.
    public int b = 7;
}
public class TypeInferenceRunner {
    public static void main(String[] args) {
        List<String> names1 = List.of("Ranga", "Ravi");
        List<String> names2 = List.of("John", "Adam");
        // 오른쪽에는 실존 객체가 와야 타입 추론 가능 (null 불가), 멤버 변수에는 적용 불가
        // 웬만하면 타입이 굉장히 길때만 사용하자
        var abc = new a();

        // 타입 추론, final도 쓸 수 있음
        final var names = List.of(names1, names2);

        names.stream().forEach(System.out::println);

        // 함수식이 너무 길때 이렇게 refactor해서 가능
        var stringStream = names1.stream().filter(s -> s.length() < 5);
        stringStream.forEach(System.out::println);

        for(var name: names) {
            System.out.println(name);
        }
    }
}
