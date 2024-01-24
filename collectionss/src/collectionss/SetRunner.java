package collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// set은 불변 set, like list
		// 무작위
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		System.out.println(numbers);

		// 삽입 순서 저장
		Set<Integer> numbers1 = new LinkedHashSet<Integer>();
		numbers1.add(765432);
		numbers1.add(76543);
		numbers1.add(7654);
		numbers1.add(765);
		System.out.println(numbers1);
		numbers1.add(765);
		System.out.println(numbers1);

		// tree set은 정렬되어 나옴.
		Set<Integer> numbers2 = new TreeSet<Integer>();
		numbers2.add(765432);
		numbers2.add(76543);
		numbers2.add(7654);
		numbers2.add(765);
		numbers2.add(765);
		System.out.println(numbers2);

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// sorted
		Set<Character> charactersTree = new TreeSet<Character>(characters);
		System.out.println("TreeSet" + charactersTree);

		// 입력순
		Set<Character> charactersHash = new LinkedHashSet<Character>(characters);
		System.out.println("LinkedHashSet" + charactersHash);

		// 랜덤
		Set<Character> charactersHashSet = new HashSet<Character>(characters);
		System.out.println("HashSet" + charactersHashSet);
	}

}
