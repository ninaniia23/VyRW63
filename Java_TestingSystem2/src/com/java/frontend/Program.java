package com.java.frontend;

import java.time.LocalDate;

import com.java.entity.Account;
import com.java.entity.Answer;
import com.java.entity.CategoryQuestion;
import com.java.entity.Department;
import com.java.entity.Exam;
import com.java.entity.Group;
import com.java.entity.Position;
import com.java.entity.Position.PositionName;
import com.java.entity.Question;
import com.java.entity.TypeQuestion;
import com.java.entity.TypeQuestion.typeQuestionName;

public class Program {
	public static void main(String[] args) {

		Group group11 = new Group();
		group11.id = 1;
		group11.name = "Ofhim Cafe";
		group11.createDate = LocalDate.now();

		Group group12 = new Group();
		group12.id = 1;
		group12.name = "Ofhim Cafe";
		group12.createDate = LocalDate.now();

		Group group13 = new Group();
		group13.id = 1;
		group13.name = "Ofhim Cafe";
		group13.createDate = LocalDate.now();

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Test";

		System.out.println("Thông tin phòng ban số 1:");
		System.out.println("Id:" + department1.id);
		System.out.println("Name:" + department1.name);

		System.out.println("Thông tin phòng ban số 2:");
		System.out.println("Id:" + department2.id);
		System.out.println("Name:" + department2.name);
		// POSITION
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.Test;

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin vị trí số 1:");
		System.out.println("Id:" + position1.id);
		System.out.println("Name:" + position1.name);

		System.out.println("Thông tin vị trí số 2:");
		System.out.println("Id:" + position2.id);
		System.out.println("Name:" + position2.name);

		Group[] grs1 = { group11, group12, group13 };
		// ACCOUNT
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "ngxdt@gmail.com";
		account1.userName = "tiennd";
		account1.fullName = "Nguyễn Đức Tiến";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();
		account1.groups = grs1;

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin account số 1: ");
		System.out.println("Id: " + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("userNane: " + account1.userName);
		System.out.println("fullName: " + account1.fullName);
		System.out.println("Department Name: " + account1.department.name);
		System.out.println("Position Name: " + account1.position.name);
		System.out.println("Position Name: " + account1.createDate);
		System.out.println("Group mà Account1 tham gia: ");
		System.out.println(account1.groups[0].name);
		System.out.println(account1.groups[1].name);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "vyv2@gmail.com";
		account2.userName = "vyvy";
		account2.fullName = "Vũ Yến Vy";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.now();

		System.out.println("Thông tin account số 2: ");
		System.out.println("Id: " + account2.id);
		System.out.println("Email: " + account2.email);
		System.out.println("userNane: " + account2.userName);
		System.out.println("fullName: " + account2.fullName);
		System.out.println("Department Name: " + account2.department.name);
		System.out.println("Position Name: " + account2.position.name);
		System.out.println("Position Name: " + account2.createDate);
		// System.out.println("Group mà : " + account2.createDate);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "lalisa@gmail.com";
		account3.userName = "lisa";
		account3.fullName = "Lisa";
		account3.department = department2;
		account3.position = position1;
		account3.createDate = LocalDate.now();

		System.out.println("Thông tin account số 3: ");
		System.out.println("Id: " + account3.id);
		System.out.println("Email: " + account3.email);
		System.out.println("userNane: " + account3.userName);
		System.out.println("fullName: " + account3.fullName);
		System.out.println("Department Name: " + account3.department.name);
		System.out.println("Position Name: " + account3.position.name);
		System.out.println("Position Name: " + account3.createDate);

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "messi@gmail.com";
		account4.userName = "lnmessi";
		account4.fullName = "Messi";
		account4.department = department1;
		account4.position = position2;
		account4.createDate = LocalDate.now();

		System.out.println("Thông tin account số 4: ");
		System.out.println("Id: " + account4.id);
		System.out.println("Email: " + account4.email);
		System.out.println("userNane: " + account4.userName);
		System.out.println("fullName: " + account4.fullName);
		System.out.println("Department Name: " + account4.department.name);
		System.out.println("Position Name: " + account4.position.name);
		System.out.println("Position Name: " + account4.createDate);
		// GROUP
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Ofhim Cafe";
		group1.creator = account1;
		group1.createDate = LocalDate.now();
		Account[] group1Accounts = { account1, account2 };
		group1.accounts = group1Accounts;// null group1.accounts = null; null.lenght loi

//		Account[] acc = {}; // ko co gi
//		group1.accounts = group1Accounts;// rong  group1.accounts = {}// koco ptu nao .lenght =0

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "BlackPink";
		group2.creator = account2;
		group2.createDate = LocalDate.of(2022, 4, 23);
		Account[] group2Accounts = { account1, account3 };
		group2.accounts = group2Accounts;

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Argentina";
		group3.creator = account4;
		group3.createDate = LocalDate.of(2022, 4, 23);
		Account[] group3Accounts = { account2, account4 };
		group2.accounts = group3Accounts;

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin group số 1: ");
		System.out.println("Id:" + group1.id);
		System.out.println("Name:" + group1.name);
		System.out.println("Creator Name:" + account1.fullName);
		System.out.println("Create Date" + group1.createDate);

		System.out.println("Thông tin group số 2: ");
		System.out.println("Id: " + group2.id);
		System.out.println("Name: " + group2.name);
		System.out.println("Creator Name: " + account3.fullName);
		System.out.println("Create Date: " + group2.createDate);

		System.out.println("Thông tin group số 3: ");
		System.out.println("Id: " + group3.id);
		System.out.println("Name: " + group3.name);
		System.out.println("Creator Name: " + account4.fullName);
		System.out.println("Create Date: " + group3.createDate);

		// gán group vào account
		Group[] account1Groups = new Group[2];
		account1Groups[0] = group1;
		account1Groups[1] = group2;
		account1.groups = account1Groups;

		Group[] account2Groups = new Group[1];
		account2Groups[0] = group1;
		account2.groups = account2Groups;

		Group[] account3Groups = new Group[1];
		account3Groups[0] = group2;
		account3.groups = account3Groups;

		Group[] account4Groups = new Group[1];
		account4Groups[0] = group3;
		account4.groups = account4Groups;
		// TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = typeQuestionName.Essay;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = typeQuestionName.Multiple_Choice;

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin type question số 1: ");
		System.out.println("Id: " + typeQuestion1.id);
		System.out.println("Name: " + typeQuestion1.name);

		System.out.println("Thông tin type question số 2: ");
		System.out.println("Id: " + typeQuestion2.id);
		System.out.println("Name: " + typeQuestion2.name);

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "SQL";

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin category question số 1: ");
		System.out.println("Id: " + categoryQuestion1.id);
		System.out.println("Name: " + categoryQuestion1.name);

		System.out.println("Thông tin category question số 2: ");
		System.out.println("Id: " + categoryQuestion2.id);
		System.out.println("Name: " + categoryQuestion2.name);

		Question question1 = new Question();
		question1.id = 1;
		question1.content = "SQL là gì?";
		question1.categoryQuestion = categoryQuestion2;
		question1.typeQuestion = typeQuestion2;
		question1.account = account3;
		question1.createDate = LocalDate.of(2022, 4, 23);

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Mục đích của ngôn ngữ Java?";
		question2.categoryQuestion = categoryQuestion1;
		question2.typeQuestion = typeQuestion1;
		question2.account = account1;
		question2.createDate = LocalDate.of(2022, 5, 14);

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin  question số 1: ");
		System.out.println("Id: " + question1.id);
		System.out.println("Name: " + question1.content);
		System.out.println("TypeId: " + typeQuestion2.id);
		System.out.println("CategoryID: " + categoryQuestion2.id);
		System.out.println("Creator: " + account3.fullName);
		System.out.println("CreateDate: " + question1.createDate);

		System.out.println("Thông tin  question số 2: ");
		System.out.println("Id: " + question2.id);
		System.out.println("Name: " + question2.content);
		System.out.println("TypeId: " + typeQuestion1.id);
		System.out.println("CategoryID: " + categoryQuestion1.id);
		System.out.println("Creator: " + account1.fullName);
		System.out.println("CreateDate: " + question2.createDate);

// Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "SQL là 1 dạng ngôn ngữ truy vấn...";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Java dùng để cho phép các nhà phát triển ứng dụng viết một lần, chạy ở mọi nơi";
		answer2.question = question2;
		answer2.isCorrect = false;

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin  answer số 1: ");
		System.out.println("Id: " + answer1.id);
		System.out.println("Content: " + answer1.content);
		System.out.println("QuestionId: " + question1.id);
		System.out.println("isCorrect: " + answer1.isCorrect);

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin  answer số 2: ");
		System.out.println("Id: " + answer2.id);
		System.out.println("Content: " + answer2.content);
		System.out.println("QuestionId: " + question2.id);
		System.out.println("isCorrect: " + answer2.isCorrect);

		// Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "JV001";
		exam1.title = "Chủ đề về Java";
		exam1.categoryQuestion = categoryQuestion2;
		exam1.duration = 100;
		exam1.creator = account2;
		exam1.createDate = LocalDate.of(2023, 1, 1);

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "SQ001";
		exam2.title = "Chủ đề về SQL";
		exam2.categoryQuestion = categoryQuestion1;
		exam2.duration = 60;
		exam2.creator = account4;
		exam2.createDate = LocalDate.of(2023, 1, 4);

		System.out.println("-------------------------------- ");
		System.out.println("Thông tin  exam số 1: ");
		System.out.println("Id: " + exam1.id);
		System.out.println("Mã đề thi: " + exam1.code);
		System.out.println("Tiêu đề:  " + exam1.title);
		System.out.println("Category Name " + categoryQuestion2.name);
		System.out.println("Thời gian làm bài: " + exam1.duration);
		System.out.println("Creator: " + account2.fullName);
		System.out.println("CreateDate: " + exam1.createDate);

		System.out.println("Thông tin  exam số 2: ");
		System.out.println("Id: " + exam2.id);
		System.out.println("Mã đề thi: " + exam2.code);
		System.out.println("Tiêu đề:  " + exam2.title);
		System.out.println("Category Name " + categoryQuestion1.name);
		System.out.println("Thời gian làm bài: " + exam2.duration);
		System.out.println("Creator: " + account4.fullName);
		System.out.println("CreateDate: " + exam2.createDate);

		// if else
		// Question1
		System.out.println("----------------------------------");
		System.out.println("QUESTION 1: Kiểm tra Account thứ 2");
		if (account2.department == null) {
			System.out.println(" Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.name);
		}
		// Question2
		System.out.println("----------------------------------");
		System.out.println("Question 2:Kiểm tra account thứ 2");
		if (account2.groups == null) {
			System.out.println(" Nhân viên này chưa tham gia group nào");

		} else {
			int countGroup = account2.groups.length;
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (countGroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (countGroup >= 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}

		}
		// Question 3:
		System.out.println("----------------------------------");
		System.out.println("QUESTION 3: Dùng ternary để làm question 1");
		System.out.println(account2.department == null ? " Nhân viên này chưa có phòng ban "
				: "Phòng ban của nhân viên này là" + account2.department.name);
		// Question 4:
		System.out.println("----------------------------------");
		System.out.println("QUESTION 4: Dùng ternary");
		System.out.println(
				account1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
		// Question 5:
		// đếm số lượng account trong group1
		System.out.println("----------------------------------");
		System.out.println("Question 5");
		int countAccountInGroup1 = group1.accounts.length;// null.length sai

		if (group1.accounts == null) {
			System.out.println("Nhóm chưa có thành viên");
		} else {
			switch (countAccountInGroup1) {
			case 1:
				System.out.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
			case 0:
				System.out.println("Nhóm có 0 thành viên");
				break;
			default:
				System.out.println("Nhóm có  nhiều thành viên");
				break;
			}
		}
		// Question 6:
		System.out.println("----------------------------------");
		System.out.println("Question 6");
		int CountGroupOfAccount2 = account2.groups.length;
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			switch (CountGroupOfAccount2) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;

			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}

		}
		// Question 7
		System.out.println("----------------------------------");
		System.out.println("Question 7");
		if (account1.position.name == null) {
			System.out.println("Nhân viên chưa có vị trí");
		} else {
			String positionName = account1.position.name.toString();
			switch (positionName) {
			case "Dev":
				System.out.println("Đây là Developer");
				break;
			default:
				System.out.println("Người này không phải là Developer");
				break;

			}
		}
		// Question 8
		System.out.println("----------------------------------");
		System.out.println("Question 8");
		Account[] accArray = { account1, account2, account3 };
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName);
		}
		// Question 9:
		System.out.println("----------------------------------");
		System.out.println("Question 9");
		Department[] DepArray = { department1, department2 };
		for (Department department : DepArray) {
			System.out.println("DepartmentID: " + department.id + " Name: " + department.name);
		}
		// Question 10:
		System.out.println("----------------------------------");
		System.out.println("Question 10");
		Account[] acc1 = { account1, account2, account3, account4 };
		for (int i = 0; i <= acc1.length - 1; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + acc1[i].email);
			System.out.println("Full Name: " + acc1[i].fullName);
			System.out.println("Department " + acc1[i].department.name);
		}
		// Question 11:
		System.out.println("----------------------------------");
		System.out.println("Question 11");
		Department[] dep1 = { department1, department2 };
		for (int i = 0; i <= dep1.length - 1; i++) {
			System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là:");
			System.out.println("Id: " + dep1[i].id);
			System.out.println("Name: " + dep1[i].name);
		}
		// Question 12:
		System.out.println("----------------------------------");
		System.out.println("Question 12");
		Department[] dep2 = { department1, department2, department3 };
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là:");
			System.out.println("Id: " + dep2[i].id);
			System.out.println("Name: " + dep2[i].name);
		}
		// Question 13:
		System.out.println("----------------------------------");
		System.out.println("Question 13");
		Account[] acc2 = { account1, account2, account3, account4 };
		for (int i = 0; i <= acc1.length - 1; i++) {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + acc1[i].email);
				System.out.println("Full Name: " + acc1[i].fullName);
				System.out.println("Department " + acc1[i].department.name);
			}

		}
		// Question 14:
	}
}