package collectionss;

public class quiz {
	public static boolean isHexadecimalChar(char ch) {
		// Write your code here
		if (ch >= 'a' && ch <= 'f' || ch >= 'A' && ch <= 'F') {
			return true;
		}
		return false;
	}

	public static boolean isHexadecimal(String str) {
		// Write your code here
		char[] result = str.toCharArray();
		if (str == null || str.length() == 0) {
			return false;
		}
		for (char res : result) {
			System.out.println("res: " + res);
			if (!isHexadecimalChar(res) && !(Character.isDigit(res))) {
				System.out.println("res:, isDigit " + res);
				return false;
			}
		}
		return true;
	}
}
