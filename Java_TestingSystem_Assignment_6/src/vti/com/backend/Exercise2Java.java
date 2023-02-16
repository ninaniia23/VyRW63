package vti.com.backend;

import java.util.Scanner;

import vti.com.entity.Department;
import vti.com.frontend.Demo_Exercise2;

public class Exercise2Java {
	Scanner scanner = new Scanner(System.in);

	// Tạo ra 1 menu để chọn bài tập cần
	// Question 1: try catch finally
	public void Question1() {
		System.out.println("Nhập vào số thứ nhất:");
		int number1 = scanner.nextInt();
		System.out.println("Nhập vào số thứ 2:");
		int number2 = scanner.nextInt();
		try {
			System.out.println("Kết quả phép chia 2 số là" + Demo_Exercise2.device(number1, number2));
		} catch (Exception e) {
			System.out.println("Có lỗi khi thực hiện phép tính này");
		}
	}

	// Question 2: Chưa giải được
	public void Question2() {
		System.out.println("Nhập vào số thứ nhất:");
		int number1 = scanner.nextInt();
		System.out.println("Nhập vào số thứ 2:");
		int number2 = scanner.nextInt();
		try {
			System.out.println("Kết quả phép chia 2 số là: " + Demo_Exercise2.device(number1, number2));
		} catch (ArithmeticException e) {
			System.err.print("Có lỗi khi thực hiện chia cho số 0\n");
		} finally {
			System.out.println("");
			System.out.println("divide completed");
		}
	}

	// Question 3:
	public void Question3() {
		int[] ints = { 1, 4, 6 };
		try {
			System.out.println(ints[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("Không tìm thấy phần tử có i=10\n");
		}
	}

	// Question 4:
	public void Question4() {
		Department department1 = new Department("Dep1");
		Department department2 = new Department("Dep2");
		Department department3 = new Department("Dep3");
		Department department4 = new Department("Dep4");
		Department department5 = new Department("Dep5");
		Department[] depArray = { department1, department2, department3, department4, department5 };
		try {
			System.out.println(depArray[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("Không tìm thấy phần tử này \n");
		}
	}

	// Question 5:
	public void Question5() {

	}

	// Question 6:
	public void Question6() {

	}

	// Question 7:
	public void Question7() {

	}

	// Question 8:
	public void Question8() {

	}

	// Question 9:
	public void Question9() {

	}

	// Question 10:
	public void Question10() {

	}

	// Question 11:
	public void Question11() {

	}

	// Question 12:
	public void Question12() {

	}

}
