package vti.com.backend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import vti.com.entity.MyMath;
import vti.com.entity.Person;
import vti.com.entity.Square;
import vti.com.entity.Student;
import vti.com.entity.Student_Person;

public class Excercise2Java {
	private ArrayList<Student> listStudents;
	private Random random;
	private Scanner scanner = new Scanner(System.in);
	private Square square;
	MyMath myMath = new MyMath();

	// Tạo ra menu để chọn bài tập cần làm
	// Question1
	public Excercise2Java() {
		listStudents = new ArrayList<Student>();
		random = new Random();

	}

	public void Question1() {
		loadMenu();
	}

	private void loadMenu() {
		System.out.println("=======================================================================");
		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
		System.out.println("===              1. Tạo danh sách sinh viên.                        ===");
		System.out.println("===              2. Hiển thị danh sách sinh viên trong lớp.         ===");
		System.out.println("===              3. Điểm danh lớp .                                 ===");
		System.out.println("===              4. Gọi nhóm 1 đi học bài.                          ===");
		System.out.println("===              5. Gọi nhóm 2 đi dọn vệ sinh.                      ===");
		System.out.println("===              6. Exit                                            ===");
		System.out.println("=======================================================================");
		int chooseMenu = scanner.nextInt();
		switch (chooseMenu) {
		case 1: {
			initStudent();
			System.out.println("Tạo thành công 10 sinh viên.");

			break;
		}
		case 2: {
			System.out.println("Hiển thị danh sách sinh viên trong lớp");
			for (Student student : listStudents) {
				System.out.println(student);
			}
			break;
		}
		case 3: {
			System.out.println("Cả lớp điểm danh:  ");
			for (Student student : listStudents) {
				student.diemDanh();
			}
			break;
		}
		case 4: {
			System.out.println("Nhóm 1 đi học bài: ");
			for (Student student : listStudents) {
				if (student.getGroup() == 1) {
					student.hocBai();
				}
			}
			break;
		}
		case 5: {
			System.out.println("Nhóm 2 đi dọn vệ sinh: ");
			for (Student student : listStudents) {
				if (student.getGroup() == 2) {
					student.diDonVeSinh();
				}
			}
			break;
		}
		case 6: {
			return;
		}
		default: {
			System.out.println("Alarm: Bạn đã nhập sai, vui lòng chọn lại");
			break;
		}
		}

	}

	private void initStudent() {
		for (int i = 0; i < 10; i++) {
			Student student = new Student("Student" + (i + 1), random.nextInt(3) + 1);
			listStudents.add(student);
		}
	}

	// Question2
	public void Question2() {
		loadMenu2();
	}

	private void loadMenu2() {
		System.out.println("=======================================================================");
		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
		System.out.println("===              1. Demo Person.                                    ===");
		System.out.println("===              2. Demo Student.                                   ===");
		System.out.println("===              3. Exit                                            ===");
		System.out.println("=======================================================================");
		int chooseMenu = scanner.nextInt();
		switch (chooseMenu) {
		case 1: {
			System.out.println("Demo Person");
			demoPerson();
			break;

		}
		case 2: {
			System.out.println("Demo Student");
			demoStudent();
			break;
		}
		}
	}

	private void demoPerson() {
		Person person = new Person();
		person.inputInfor();
		System.out.println("Thông tin Person vừa nhập vào là: ");
		System.out.println(person.showInfor());
	}

	private void demoStudent() {
		Student_Person student = new Student_Person();
		student.inputInfor();
		System.out.println("Thông tin Student vừa nhập vào: ");
		System.out.println(student.showInfor());
		if (student.Scholarship()) {
			System.out.println("Sinh viên này có học bổng");
		} else {
			System.out.println("Sinh viên này không có học bổng");
		}
	}

	// Question3
	public void Question3() {
		loadMenu3();
	}

