package com.vti.frontend;

import com.vti.entity.Mentor;

public class Demo2 {
	public static void main(String[] args) {
		// Tạo ra mentor
		Mentor mentor1 = new Mentor();
		mentor1.SetYearsOfExperience(10);
		mentor1.setId(2);
		mentor1.setName("Yen Vy");
		mentor1.setGender("Nu");

		System.out.println("Thông tin Mentor 1:");
		System.out.println("Id:" + mentor1.getId());
		System.out.println("Name:" + mentor1.getName());
		System.out.println("Gender:" + mentor1.getGender());
		System.out.println("yearsOfExperience :" + mentor1.GetYearsOfExperience());
	}
}
