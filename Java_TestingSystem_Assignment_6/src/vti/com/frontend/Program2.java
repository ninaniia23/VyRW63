package vti.com.frontend;

import java.util.Scanner;

import vti.com.backend.Exercise2Java;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Exercise 2:
		Exercise2Java exercise2Java = new Exercise2Java();
		while (true) {

			System.out.println("+------------------------ Excecise 2 -------------------+");
			System.out.printf("|%-55s|%n", "1.Question 1");
			System.out.printf("|%-55s|%n", "2.Question 2");
			System.out.printf("|%-55s|%n", "3.Question 3");
			System.out.printf("|%-55s|%n", "4.Question 4");
			System.out.printf("|%-55s|%n", "5.Question 5");
			System.out.printf("|%-55s|%n", "6.Question 6");
			System.out.printf("|%-55s|%n", "7.Question 7");
			System.out.printf("|%-55s|%n", "8.Question 8");
			System.out.printf("|%-55s|%n", "9.Question 9");
			System.out.printf("|%-55s|%n", "10.Question 10");
			System.out.printf("|%-55s|%n", "11.Question 11");
			System.out.printf("|%-55s|%n", "12.Question 12");
			System.out.printf("|%-55s|%n", "13.Bạn đã nhập sai");
			System.out.println("+-------------------------------------------------------+");

			int chooseMenu = scanner.nextInt();
			switch (chooseMenu) {
			case 1: {
				exercise2Java.Question1();
				break;
			}
			case 2: {
				exercise2Java.Question2();
				break;
			}
			case 3: {
				exercise2Java.Question3();
				break;
			}
			case 4: {
				exercise2Java.Question4();
				break;
			}
			case 5: {
				exercise2Java.Question5();
				break;
			}
			case 6: {
				exercise2Java.Question6();
				break;
			}
			case 7: {
				exercise2Java.Question7();
				break;
			}
			case 8: {
				exercise2Java.Question8();
				break;
			}
			case 9: {
				exercise2Java.Question9();
				break;
			}
			case 10: {
				exercise2Java.Question10();
				break;
			}
			case 11: {
				exercise2Java.Question11();
				break;
			}
			case 12: {
				exercise2Java.Question12();
				break;
			}
			default:
				System.out.println("Bạn đã nhập sai , vui lòng nhập lại");
				break;
			}
		}
	}
}
