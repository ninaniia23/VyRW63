package vti.com.backend;

import java.time.LocalDate;

import vti.com.entity.Account;
import vti.com.entity.Position;

public class Exercise1 {
	public static void main() {

	}

	public static void question2() {

		Account account1 = new Account();
		Account account2 = new Account(2, "email2", "username2", "fullname2");
		Position pos3 = new Position();
		Account account3 = new Account(3, "email3", "username3", "fullname3", pos3);
		System.out.println(account3.createDate);

		Position pos4 = new Position();
		Account account4 = new Account(4, "email4", "username4", "fullname4", "firstname1", "lastname1", pos4,
				LocalDate.of(2021, 03, 17));

	}

	public static void question3() {

	}
}
