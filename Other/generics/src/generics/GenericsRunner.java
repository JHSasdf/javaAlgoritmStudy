package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);

	}

	// 상한 경계 와일드카드
	// Number의 속성을 쓸 수 있음.
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// 하한 경계 와일드카드
	// Number의 하위 클래스 아무 종류나 쓸 수 있음
	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);

	}

	public static void main(String[] args) {
//		MyCustomList<String> list = new MyCustomList<String>();
//		list.addElement("element1");
//		list.addElement("2");
//		System.out.println(list);
//		System.out.println(list.get(1));
		System.out.println(sumOfNumberList(List.of(1.2, 2.547, 3123l, 4, 5)));
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);

		MyCustomList<Integer> list2 = new MyCustomList<Integer>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		System.out.println(list2);
		MyCustomList<Long> list3 = new MyCustomList<Long>();
		list3.addElement(Long.valueOf(5));
		list3.addElement(Long.valueOf(7));
		System.out.println(list3);

		Integer value = doubleValue(3);
		System.out.println(value);
		Integer value2 = doubleValue(Integer.valueOf(3));

		ArrayList numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);
	}
}
