package com.in28min.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Apple", "Banana", "Cat", "Dong", "That");
		printBasic(list);
		printBasicWithFiltering(list);
		printIntWithFilteringOdd(List.of(1, 2, 3, 4, 5, 6, 7));
		printIntWithFilteringEven(List.of(1, 2, 3, 4, 5, 6, 7));
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
		list.stream().forEach(elem -> System.out.println(elem));
	}

	private static void printBasicWithFiltering(List<String> list) {
		list.stream().filter(elem -> elem.endsWith("at")).forEach(elem -> System.out.println(elem));
	}

	private static void printIntWithFilteringOdd(List<Integer> list) {
		list.stream().filter(elem -> (elem % 2 == 1)).forEach(elem -> System.out.println(elem));
	}

	private static void printIntWithFilteringEven(List<Integer> list) {
		list.stream().filter(elem -> (elem % 2 == 0)).forEach(elem -> System.out.println(elem));
	}

}
