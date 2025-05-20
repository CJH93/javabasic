package javaStudy.day3;

public class Duck extends Animal{
	
	private String name;
	private String breed;
	
	protected Duck(String name) {
		super("오리");
		this.name = name;
	}
	
	public Duck(String name, String breed) {
		super("오리");
		this.name = name;
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " 이름은 " + name + " 품종은 " + breed;
	}

	@Override
	public void sound() {
		System.out.println("꽥꽥");	
		
	}
	
	// 알 낳는 기능을 정의함
	public void layEggs() {
		System.out.println("오리 알 낳다.");
	}
	
}
