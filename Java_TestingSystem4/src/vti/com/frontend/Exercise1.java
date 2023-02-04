package vti.com.frontend;

import java.time.LocalDate;

import vti.com.entity.Account;
import vti.com.entity.Department;
import vti.com.entity.Position;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 ex1 = new Exercise1();
		ex1.question1();
		ex1.question2();
	}

	public static void question1() {
		Department dep = new Department();
		Department dep1 = new Department(1);

		System.out.println("Id cua Dep1 la:" + dep1.id);

	}

	public static void question2() {

		Account account1 = new Account();
		Account account2 = new Account(2, "email2", "username2", "fullname2");
		account1.setId(1);
		Position pos3 = new Position();
		Account account3 = new Account(3, "email3", "username3", "fullname3", pos3);
		System.out.println(account3.createDate);

		Position pos4 = new Position();
		Account account4 = new Account(4, "email4", "username4", "fullname4", "firstname1", "lastname1", pos4,
				LocalDate.of(2021, 03, 17));

		System.out.println("Thông tin account1 là:");
		System.out.println("Id: " + account1.getId());

	}

}
