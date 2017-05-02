package fr.eni.bean;

public class Type {

	private int id;
	private EnumType type;
	
	
	
	
	public Type() {
		super();
	}

	public Type(EnumType type) {
		super();
		this.type = type;
	}

	public Type(int id, EnumType type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	public EnumType getType() {
		return type;
	}
	
	public void setType(EnumType type) {
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	
	
}
