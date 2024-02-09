package Stream;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    private static Predicate<? super Integer> createEvenPredicate() {
        return n -> n%2 == 0;
    }
    public static void main(String[] args) {
        //        변수에 함수 저장
        Predicate<? super Integer> evenPredicate = n -> n%2 == 0;
        Predicate<? super Integer> oddPredicate = n -> n%2 != 0;

        List.of("ant", "bat", "Cat", "Dong", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);
        System.out.println();
        List.of("ant", "bat", "Cat", "Dong", "Elephant").stream().map(String::length).forEach(MethodReferencesRunner::print);

        Integer max = List.of(23, 45, 49, 26).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare).orElse(0);
        System.out.println();

        Integer max2 = List.of(23, 45, 49, 26).stream().filter(evenPredicate).max(Integer::compare).orElse(0);

        System.out.println(max);
        System.out.println(max2);




    }
}
