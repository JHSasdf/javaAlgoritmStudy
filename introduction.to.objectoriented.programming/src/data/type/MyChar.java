package data.type;

public class MyChar {
	private char character;

	public MyChar(char character) {
		this.character = character;
	}

	public boolean isVowel() {
		if (Character.toUpperCase(character) == 'A' || Character.toUpperCase(character) == 'E'
				|| Character.toUpperCase(character) == 'I' || Character.toUpperCase(character) == 'O'
				|| Character.toUpperCase(character) == 'U') {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (character >= 65 && character < 91 || character >= 97 && character <= 122) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (character >= 48 && character <= 57) {
			return true;
		}
		return false;
	}

	public static void PrintLowerCaseAlphabets() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void PrintUpperCaseAlphabets() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

}
