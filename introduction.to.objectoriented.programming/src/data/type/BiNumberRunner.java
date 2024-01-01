package data.type;

import java.math.BigDecimal;

public class BiNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.makeDouble();
		System.out.println(numbers.getNum1());
		System.out.println(numbers.getNum2());
		System.out.println(numbers.multiply());
		long a = 55555555555l;
		System.out.println(a);

		// double이나 float는 쓰면 안됨

		BigDecimal number = new BigDecimal("11.5");
		BigDecimal number2 = new BigDecimal("23.45678");
		int i = 5;
		System.out.println(number.multiply(new BigDecimal(i)));

	}

}
