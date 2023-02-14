package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Engineer;
import com.vti.entity.Gender;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class Exercise5Backend {
// Khởi tạo ArrayList
	private ArrayList<Staff> staffList = new ArrayList<Staff>();

	private Scanner scanner = new Scanner(System.in);

// Phương thức thêm mới nhân viên
	public void addStaff() {
		System.out.println("Thêm mới nhân viên");
		// Chia ra các trường hợp
		// 1. Thêm worker
		// 2. Thêm Engineer
		// 3.Thêm Employee
		System.out.println("+---------------Bạn muốn thêm đối tượng nào-------------+");
		System.out.printf("|%-56s|%n", "1.Thêm Worker");
		System.out.printf("|%-56s|%n", "2.Thêm Engineer");
		System.out.printf("|%-56s|%n", "3.Thêm Employee");
		System.out.printf("|%-56s|%n", "4. Thoát khỏi chương trình");
		System.out.println("+--------------------------------------------------------+");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Thêm Worker");
			System.out.println("Nhập vào tên Worker");
			String nameInput = scanner.next();

			System.out.println("Nhập vào tuổi Worker");
			int ageInput = scanner.nextInt();

			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female ,3.Unknown");
			int chooseGender = scanner.nextInt(); // 1 || 2 || 3
			Gender genderInput = null;
			switch (chooseGender) {
			case 1:
				genderInput = Gender.Male;
				break;

			case 2:
				genderInput = Gender.Female;
				break;

			case 3:
				genderInput = Gender.Unknown;
				break;

			}
			System.out.println("Nhập địa chỉ Worker");
			String addressInput = scanner.next();

			System.out.println("Nhập cấp bậc Worker");
			int rankInput = scanner.nextInt();

			// Tạo ra 1 đối tượng Worker
			Worker worker = new Worker();
			worker.setName(nameInput);
			worker.setAge(ageInput);
			worker.setAddress(addressInput);
			worker.setRank(rankInput);
			worker.setGender(Gender.Female);

			staffList.add(worker);
			break;

		// Staff worker1 = new Worker(nameInput, ageInput, genderInput, addressInput,
		// rankInput);

		case 2:
			System.out.println("Thêm Engineer");
			System.out.println("Nhập tên Engineer");
			String nameInput1 = scanner.next();

			System.out.println("Nhập tuổi Engineer");
			int ageInput1 = scanner.nextInt();

			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female ,3.Unknown");
			int chooseGender1 = scanner.nextInt();
			Gender genderInput1 = null;
			switch (chooseGender1) {
			case 1:
				genderInput1 = Gender.Male;
				break;
			case 2:
				genderInput1 = Gender.Female;
				break;
			case 3:
				genderInput1 = Gender.Unknown;
				break;
			}

			System.out.println("Nhập địa chỉ Engineer");
			String addressInput1 = scanner.next();

			System.out.println("Nhập chuyên ngành Enginner");
			String specializedInput1 = scanner.next();

			// Tạo ra đối tượng Engineer
			Engineer engineer = new Engineer();
			engineer.setName(nameInput1);
			engineer.setAge(ageInput1);
			engineer.setGender(null);
			engineer.setAddress(addressInput1);
			engineer.setSpecialized(specializedInput1);

			staffList.add(engineer);

			break;
		case 3:
			System.out.println("Thêm Employee");
			System.out.println("Nhập tên Employee");
			String nameInput2 = scanner.next();

			System.out.println("Nhập tuổi Employee");
			int ageInput2 = scanner.nextInt();

			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female ,3.Unknown");
			int chooseGender2 = scanner.nextInt();
			Gender genderInput2 = null;
			switch (chooseGender2) {
			case 1:
				genderInput2 = Gender.Male;
				break;
			case 2:
				genderInput2 = Gender.Female;
				break;
			case 3:
				genderInput2 = Gender.Unknown;
				break;
			}

			System.out.println("Nhập địa chỉ Employee");
			String addressInput2 = scanner.next();

			System.out.println("Nhập vào công việc Employee ");
			String taskInput = scanner.next();

			// Tạo ra đối tượng Employee
			Employee employee = new Employee();
			employee.setName(nameInput2);
			employee.setAge(ageInput2);
			employee.setAddress(addressInput2);
			employee.setGender(null);
			employee.setTask(taskInput);

			staffList.add(employee);
			break;
		}

	}

	// Phương thức tìm kiếm nhân viên
	public void findByName() {
		System.out.println("Tìm kiếm nhân viên");
		System.out.println("Mời bạn nhập vào tên của nhân viên cần tìm :");
		String nameFind = scanner.next();
		// Từ tên của người dùng nhập tìm trong staffList những nhân viên có tên
		// equals : dùng để so sánh chuỗi thay thế --
		for (Staff staff : staffList) {
			if (staff.getName().equals(nameFind)) {
				System.out.println(staff.toString());

			}
		}
	}

// Phương thức hiển thị dsach nvien printListStaff()
	public void printListStaff() {
		System.out.println("Hiển thị danh sách nhân viên");
		// Sử dụng Iterator để duyệt mảng
		Iterator<Staff> iterator = staffList.iterator();
		// hasNext() : Nếu còn phần tử thì trả về true
		while (iterator.hasNext()) {
			Staff staff = iterator.next(); // trả về 1 phần tử trong mảng

			System.out.println(staff.toString());
		}
	}

// Phương thức nhập tên và delete
	public void deleteByName() {
		System.out.println("Xóa nhân viên");
		System.out.println("Mời bạn nhập vào tên nhân viên cần xóa");
		String nameDelete = scanner.next();

		Iterator<Staff> iterator = staffList.iterator();
		while (iterator.hasNext()) {
			Staff staff = iterator.next(); // Trả về 1 phần tử trong mảng
			if (staff.getName().equals(nameDelete)) {
				iterator.remove();

			}
		}

	}
}
