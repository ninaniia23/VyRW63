package vti.com.entity;

public class DienThoaiThongMinh extends DienThoaiDiDong {

	@Override
	public void tancong() {
		System.out.println("Ném là vỡ màn hình");
	}

	public void suDung3G() {
		System.out.println("Sử dụng 3G....");
	}

	public void chupHinh() {
		System.out.println("Có thể chụp ảnh...");
	}
}
