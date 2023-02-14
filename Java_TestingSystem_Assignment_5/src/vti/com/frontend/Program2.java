package vti.com.frontend;

import java.util.Scanner;

import vti.com.backend.Excercise2Java;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Excercise2Java ex2Backend = new Excercise2Java();
		// Excercise 2:
		while (true) {

			System.out.println("+------------------------ Excecise 2 -------------------+");
			System.out.printf("|%-55s|%n", "1.Question 1");
			System.out.printf("|%-55s|%n", "2.Question 2");
			System.out.printf("|%-55s|%n", "3.Question 3");
			System.out.printf("|%-55s|%n", "4.Question 4");
			System.out.printf("|%-55s|%n", "5.Question 5");
			System.out.printf("|%-55s|%n", "6.Bạn đã nhập sai");
			System.out.println("+-------------------------------------------------------+");

			int chooseMenu1 = scanner.nextInt();
			switch (chooseMenu1) {
			case 1: {
				ex2Backend.Question1();
				break;
			}
			case 2: {
				ex2Backend.Question2();
				break;
			}
			case 3: {
				ex2Backend.Question3();
				break;
			}
			case 4: {
				ex2Backend.Question4();
				break;
			}
			case 5: {
				ex2Backend.Question5();
				break;
			}

			default:
				System.out.println("Bạn đã nhập sai");
				break;
			}

		}
	}
}
