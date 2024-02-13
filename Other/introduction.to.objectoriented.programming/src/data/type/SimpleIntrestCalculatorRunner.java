package data.type;

import java.math.BigDecimal;

public class SimpleIntrestCalculatorRunner {
	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
		System.out.println(false ^ true);
		System.out.println(false ^ false); // xor 두개가 달라야 true 반환
		char ch = '\u00A2';
		System.out.println(ch);
		ch = 65;
		System.out.println(++ch);
		System.out.println((int) 'A');
		System.out.println((int) 'Z');
		System.out.println((int) '1');
		System.out.println((char) 57);
	}
}
