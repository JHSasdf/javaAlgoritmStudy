package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("cat");
		arrayList.add("Doyg");
		arrayList.add("asd");
		arrayList.add("ggood!");
		arrayList.remove("cat");
		// index로도 remove 가능
		arrayList.remove(0);
		System.out.println(Collections.max(arrayList));
		System.out.println(arrayList);
		System.out.println(Arrays.equals(new String[] { "asd", "ggood!" }, new String[] { "asd", "ggood!" }));
		int length = 5;
		int k = (int) Math.ceil((double) length / 2);
		System.out.println(k);
		List<Integer> resultArray = new ArrayList<>();
		Collections.sort(resultArray);
	}

}
