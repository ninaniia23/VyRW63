package vti.com.entity;

import java.time.LocalDate;

public class Position {
	public int id;
	public String name;
	public Account creator;
	public LocalDate createDate;

	// khong co paramater
	public Position() {

	}

	// Có các parameter là GroupName, Creator, array Account[]
	// accounts, CreateDate
	public Position(String GroupName, Account Creator, LocalDate createDate, Account[] accounts) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;

	}
}
