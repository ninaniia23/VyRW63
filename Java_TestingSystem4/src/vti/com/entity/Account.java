package vti.com.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullname;
	public Department department;
	public LocalDate createDate;

	// Không có paramater
	public Account() {

	}

	// Có các paramater là id, Email, Username,FirstName,LastName
	public Account(int id, String email, String username, String fullname, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + lastName;
	}

	public String toString() {
		return "id: " + id + "   ,email: " + email + "     ,username: " + username + "    ,fullname: " + fullname;
	}
}
