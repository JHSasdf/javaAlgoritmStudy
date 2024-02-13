package collectionss;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap<>(
				Map.of("A", 3, "K", 34, "F", 231, "B", 24, "C", 1, "Y", 123123));
		System.out.println(treemap.higherKey("B"));
		System.out.println(treemap.ceilingKey("B"));
		System.out.println(treemap.lowerKey("B"));
		System.out.println(treemap.floorKey("B"));
		System.out.println(treemap.firstEntry());
		System.out.println(treemap.firstKey());

		System.out.println(treemap.subMap("C", "Y"));
		System.out.println(treemap.subMap("C", false, "Y", true));
	}
}
