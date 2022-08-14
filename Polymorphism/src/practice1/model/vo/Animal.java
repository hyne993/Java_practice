package practice1.model.vo;

public abstract class Animal {
	
	// 필드부
	private String name;
	private String kinds;
	
	// 생성자부
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// 메소드부
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다. ";
	}
	
	public abstract void speak();
	
}
