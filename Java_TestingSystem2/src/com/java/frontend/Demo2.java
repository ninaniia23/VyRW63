package com.java.frontend;

public class Demo2 {

	public static void main(String[] args) {
		// if else
		int a = 2;
		// System.out.println("Bạn vừa nhập vào số 1");
		if (a == 2) {
			System.out.println("Bạn vừa nhập vào số 2");
		} else {
			System.out.println("Bạn vừa nhập 1 số");
		}
		int b = 3;
		if (b == 1) {
			System.out.println("Đây là số 1");
		} else if (b == 2) {
			System.out.println("Đây là số 2");
		} else if (b == 3) {
			System.out.println("Đây là số 3");
		} else if (b == 4) {
			System.out.println("Đây là số 4");
		} else if (b == 5) {
			System.out.println("Đây là số 5");
		} else {
			System.out.println("Bạn vừa nhập vào 1 số nào đó");
		}
		// Toán tử tenary, toán tử 3 ngôi => cách viết tắt khi sử dụng if else
		System.out.println(a == 2 ? "Bạn vừa nhập vào số 2" : "Bạn vừa nhập vào 1 số nào đấy");

		// SWITCH CASE
		System.out.println("----------- Switch Case------");
		switch (b) {
		case 1:
			System.out.println("Đây là số 1");
			break;
		case 2:
			System.out.println("Đây là số 2");
			break;
		case 3:
			System.out.println("Đây là số 3");
			break;
		case 4:
			System.out.println("Đây là số 4");
			break;
		case 5:
			System.out.println("Đây là số 5");
			break;
		default:
			System.out.println("Bạn vừa nhập vào 1 số nào đấy");
			break;
		}
		// FOR
		System.out.println("--------------------FOR-----------");
		// Bạn hãy thực hiện in ra màn hình từ 1 đến 3
	}
}
