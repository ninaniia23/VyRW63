package vti.com.entity;

public class Block {
// tạo ra các khối thi
	private String nameBlock;
	private String subjectBlock;

	public Block(String nameBlock) {
		super();
		this.nameBlock = nameBlock;

	}

	public String getNameBlock() {
		return nameBlock;
	}

	public void setNameBlock(String nameBlock) {
		this.nameBlock = nameBlock;
	}

	public String getSubjectBlock() {
		switch (this.nameBlock) {
		case "A": {
			this.subjectBlock = "Toán,Lý,Hóa";
			break;
		}
		case "B": {
			this.subjectBlock = "Toán,Hóa,Sinh";
			break;
		}
		case "C": {
			this.subjectBlock = "Văn,Sử,Địa";
			break;
		}
		}
		return subjectBlock;
	}

	public void setSubjectBlock(String subjectBlock) {
		this.subjectBlock = subjectBlock;
	}

}
