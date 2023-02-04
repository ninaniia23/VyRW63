package com.vti.frontend;

import com.vti.entity.Account;

public class Demo1 {
	public static void main(String[] args) {
		Account account1 = new Account();
		// account1.id = 1;
		// account1.email = "vyv@gmail.com";

		account1.setId(1);
		account1.setEmail("vyv@gmail.com");

		System.out.println("Thông tin Account 1 là :  ");
		System.out.println("ID:" + account1.getId());
		System.out.println("Email:" + account1.getEmail());
		System.out.println("Username:" + account1.getUserName());
		System.out.println("Fullname:" + account1.getFullName());
	}
}
