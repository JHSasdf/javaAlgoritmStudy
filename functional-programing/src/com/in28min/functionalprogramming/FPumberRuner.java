package com.in28min.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPumberRuner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 8, 13, 123, 3, 1123, 123);
//		System.out.println(getSum(numbers));

		numbers.stream().sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();
		numbers.stream().distinct().sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();
		numbers.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.print(e + " "));
		System.out.println();

		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.print(e + " "));

		List<String> strings = List.of("Apple", "Ant", "Bat");
		System.out.println();

		strings.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
		System.out.println();

		strings.stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));
	}

	// num1, num2처럼 parameter가 2개면 (num1, num2) 해줘야한다.
	// stream에는 중간 연산과 종단 연산이 있음.
	// 중간 연산: 요소를 받고, 요소 스트림을 받아서 스트림 안의 숫자를 reduce하거나 다른 종류 요소로 map하는 중간연산자, 중간 연산
	// = 여러개 가능
	// 결과는 또 다른 stream이다. (filter)
	// 종단 연산에서 요소를 처리하고 소모함. 요소를 가지고 콘솔 창에 출력하거나 return을 해줌, 스트림 전체를 소모하거나 하나의 값만 =
	// 하나만 있어야함
	// return (reduce, forEach)
	private static int getSum(List<Integer> numbers) {
		int sum = numbers.stream().filter(elem -> elem % 2 == 1).reduce(0, (num1, num2) -> {
			System.out.println("num1: " + num1 + "  num2: " + num2);
			return num1 + num2;
		});
		return sum;
	}
}
