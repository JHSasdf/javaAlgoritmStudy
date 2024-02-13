package Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {

//		super();
		super(name);
		this.title = title;
		System.out.println("employ constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployGrade() {
		return employGrade;
	}

	public void setEmployGrade(char employGrade) {
		this.employGrade = employGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;

	}

	@Override
	public String toString() {
		return getName() + title + employerName + employGrade + getEmail();
	}

}
