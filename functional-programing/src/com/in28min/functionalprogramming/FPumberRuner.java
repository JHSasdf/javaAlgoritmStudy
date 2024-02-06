package com.in28min.functionalprogramming;

import java.util.List;

public class FPumberRuner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 1);
		System.out.println(getSum(numbers));
	}

	// num1, num2처럼 parameter가 2개면 (num1, num2) 해줘야한다.
	private static int getSum(List<Integer> numbers) {
		int sum = numbers.stream().filter(elem -> elem % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);
		return sum;
	}
}
