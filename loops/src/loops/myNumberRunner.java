package loops;

public class myNumberRunner {
	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime: " + isPrime);
		System.out.println("sum" + number.sumUptoN());
		System.out.println("sumOfDivisors : " + number.sumOfDivisors());
		number.mkTree();

		int i = 3;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
		System.out.println(i);
	}
}
