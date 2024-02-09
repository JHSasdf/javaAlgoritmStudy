package Stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

class SystemOutConsumer implements Consumer<Integer> {

    public void accept(Integer number) {
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer, Integer> {
    public Integer apply(Integer number) {
        return number * number;
    }
}

public class BehindTheScreensRunner {
    public static void main(String[] args) {
        List.of(23, 43, 34, 46, 45).stream()
                .filter(new EvenNumberPredicate()).map(new NumberSquareMapper()).forEach(new SystemOutConsumer());
    }
}
