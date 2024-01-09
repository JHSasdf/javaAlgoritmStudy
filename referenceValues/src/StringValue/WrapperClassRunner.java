package StringValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class WrapperClassRunner {
	public static void main(String[] args) {
		Integer seven = Integer.valueOf(7);
		// 둘 다 동일, 오토박싱은 valueOf를 활용함
		Integer seven1 = 7;
		System.out.println(seven + seven1);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		LocalDate now = LocalDate.now();
		LocalDateTime time = LocalDateTime.now();
		LocalTime time1 = LocalTime.now();
		System.out.println(now);
		System.out.println(time);
		System.out.println(time1);
		List list = new ArrayList();
		list.add(1);
		list.add(13);
		list.add('s');
		list.add("sf");
		System.out.println(list);
	}
}
