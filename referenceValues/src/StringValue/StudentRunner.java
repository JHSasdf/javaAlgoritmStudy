package StringValue;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 257;
		int number = 3;
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		System.out.println(average);

		int i = 5;
		int j = i + 5;
		int k = i + 10;

//		 가변적 매개변수 ... 인자로 넣은 값들이 모두 list 배열이 됨

		System.out.println(sum(3, 47, 8, 9, 87, 52));
	}

	static int sum(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

}
