package vti.com.entity;

public class Department {
	public int id;
	public String name;

	// Construcotr ==> Hàm khởi tạo
	// Hàm tạo không tham số
	// HÀm tạo không có tham số sẽ được java hỗ trợ mặc định
	// Hàm tạo sẽ không có kiểu dữ liệu trả về
	// Tên của hàm tạo giống tên của class

	// Hàm tạo không có tham số
	public Department() {

		this.id = 1;
		this.name = "Sale";
	}

	// Hàm tạo có tham số
	public Department(int idParam) {
		this.id = idParam;
	}

	// Hàm tạp có 2 tham số
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// phương thức in thông tin phòng ban
	public void toPrintDepartment() {
		System.out.println("Thông tin phòng ban là,id: " + this.id + "    , name" + this.name);

	}

	public String toPrintDepartment2() {
		return "id:  " + this.id + "  ,name : " + this.name;

	}

	public String toString() {
		return "id = " + id + "   ,name:  " + name;
	}

}
