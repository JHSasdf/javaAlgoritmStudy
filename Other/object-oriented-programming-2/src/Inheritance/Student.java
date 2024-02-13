package Inheritance;

public class Student extends Person {
	private String collegeName;
	private int year;

	public Student(String name, String colleageName) {
		// super();
		super(name);
		this.collegeName = colleageName;
		System.out.println("Student constructur");
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return getName() + collegeName;
	}

}
