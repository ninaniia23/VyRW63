package com.vti.entity;

public class Staff {
	private int id;
	private String name;
	private String gender;

	// Khai báo Setter
	public void setId(int Id) {
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
}
