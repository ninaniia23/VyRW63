package vti.com.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	private ArrayList<Contestant> listContestants;
	private Scanner scanner;

	public TuyenSinh() {
		super();
		listContestants = new ArrayList<Contestant>();
		scanner = new Scanner(System.in);
	}

	@Override
	public void addContestant() {
		System.out.println("Nhập vào tên thí sinh");
		String name = scanner.next();
		System.out.println("Nhập vào địa chỉ thí sinh");
		String address = scanner.next();
		System.out.println("Nhập vào mức ưu tiên của thí sinh");
		int priority = scanner.nextInt();
		System.out.println("Nhập vào khối thi của thí sinh");
		String block = scanner.next();

		Contestant contestant1 = new Contestant(name, address, priority, new Block(block));
		listContestants.add(contestant1);
	}

	@Override
	public void viewListContestant() {
		for (Contestant contestant : listContestants) {
			System.out.println(contestant);
		}

	}

	@Override
	public void searchbyIDNum(int idNum) {
		for (Contestant contestant : listContestants) {
			if (contestant.getIdNum() == idNum) {
				System.out.println(contestant);
			}
		}

	}

}
