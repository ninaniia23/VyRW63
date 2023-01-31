package com.java.frontend;

import com.java.entity.Department;

public class Demo6 {

	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1000;
		department1.name = "Giám đốc";

		Department department2 = new Department();
		department2.id = 2000;
		department2.name = "Chủ tịch";

		department1.phongban();
		department2.phongban();
	}

}
