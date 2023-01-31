package com.java.frontend;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập vào tên bạn");
//		String name = scanner.next();// Dừng chương trình và chờ người dùng nhập vào số nguyên
//		System.out.println("Tên bạn là " + name);
		// sum();
		// minus();
		// main
		while (true) {
			System.out.println("+-----------------Menu-------------------+");
			System.out.println("+----------------------------------------+");
			System.out.printf("|%-40s|%n", "Mời bạn chọn phép tính muốn sử dụng");
			System.out.printf("|%-40s|%n", "2.Tính hiệu                        ");
			System.out.printf("|%-40s|%n", "3.Tính phép nhân                   ");
			System.out.println("+----------------------------------------+");

			int chooseMenu = scanner.nextInt();
			switch (chooseMenu) {
			case 1:
				sum();
				break;
			case 2:
				minus();
				break;
			case 3:

				break;
			default:
				System.out.println("Bạn chọn chưa đúng!!!");
				break;
			}
		}
//      System.out.println("Nhập vào số thứ nhất");
//		int number1 = scanner.nextInt();
//		System.out.println("Nhập vào số thứ 2");
//		int number2 = scanner.nextInt();
//		System.out.println("Result:" + sum_ab(number1, number2));

	}

	public static int sum_ab(int x, int y) {
		int result_sum = x + y;

		return result_sum;

	}

	public static void sum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------Phép cộng-------");
		System.out.println("Nhập vào số thứ nhất");
		int a = scanner.nextInt();
		System.out.println("Nhập vào số thứ 2");
		int b = scanner.nextInt();
		int resultsum = a + b;
		System.out.println("Tổng 2 số là: " + resultsum);
		// scanner.close();
	}

	public static void minus() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------Phép trừ-------");
		System.out.println("Nhập vào số thứ nhất");
		int c = scanner.nextInt();
		System.out.println("Nhập vào số thứ 2");
		int d = scanner.nextInt();
		int resultMinus = c - d;
		System.out.println("Tổng 2 số là: " + resultMinus);
		// scanner.close();
	}
}
