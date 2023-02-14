package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise5Backend;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Exercise5Backend exBackend = new Exercise5Backend();
		while (true) {
			System.out.println("+------------------------ Menu -------------------+");
			System.out.printf("|%-49s|%n", "1. Thêm mới cán bộ");
			System.out.printf("|%-49s|%n", "2. Tìm kiếm theo họ tên");
			System.out.printf("|%-49s|%n", "3. Hiện thị thông tin về danh sách các cán bộ");
			System.out.printf("|%-49s|%n", "4. Nhập vào tên của cán bộ và delete cán bộ đó");
			System.out.printf("|%-49s|%n", "5. Thoát khỏi chương trình");
			System.out.println("+-------------------------------------------------+");

			int chooseMenu = scanner.nextInt();

			switch (chooseMenu) {
			case 1:
				exBackend.addStaff();
				break;
			case 2:
				exBackend.findByName();
				break;
			case 3:
				exBackend.printListStaff();
				break;
			case 4:
				exBackend.deleteByName();
				break;
			case 5:
				return;
			default:
				System.out.println("Bạn chọn chưa đúng!!!");
				break;
			}

		}

	}
}
