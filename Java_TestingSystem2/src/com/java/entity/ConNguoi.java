package com.java.entity;

public class ConNguoi {
	// khai báo các thuộc tính
	public String name;
	public String mautoc;
	public String maumat;
	public String mauda;

	// khai báo ra phương thức ăn
	public void an() {
		System.out.println(this.name + " có thể ăn");
	}

	public void hoc() {
		System.out.println(this.name + " có thể học");
	}

	// Giới thiệu bản thân
	public void sayinfo() {
		System.out.println("Tên của tôi là: " + this.name);
		System.out.println("Màu da của tôi là: " + this.mauda);
		System.out.println("Màu mắt của tôi là: " + this.maumat);
		System.out.println("Màu tóc của tôi là: " + this.mautoc);
	}

}
