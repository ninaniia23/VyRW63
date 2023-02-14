package com.vti.entity;

public class Mentor extends Staff {
	private int yearsOfExperience;

	public Mentor(int id, String name, String gender, int yearsOfExperience) {
		super(id, name, gender);
		this.yearsOfExperience = yearsOfExperience;
	}

	public Mentor() {

	}

	public void SetYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public int GetYearsOfExperience() {
		return yearsOfExperience;
	}

	public void printInfoMentor() {
		System.out.println("Thông tin của mentor là:");
		System.out.println("Số năm kinh nghiệm là:" + this.GetYearsOfExperience());
		System.out.println("Id: " + super.getId());
		System.out.println("name: " + super.getName());
	}
}
