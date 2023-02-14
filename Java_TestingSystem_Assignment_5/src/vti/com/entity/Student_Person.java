package vti.com.entity;

import java.util.Scanner;

public class Student_Person extends Person {
	private int id;
	private Float averageRate;
	private String email;

	@Override
	public void inputInfor() {
		Scanner scanner = new Scanner(System.in);
		super.inputInfor();
		System.out.println("ID là :");
		this.id = scanner.nextInt();
		System.out.println("Average Rate: ");
		this.averageRate = scanner.nextFloat();
		System.out.println("Email: ");
		this.email = scanner.next();
	}

	@Override
	public String showInfor() {

		return super.showInfor() + " id= " + id + " ,AverageRate= " + averageRate + " ,email=" + email + "]";
	}

	public boolean Scholarship() {
		return averageRate > 8.0 ? true : false;
	}
}
