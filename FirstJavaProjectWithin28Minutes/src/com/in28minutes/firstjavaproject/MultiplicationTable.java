package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	String word = "%d x %d = %d";

	void print() {
		print(5);
	}

	void print(int num) {
		print(num, 1, 9);

	}

	void print(int num, int num2, int num3) {
		for (int i = num2; i <= num3; i++) {
			System.out.printf(word, num, i, num * i).println();
		}
	}
}
