package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> Students = List.of(new Student(1, "jihun"), new Student(100, "max"), new Student(3, "miyeon"));
		List<Student> StudentAL = new ArrayList<Student>(Students);
		System.out.println(StudentAL);
		Collections.sort(StudentAL);
		System.out.println(StudentAL);
	}

}
