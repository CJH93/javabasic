package javaStudy.day3;

public class UseCar {

	public static void main(String[] args) {
		
		// Default car 객체 생성
		Car car1 = new Car("노랑");
		Car car2 = new Car("파랑", "GM USA");
		Car car3 = new Car("Golden", "Hyundai", 2025);
		
		System.out.println(car1.getColor());
		System.out.println(car2.getColor() + car2.getMfg());
		System.out.println("car3의 컬러는 " + car3.getColor() + " 브랜드는 " + car3.getMfg() + " 년식은 " + car3.getMfgYear());
		System.out.println("현재 속도는 " + car3.getSpeed());
		
		// 속도 증가
		car3.accelate(30);
		System.out.println("현재 속도는 " + car3.getSpeed());

	}

}
