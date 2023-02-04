package vti.com.frontend;

import vti.com.entity.Account;
import vti.com.entity.Group;

public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 ex3 = new Exercise3();
		ex3.question1();
	}

	public static void question1() {
		Account acc1 = new Account();
		acc1.setId(1);
		acc1.setEmail("vyv@gmail.com");
		acc1.setUsername("vyv");
		acc1.setFullname("Vu Ho Yen Vy");

		System.out.println("Thông tin Account 1 là :");
		System.out.println("Id:" + acc1.getId());
		System.out.println("Email:" + acc1.getEmail());
		System.out.println("Username:" + acc1.getUsername());

		System.out.println("--------------------");
		Group gr1 = new Group();
		gr1.setId(1);
		gr1.setName("Alice in BorderLands");

		System.out.println("Thông tin Group 1 là:");
		System.out.println("ID:" + gr1.getId());
		System.out.println("Name:" + gr1.getName());
	}

}
