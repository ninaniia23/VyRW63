package vti.com.entity;

public class Rectangle {
	private Float a;
	private Float b;

	public Float TinhChuVi() {
		return 2 * (a + b);
	}

	public Float TinhDienTich() {
		return a * b;
	}

	public Rectangle(Float a, Float b) {
		super();
		this.a = a;
		this.b = b;
	}

}
