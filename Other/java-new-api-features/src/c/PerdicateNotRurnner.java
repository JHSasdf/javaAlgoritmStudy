package c;

import java.util.List;
import java.util.function.Predicate;

public class PerdicateNotRurnner {

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,4,5,66,7);
        // Predicate - not 메소드
        Predicate<Integer> evenNumberPredicate = number -> number %2 ==0;
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
        System.out.println();
        // 함수 이용
        numbers.stream().filter(PerdicateNotRurnner::isEven).forEach(System.out::println);
        System.out.println();
        numbers.stream().filter(Predicate.not(PerdicateNotRurnner::isEven)).forEach(System.out::println);
    }
}