	private void loadMenu3() {
		System.out.println("=======================================================================");
		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
		System.out.println("===              1. Tạo hình vuông.                                 ===");
		System.out.println("===              2. Tính chu vi.                                    ===");
		System.out.println("===              3. Tính diện tích.                                 ===");
		System.out.println("===              4. Exit                                            ===");
		System.out.println("=======================================================================");
		int chooseMenu1 = scanner.nextInt();
		switch (chooseMenu1) {
		case 1: {
			System.out.println("Tạo hình vuông");
			System.out.println("Nhập vào cạnh hình vuông");
			Float a = scanner.nextFloat();
			square = new Square(a);
			System.out.println("Bạn vừa tạo thành công hình vuông có cạnh là " + a);
			break;

		}
		case 2: {
			System.out.println("Chu vi hình vuông là:" + square.TinhChuVi());

			break;
		}
		case 3: {
			System.out.println("Diện tích hình vuông là: " + square.TinhDienTich());
			break;
		}
		case 4:
			return;
		default: {
			System.out.println("Bạn đã nhập sai");
			break;
		}
		}
	}

	// Question4
	public void Question4() {
		loadMenu4();
	}

	public void loadMenu4() {
		while (true) {
			System.out.println("=======================================================================");
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
			System.out.println("===              1. Tính tổng 2 số kiểu int.                        ===");
			System.out.println("===              2. Tính tổng 2 số kiểu byte.                       ===");
			System.out.println("===              3. Tính tổng 2 số kiểu Float.                      ===");
			System.out.println("===              4. Tính tổng 2 số kiểu int và float.               ===");
			System.out.println("===              5. Tính tổng 2 số kiểu Byte và float.              ===");
			System.out.println("===              6. Exit.                                           ===");
			System.out.println("=======================================================================");
			int chooseMenu = scanner.nextInt();
			switch (chooseMenu) {
			case 1: {
				System.out.println("Tính tổng 2 số kiểu Int");
				System.out.println("Nhập vào số int 1: ");
				int intparam1 = scanner.nextInt();
				System.out.println("Nhập vào số int 2: ");
				int intparam2 = scanner.nextInt();
				System.out.println("Tổng 2 số là : " + myMath.getSum(intparam1, intparam2));
				break;
			}
			case 2: {
				System.out.println("Tính tổng 2 số kiểu byte");
				System.out.println("Nhập vào số byte 1: ");
				Byte byteparam1 = scanner.nextByte();
				System.out.println("Nhập vào số byte 2: ");
				Byte byteparam2 = scanner.nextByte();
				System.out.println("Tổng 2 số là : " + myMath.getSum(byteparam1, byteparam2));
				break;
			}
			case 3: {
				System.out.println("Tính tổng 2 số kiểu Float");
				System.out.println("Nhập vào số float 1: ");
				Byte floatparam1 = scanner.nextByte();
				System.out.println("Nhập vào số float 2: ");
				Byte floatparam2 = scanner.nextByte();
				System.out.println("Tổng 2 số là : " + myMath.getSum(floatparam1, floatparam2));
				break;
			}
			case 4: {
				System.out.println("Tính tổng 2 số kiểu int và Float");
				System.out.println("Nhập vào số int 1: ");
				int intparam1 = scanner.nextInt();
				System.out.println("Nhập vào số float 2: ");
				Float floatparam1 = scanner.nextFloat();
				System.out.println("Tổng 2 số là : " + myMath.getSum(intparam1, floatparam1));
				break;
			}
			case 5: {
				System.out.println("Tính tổng 2 số kiểu Byte và Float");
				System.out.println("Nhập vào số byte 1: ");
				Byte byteparam1 = scanner.nextByte();
				System.out.println("Nhập vào số float 2: ");
				Float floatparam1 = scanner.nextFloat();
				System.out.println("Tổng 2 số là : " + myMath.getSum(byteparam1, floatparam1));
				break;
			}
			}

		}
	}

	// Question5
	public void Question5() {
//Điện thoại di động được chia thành 2 loại: điện thoại cổ điển và điện 
//		thoại thông minh. Cả 2 loại điện thoại này đều có 4 chức năng cơ bản: 
//			nghe và gọi điện thoại, gửi và nhận tin nhắn văn bản. Riêng điện thoại 
//			thông minh thì có thêm các chức năng: sử dụng 3G, chụp hình. Điện 
//			thoại cổ điển có sẵn chức năng nghe đài radio (điện thoại thông minh 
//			không có sẵn chức năng này). Cả điện thoại cổ điển và điện thoại 
//			thông minh đều có thể sử dụng làm vũ khí
//			(trong tình huống người dùng cần sử dụng để tấn công kẻ xấu).
//			Hãy thiết kế các class, interface, method

	}
}
