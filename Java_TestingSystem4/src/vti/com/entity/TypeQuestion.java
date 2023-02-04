package vti.com.entity;

public class TypeQuestion {
	public int id;
	public typeQuestionName name;

	public enum typeQuestionName {
		Essay, Multiple_Choice
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public typeQuestionName getName() {
		return name;
	}

	public void setName(typeQuestionName name) {
		this.name = name;
	}

}
