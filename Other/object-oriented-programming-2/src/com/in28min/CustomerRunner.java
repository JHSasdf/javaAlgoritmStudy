package com.in28min;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("line1", "seoul", "50035");
		Address workAddress = new Address("workLine", "bundang", "63054");
		Customer customer = new Customer("jihun", homeAddress);
		customer.setWorkAddress(workAddress);
		// toString 메소드를 정의해놓으면 print 시에 toString 메소드를 이용해서 출력하게 된다.
		System.out.println(customer);
	}

}
