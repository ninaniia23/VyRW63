
public class Demo {
	public static class Department {
		int id;
		String name;
	}

// hàm main: điểm bắt đầu để chạy chương trình
	public static void main(String[] args) {
		String name = "Nguyễn Đạo";
		System.out.println("Hello VTI");
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "sale";
		System.out.println("ID:" + dep1.id);
		System.out.println("Name:" + dep1.name);
	}
}