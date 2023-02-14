package com.vti.entity;

public class Worker extends Staff {
	private int rank;

	public Worker() {
		super();
		this.rank = rank;
	}

	public Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}

	// Khai báo Getter và Setter
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Worker [rank=" + rank + ", toString()=" + super.toString() + "]";
	}

}
