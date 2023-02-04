package vti.com.frontend;

import vti.com.entity.Student;

public class Exercise4 {

	public static void main(String[] args) {
		Exercise4 ex4 = new Exercise4();
		ex4.question1();

	}

	public static void question1() {
		Student stu1 = new Student("Vy Vũ", "Hà Nội");
		stu1.setDiemHocluc(8);
		System.out.println("Thông tin của Student 1:");
		System.out.println(stu1);

	}

}
