package vti.com.frontend;

public class Demo2 {

	public static void main(String[] args) {
//     Datatype Casting  ==>> Ép kiểu dữ liệu
//     byte short int long float double

		float f = 1003.40f;
//  ==> làm tròn lương : int
//  ==> ép kiểu dữ liệu float => int
		int i = (int) f;

		System.out.println("Số i:" + i);

		int i1 = 135546;
		short i2 = (short) i1;
		byte b1 = (byte) i1;
		System.out.println("Số i2: " + i2);

	}

}
