package vti.com.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private Gender gender;
	private LocalDate birthDate;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person() {
		super();

	}

	public Person(String name, Gender gender, LocalDate birthDate, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}

	public void inputInfor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin Person từ bàn phím: ");
		System.out.println("Tên của Person là");
		this.name = scanner.next();
		System.out.println("Gender : 1.Male, 2. Female, 3.Unknown : ");
		int chooseGender = scanner.nextInt();
		switch (chooseGender) {
		case 1: {
			this.gender = Gender.MALE;
			break;
		}
		case 2: {
			this.gender = Gender.FEMALE;
			break;
		}
		case 3: {
			this.gender = Gender.UNKNOWN;
			break;
		}
		}
		System.out.println("Nhập ngày sinh theo định dạng:yyyy-mm-dd ");
		this.birthDate = LocalDate.parse(scanner.next());
		System.out.println("Địa chỉ của Person là: ");
		this.address = scanner.next();
	}

	public String showInfor() {
		return "Person [name =" + name + " , gender=" + gender + " , birthDate=" + birthDate + " , address=" + address
				+ "]";
	}

}
