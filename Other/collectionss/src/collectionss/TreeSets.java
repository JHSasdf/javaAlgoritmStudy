package collectionss;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(64, 24, 123, 57, 5));
		System.out.println(numbers);

		System.out.println(numbers.floor(50));
		System.out.println(numbers.floor(24));
		System.out.println(numbers.lower(24));
		System.out.println(numbers.ceiling(24));
		System.out.println(numbers.higher(24));

		// include, exclude
		System.out.println(numbers.subSet(24, 64));

		System.out.println(numbers.subSet(24, false, 64, true));

		System.out.println(numbers.headSet(64));
		System.out.println(numbers.tailSet(64));

		Queue<String> queue = new PriorityQueue<String>();
		queue.poll();
		queue.offer("apple");
		queue.addAll(List.of("Zebra", "MONKEY", "Cat"));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
