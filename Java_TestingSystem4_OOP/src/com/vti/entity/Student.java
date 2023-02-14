package com.vti.entity;

public class Student extends Staff {
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void goToVTI() {
		System.out.println(" Student đến VTI bằng xe Bus");

	}

	// public void showInfo() {
	// System.out.println("Thiss is showInfo Method Of Student");
	// }
}
