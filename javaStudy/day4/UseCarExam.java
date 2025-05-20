package javaStudy.day4;

public class UseCarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car jhCar = new Car();
		
		Tyre myCarTyre = new KumhoTyre(); 
		Tyre jhCarTyre = new HankookTyre();
		
		
		
		// 타이어 객체를 생성해서 생성된 자동차에 세팅
		
//		myCar.tyre = new KumhoTyre();
//		jhCar.tyre = new HankookTyre();
		
		myCar.tyre = myCarTyre;
		jhCar.tyre = jhCarTyre;
		
		myCar.runnning();
		jhCar.runnning();

	}

}
