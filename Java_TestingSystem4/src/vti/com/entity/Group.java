package vti.com.entity;

import java.time.LocalDate;

public class Group {
	public int id;
	public String name;
	public Account creator;
	public LocalDate createDate;
	public Account[] accounts;

	// khong co param
	public Group() {

	}

	// Có các parameter là GroupName, Creator, array Account[]
	// accounts, CreateDate
	public Group(int id, String name, Account creator, Account[] accounts) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
	}

	// Có các parameter là GroupName, Creator, array String[]
	// usernames , CreateDate
	public Group(int id, String name, String[] usernames, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		// Account

	}
	// Khởi tạo Getter và Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

}
