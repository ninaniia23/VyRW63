package vti.com.frontend;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 1;
// Exception : Là 1 ngoại lệ xảy ra trong chương trình, và nó sẽ làm phá vỡ đi luồng chuẩn của chương trình
// Exception: Có thể dự đoán trước bởi các lập trình viên( Yo tei)
// Exception: 		

		System.out.println("Kết quả của phép chia 2 số là :" + (a / b));
// Các loại exception phổ biến
// ArithmeticException : Exception liên quan đến các phép toán học
// NullPointerException :Exception liên quan các biến Null
//NumberFormatException: Exception liên quan đến định dạng số
//ArrayIndexOutOfBoundsException: Exception liên quan đến số phần tử trong mảng có thể lưu trữ
		String myName = "vyv"; // .lenghth =>> Tính ra số ký tự trong chuỗi cần tính
		System.out.println("Số ký tự trong tên của bạn là: " + myName.length());

		System.out.println("..........................");

		String s = "123"; // Chuyển đổi chuỗi s sang thành 1 số nguyên
		int i = Integer.parseInt(s);
		System.out.println("Số của bạn vừa chuyển đổi được là:" + i);

		System.out.println("...................");

		String[] nameRailway63 = new String[5];
		nameRailway63[0] = "vyv1";
		nameRailway63[1] = "vyv2";
		nameRailway63[2] = "vyv3";
		nameRailway63[3] = "vyv4";
		nameRailway63[4] = "vyv5";

		nameRailway63[5] = "vyv6";

	}

}
