package com.vti.frontend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Mentor;

public class Demo2 {
	public static void main(String[] args) {
		// Tạo ra mentor
		Mentor mentor1 = new Mentor(1, "Vy1", "Nũ1", 101);
		Mentor mentor4 = new Mentor(2, "Vy2", "Nũ2", 102);
		Mentor mentor3 = new Mentor(3, "Vy3", "Nũ3", 103);
		Mentor mentor2 = new Mentor(4, "Vy4", "Nũ4", 104);

		List<Mentor> mentors = new ArrayList<>();
		mentors.add(mentor1);
		mentors.add(mentor2);
		mentors.add(mentor3);
		mentors.add(mentor4);

		for (Mentor mentor : mentors) {
			System.out.println("Thông tin Mentor 1:");
			System.out.println("Id:" + mentor.getId());
			System.out.println("Name:" + mentor.getName());
			System.out.println("Gender:" + mentor.getGender());
			System.out.println("yearsOfExperience :" + mentor.GetYearsOfExperience());
		}

	}
}
