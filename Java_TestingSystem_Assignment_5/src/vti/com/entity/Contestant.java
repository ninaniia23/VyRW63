package vti.com.entity;

public class Contestant {
	private int idNum;
	private String name;
	private String address;
	private int priority;
	private Block block;
	public static int COUNT = 0;

	public Contestant(String name, String address, int priority, Block block) {
		super();
		COUNT++;
		this.idNum = COUNT;
		this.name = name;
		this.address = address;
		this.priority = priority;
		this.block = block;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Contestant [idNum=" + idNum + ", name=" + name + ", address=" + address + ", priority=" + priority
				+ ", block name=" + block.getNameBlock() + " , block subject=" + block.getSubjectBlock() + "]";
	}

}
