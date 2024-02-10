package com.in28minutes.ifStatement.examples;

import java.util.Scanner;

public class menuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Type obj = new Type(argument);

		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter Number1: ");
//		int number1 = scanner.nextInt();
//		System.out.print("Enter Number2: ");
//		int number2 = scanner.nextInt();
//		System.out.print("Enter Method: ");
//		int method = scanner.nextInt();
//		perfromOperationUsingSwitch(number1, number2, method);

//		int dayNumber = scanner.nextInt();
//		System.out.println(isWeekDay(dayNumber));

//		int monthNumber = scanner.nextInt();
//		System.out.println(determineNameOfMonth(monthNumber));

		int i = 1;
		i = (i > 3 ? 7 : 3);
		System.out.println(i);
	}

	private static void perfromOperationUsingSwitch(int number1, int number2, int method) {
		switch (method) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 * number2);
			break;
		case 4:
			System.out.println(number1 / number2);
			break;
		default:
			System.out.println("Enter unvalid input");
		}
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		default:
			return false;
		}
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "Fabuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Not a month";
		}
	}
}
