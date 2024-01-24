package collectionss;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hash map은 null value 저장가능
		// Hash table은 null value 저장 불가능, Vector처럼 동기화
		// Linked hash map, 삽입순서 기억
		// TreeMap, 정렬

		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
		System.out.println(map);
		System.out.println(map.get("B"));
		System.out.println(map.containsKey("Z"));
		System.out.println(map.containsValue(10));
		System.out.println(map.keySet());
		System.out.println(map.values());

		Map<String, Integer> hashmap = new HashMap<String, Integer>(map);
		hashmap.put("F", 5);
		hashmap.put("F", hashmap.get("F") + 1);
		System.out.println(hashmap);

		Map<Character, Integer> result = new HashMap<>();
		String sentence = "This is a great thing";
		char[] chars = sentence.toCharArray();
		for (char cha : chars) {
			if (result.get(cha) != null) {
				result.put(cha, result.get(cha) + 1);
			} else {
				result.put(cha, 1);
			}
		}
		System.out.println(result);

		Map<String, Integer> result2 = new HashMap<>();
		String sentence2 = "This is a great thing, a have a good day great man";
		String[] words = sentence2.split(" ");
		for (String word : words) {
			if (result2.get(word) != null) {
				result2.put(word, result2.get(word) + 1);
			} else {
				result2.put(word, 1);
			}
		}
		System.out.println(result2);
	}

}
