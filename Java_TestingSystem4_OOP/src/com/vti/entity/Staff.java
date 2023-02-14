package com.vti.entity;

public class Staff {
	private int id;
	private String name;
	private String gender;

	public Staff() {

	}

	public Staff(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// Khai báo Setter
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;

	}

	// Khai báo Getter
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	// Khai báo tên phương thức trừu tượng
	// public abstract void gotoVTI();

	public void showInfo() {
		System.out.println("THis is showInfo of Method Staff Super");
	}
}
