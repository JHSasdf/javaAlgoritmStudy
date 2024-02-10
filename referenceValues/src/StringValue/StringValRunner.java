package StringValue;

public class StringValRunner {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a lot of text";
		System.out.println(str.charAt(2));
		System.out.println(str.substring(5, 13));
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str.indexOf("lo") >= 0);
		System.out.println("contains text: " + str.contains("text"));
		System.out.println("start with This: " + str.startsWith("This"));
		System.out.println("is empty: " + "".isEmpty());
		System.out.println("equal Ignore case: " + "STRD".equalsIgnoreCase("strd"));
		str = str.toUpperCase();
		System.out.println(str);
//		왼쪽에서 오른쪽으로 진행됨. 1 + 2 후 + "23" 
		System.out.println(1 + 2 + "23");
		System.out.println("1" + 2 + 3);
		System.out.println("1" + (2 + 3));
		System.out.println(String.join(" ", "sfsf", "erdf", "s"));
		System.out.println("accd".replace("ac", "qwe"));

	}

}
