package vti.com.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diemHocluc;

	public float getDiemHocluc() {
		return diemHocluc;
	}

	public void setDiemHocLuc(float diemHocLuc) {
		this.diemHocluc = diemHocluc;
	}

	// cau b:
	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diemHocluc = (float) 0;
	}

	// cau c:
	public void setDiemHocluc(float diemHocluc) {
		this.diemHocluc = diemHocluc;
	}

	// cau d:
	public void plusDiemHocLuc(float diemHocluc) {
		this.diemHocluc = diemHocluc + diemHocluc;
	}

	// câu e:
	public String toString() {
		String hocLuc = null;
		if (this.diemHocluc < 4.0) {
			hocLuc = "Yếu";
		} else if (this.diemHocluc < 6.0) {
			hocLuc = "Trung Bình";
		} else if (this.diemHocluc < 8.0) {
			hocLuc = "Khá";
		} else {
			hocLuc = "Giỏi";
		}
		return "Student : id=" + id + ", name=" + name + ", hometown=" + hometown + ", diemHocluc=" + diemHocluc
				+ ",Xếp loại=" + hocLuc;

	}

	public void study() {
		System.out.println("Student is studying....");
	}
}
