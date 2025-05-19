package javaStudy.day3;

public class Cat extends Animal{
	
	private String name;
	private String breed;
	
	public Cat(String name, String breed) {
		super("고양이");
		this.name = name;
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " 이름은 " + name + " 품종은 " + breed;
	}
	
	@Override
	public void sound() {
		System.out.println("냐옹");	
		
	}
}
