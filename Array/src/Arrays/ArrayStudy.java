package Arrays;

public class ArrayStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks1 = { 45, 3, 24 };
		int[] marks2 = { 45, 3, 24 };

		int[] marks3 = new int[5];
		int[] marks4 = new int[8];
		System.out.print("values of mark4 is: ");
		for (int i : marks4) {
			System.out.print(i);
		}
		System.out.println();
		marks3[2] = 10;
		System.out.print("mark3 is: ");
		for (int i : marks3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(marks1 == marks2);
		System.out.println(marks1[0] == marks2[0]);
		for (int i : marks1) {
			System.out.print(i + " ");
		}
		System.out.println(marks1[1] + marks1[2]);
	}

}
