package collectionss;

public class quizRunner {
	public static void main(String[] args) {
		System.out.println(quiz.isHexadecimal("ABCEF0123456789"));
		System.out.println((int) 'F');
		System.out.println(Character.isDigit('a'));
		String sentence = "this is isi is sf";
		String[] senArr = sentence.split(" ");

		StringBuilder stringBuilder = new StringBuilder();
		for (String sen : senArr) {
			StringBuilder word = new StringBuilder();
			word.append(sen);
			word.reverse();
			stringBuilder.append(word.toString() + " ");

		}
		System.out.println(stringBuilder.toString());
	}
}
