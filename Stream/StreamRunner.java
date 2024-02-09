package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRunner {
    public static void main(String[] args) {
        System.out.println(IntStream.range(0,11).reduce( 0, (n1, n2) -> n1 + n2));

        List<Integer> a = List.of(23,21,34, 12);

        System.out.println("max is: " + a.stream().max((n1, n2) -> Integer.compare(n1, n2)).get());

        List<Integer> sortedList = a.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> sortedList2 = a.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(sortedList2);

        List<Integer> squares = IntStream.range(1, 11).boxed().map(e -> e * e).collect(Collectors.toList());
        System.out.println(squares);
    }
}
