package com.java.frontend;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên bạn");
		String name = scanner.next();// Dừng chương trình và chờ người dùng nhập vào số nguyên
		System.out.println("Tên bạn là " + name);
	}
}
