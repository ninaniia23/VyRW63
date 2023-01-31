package vti.com.frontend;

public class Demo1 {
	public static void main(String[] args) {

		// Datatype - Kiểu dữ liệu
		// int float, char, string,...
		// Integer, float,... ==> Wrapper ==> Ngoài lưu trữ dữ liệu thì còn hỗ trợ các
		// phương thức đi kèm
		// String
		int i1 = 5;
		Integer i2 = 10;

		float f1 = 2.3f;
		Float f2 = 3.4f;

		String s1 = "vyv";
		System.out.println("i2 là:" + i2);
		// --------------------------------
		int i = 5; // Primitive

		// Sử dụng thêm các phương thức của i
		// Integer j = new Integer(i); // Chuyển đổi kiểu dữ liệu Primitive ==> Wrapper
		// Class
		Integer j = i; // 5

		float f = 3.5f;

		// float g = f.floatValue(); // 3.5f

	}
}
