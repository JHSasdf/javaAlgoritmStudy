package collectionss;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		// 오름차순
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 우선순위 알파벳순, 그래서 cat, monkey, zebra 순으로 나가짐
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		char a = '9';
		System.out.println(a == 65);
		System.out.println((int) a);

	}

}
