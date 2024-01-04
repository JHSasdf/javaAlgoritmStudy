package loops;

public class MyNumber {
	private int myNumber;

	public MyNumber(int myNumber) {
		this.myNumber = myNumber;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if (myNumber < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(myNumber); i++) {
			if (myNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int result = 0;
		for (int i = 1; i <= myNumber; i++) {
			result += i;
		}
		return result;
	}

	public int sumOfDivisors() {
		int result = 0;
		for (int i = 2; i <= Math.sqrt(myNumber); i++) {

			if (i * i == myNumber) {
				result += i;
				continue;
			}

			if (myNumber % i == 0) {
				result += i;
				result += myNumber / i;
			}
		}
		return result;
	}

	public void mkTree() {
		for (int i = 1; i <= myNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
