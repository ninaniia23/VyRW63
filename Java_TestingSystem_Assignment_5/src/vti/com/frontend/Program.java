package vti.com.frontend;

import java.util.Scanner;

import vti.com.backend.Excercise1Java;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Excercise1
		Excercise1Java exBackend = new Excercise1Java();

		while (true) {

			System.out.println("+------------------------ Excercise 1 -------------------+");
			System.out.printf("|%-56s|%n", "1.Question 1");
			System.out.printf("|%-56s|%n", "2.Question 2");
			System.out.printf("|%-56s|%n", "3.Bạn đã nhập sai ");
			System.out.println("+--------------------------------------------------------+");

			int chooseMenu = scanner.nextInt();
			switch (chooseMenu) {
			case 1: {
				exBackend.Question1();
				break;
			}
			case 2: {
				exBackend.Question2();
				break;
			}
			default:
				System.out.println("Bạn đã nhập sai");
				break;
			}
		}
	}
}
