package com.java.frontend;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("DEMO!!");
//	Tạo biến để lưu thông tin của các bạn học viên trong lớp
//	String name1 = "Chinh";
//	String name2 = "Nam";
//	String name3 = "Công";
//	String name4 = "Trường";

//	Array: Mảng dữ liệu ==> Lưu trữ nhiều dữ liệu mà có tương đồng về kiểu
//	Khai báo 1 mảng dùng để lưu trữ tên của các bạn học viên
//	Cách 1:
		String[] nameRailway63s = new String[4];
//	Đưa phần tử vào trong mảng
		nameRailway63s[0] = "Chinh";
		nameRailway63s[1] = "Nam";
		nameRailway63s[2] = "Chinh";
		nameRailway63s[3] = "Trường";
//	nameRailway63s[4] = "Cát";
//		Lấy dữ liệu trong mảng để sử dụng
		System.out.println("Phần tử đang lưu trong mảng: ");
		System.out.println("Phần tử đầu tiên: " + nameRailway63s[0]);
		System.out.println("Phần tử tiếp theo: " + nameRailway63s[1]);

//	Cách 2: 
		System.out.println("-----------------------------------");
		String[] nameRailway63_2s = { "Chinh", "Phương", "Phong" };
		System.out.println("Phần tử 0: " + nameRailway63_2s[0]);
		System.out.println("Phần tử 1: " + nameRailway63_2s[1]);
		System.out.println("Phần tử 2: " + nameRailway63_2s[2]);
	}
}
