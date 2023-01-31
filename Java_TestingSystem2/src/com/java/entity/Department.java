package com.java.entity;

public class Department {
	public int id;
	public String name;

	// Viết ra 1 phương thức để in ra thông tin phòng ban
	public void phongban() {
		System.out.println("------------------------------");
		System.out.println("In ra thông tin các phòng ban");
		System.out.println("ID của phòng ban đó là:" + this.id);
		System.out.println("Tên của phòng ban đó là: " + this.name);
	}
}
