package com.vti.entity;

public class Caculator {

	private int a;
	private int b;

	public Caculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	// Tính tổng 2 số nguyên
	public int addInt(int aInput, int bInput) {
		int sum = aInput + bInput;

		return sum;
	}

	// Tính tổng 2 số thực
	public float add(float aInput, float bInput) {
		float sum = aInput + bInput;
		return sum;

	}

	// Tính tổng 2 số double
	public Double add(Double aInput, Double bInput) {
		Double sum = aInput + bInput;
		return sum;
	}
}
