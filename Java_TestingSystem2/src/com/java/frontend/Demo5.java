package com.java.frontend;

import com.java.entity.ConNguoi;

public class Demo5 {

	public static void main(String[] args) {
		ConNguoi connguoi1 = new ConNguoi();
		connguoi1.name = "Vy";
		connguoi1.mautoc = "Đen";
		connguoi1.maumat = "Đen";
		connguoi1.mauda = "Trắng";

		ConNguoi connguoi2 = new ConNguoi();
		connguoi2.name = "Ben";
		connguoi2.mautoc = "Nâu";
		connguoi2.maumat = "Nâu";
		connguoi2.mauda = "Trắng";

		connguoi1.an();
		connguoi2.an();

		connguoi1.hoc();

		System.out.println("----------------------------");
		System.out.println("Bạn hãy giới thiệu về bản thân");
		connguoi1.sayinfo();
		connguoi2.sayinfo();
	}
}
