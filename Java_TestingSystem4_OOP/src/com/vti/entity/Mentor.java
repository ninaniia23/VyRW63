package com.vti.entity;

public class Mentor extends Staff {
	private int yearsOfExperience;

	public void Mentor(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public void SetYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = this.yearsOfExperience;
	}

	public int GetYearsOfExperience() {
		return yearsOfExperience;
	}
}
