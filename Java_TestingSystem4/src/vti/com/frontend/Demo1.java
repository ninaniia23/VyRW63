package vti.com.frontend;

import vti.com.entity.Department;

public class Demo1 {

	public static void main(String[] args) {
// Thực hiện tạo ra các phòng ban
// Class tên_biến = new Hàm_tạo
// Constructor: Dùng để tạo ra 1 đối tượng cụ thể: Instance
		// Hàm Constructor được khai báo bên Class
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		System.out.println("Thông tin phòng ban số 1 là,id: " + department1.id);
		System.out.println("Thông tin phòng ban số 1 là,name: " + department1.name);

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";
		System.out.println("Thông tin phòng ban số 2 là,id: " + department2.id);
		System.out.println("Thông tin phòng ban số 2 là,name: " + department2.name);

		Department department3 = new Department(3);
		department3.name = "BOD";
		System.out.println("Thông tin phòng ban số 3 là,id: " + department3.id);
		System.out.println("Thông tin phòng ban số 3 là,name: " + department3.name);

		Department department4 = new Department(4);

		Department department5 = new Department(5, "Kỹ thuật");
		System.out.println("Thông tin phòng ban số 5 là,id: " + department5.id);
		System.out.println("Thông tin phòng ban số 5 là,name: " + department5.name);

		System.out.println(department5.toString());

	}

}
