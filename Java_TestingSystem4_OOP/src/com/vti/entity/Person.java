package com.vti.entity;

public class Person implements IPerson {
	// overload
	public int add(int a, int b) {
		return a + b;
	}

	public Float add(Float a, Float b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a, int b, Float c) {
		return (int) (a + b + c);
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	@Override
	public void eat() {
		System.out.println("Ăn");

	}

	@Override
	public void sleep() {
		System.out.println("Ngủ");

	}

	@Override
	public void play() {
		System.out.println("chơi");

	}

	@Override
	public Staff1 tong() {
		// TODO Auto-generated method stub
		return null;
	}

	public Staff1 tong(int a) {
		// TODO Auto-generated method stub
		return null;
	}

}
