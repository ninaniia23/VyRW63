package com.vti.entity;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullname;

	public int getId() {
		return this.id;
	}

	public String getEmail() {
		return this.email;
	}

	public String getUserName() {
		return this.username = "Vyv";
	}

	public String getFullName() {
		return this.fullname = " Vu Yen Vy";
	}

	public void setId(int idInput) {
		this.id = idInput;
	}

	public void setEmail(String EmailInput) {
		this.email = EmailInput;
	}
}
