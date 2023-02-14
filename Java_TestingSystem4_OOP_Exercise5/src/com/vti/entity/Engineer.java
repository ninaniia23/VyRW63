package com.vti.entity;

public class Engineer extends Staff {
	String specialized;

	public Engineer() {
		super();

	}

	public Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		this.specialized = specialized;

	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	@Override
	public String toString() {
		return "Engineer [specialized=" + specialized + ", toString()=" + super.toString() + "]";
	}

}
