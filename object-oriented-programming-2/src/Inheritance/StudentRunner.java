package Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("jihun", "경희");
		Employee employee = new Employee("workingJihun", "naver");
//		employee.setTitle("title");
//		employee.setEmployerName("jihunSun");
//		employee.setEmployGrade('A');
//		employee.setEmail(" new email");
		System.out.println(student);
		System.out.println(employee);
	}

}
