package data.type;

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
	}

}
