package vti.com.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullname;
	public Position position;
	public Department department;
	public LocalDate createDate;

	// Không có paramater
	public Account() {

	}

	// Có các parameter là id, Email, Username, FirstName,
	// LastName (với FullName = FirstName + LastName)
	public Account(int id, String email, String userName, String fullName) {
		this.id = id;
		this.email = email;
		this.username = userName;
		this.fullname = fullName;
	}

	// Có các parameter là id, Email, Username, FirstName,
	// LastName (với FullName = FirstName + LastName) và
	// Position của User, default createDate = now

	public Account(int id, String email, String userName, String fullName, Position position) {
		this.id = id;
		this.email = email;
		this.username = userName;
		this.fullname = fullName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	// Có các parameter là id, Email, Username, FirstName,
	// LastName (với FullName = FirstName + LastName) và
	// Position của User, createDate

	public Account(int id, String email, String username, String fullname, String firstName, String lastName,
			Position position, LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + lastName;
		this.position = position;
		this.createDate = createDate;

		//

	}

//	public String toString() {
//		return "id: " + id + "   ,email: " + email + "     ,username: " + username + "    ,fullname: " + fullname
//				+ "     ,positionid:   " + position;
//	}

}
