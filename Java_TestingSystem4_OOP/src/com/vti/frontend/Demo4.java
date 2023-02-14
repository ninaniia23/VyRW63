package com.vti.frontend;

import com.vti.entity.Caculator;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caculator cal = new Caculator();
		System.out.println("Tổng 2 số là : " + cal.addInt(1, 10));

		System.out.println("Tổng 2 số thực là :" + cal.add(0.3f, 0.5f));
		Caculator caculator1 = new Caculator();
	}

}
