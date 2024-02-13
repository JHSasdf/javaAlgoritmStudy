package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {
	@Override
	// 오름차순
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
}

public class StudentsCollectionsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> Students = List.of(new Student(1, "jihun"), new Student(100, "max"), new Student(3, "miyeon"));
		List<Student> studentAL = new ArrayList<Student>(Students);
		System.out.println(studentAL);
		Collections.sort(studentAL);
		System.out.println("Asc" + studentAL);

		// 둘 다 같은 것. Collections의 static method
		Collections.sort(studentAL, new DescendingStudentComparator());
		// studentAL의 public method인 sort
		studentAL.sort(new DescendingStudentComparator());
		System.out.println("Desc" + studentAL);
	}

}
