package vti.com.entity;

public class Student implements IStudent {
	private int id;
	private String name;
	private int Group;
	private static int COUNT;

	public int getGroup() {
		return Group;
	}

	@Override
	public void diemDanh() {
		System.out.println(name + " điểm danh");
	}

	@Override
	public void hocBai() {
		System.out.println(name + " đang học bài");

	}

	@Override
	public void diDonVeSinh() {
		System.out.println(name + " đi dọn vệ sinh");
	}

	public Student(String name, int group) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		Group = group;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Group=" + Group + "]";
	}

}
