package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("apple", "bat", "cat");
		// List 는 불변 list, 요소를 추가하고싶으면 arrayList 등의 가변 list를 써야함
//		words.add("dog"); // UnsupportedOperationException
		System.out.println(words.get(0));
		System.out.println(words.size());
		System.out.println(words.contains("dog"));
		System.out.println(words.indexOf("dog"));
		System.out.println(words.contains("cat"));
		System.out.println(words.indexOf("cat"));
		System.out.println(words);

		List<String> wordsArrayList = new ArrayList<String>(words);
		wordsArrayList.add("dog");
		// arrayLIst는 우리가 아는 배열 형식으로 요소 접근은 빠른데 add나 remove처럼 요소를 변경할 경우 빈공간을 만들고 나머지
		// 요소들을 한칸씩 옮겨야해서 느림
		// vector도 마찬가지 + Vector는 sync, 동기화, 싱글스레드 형식이라서 한 구문을 수행할 때 다른 구문들이 기다려줘야한다.
		// 안전하지만, 성능이 느리다.
		System.out.println(wordsArrayList);

		// linkedList 는 요소 접근은 느리지만 add나 remove같은 요소 변경은 빠름. (왜냐, link 형식으로 이어져있어서 하나만 뚝
		// 떼거나 하나를 추가해서 추가연결하면 됨)
		List<String> wordsLinkedList = new LinkedList<String>(words);
		List<String> wordsVector = new Vector<String>(words);
		wordsArrayList.add("dog");
		wordsVector.add("dog");
		wordsLinkedList.add("dog");
		System.out.println(wordsVector);

	}

}
