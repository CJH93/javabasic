package javaStudy.day12.thread;
class Calculator{
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	/*
	 * 동기화 작업 : 하나 이상의 쓰래드가 공유객체의 공유 멤버필드를 접근할때
	 * 특정 쓰래드가 공유 객체를 점유하면, run() 이 모두 종료될때까지 다른 쓰래드가 점유를 할수 없도록 만드는 작업을 뜻함
	 * 동기화 하는 방법은 2가지 인데,
	 * 1.메서드의 리턴타입 앞에 synchronized 라는 키워드를 사용하는 방법
	 * 2.동기화가 필요한 필드를 동기화 블락으로 선언하는 방법이 있다.
	 */
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	public  void setMemory2(int memory) {
		
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
class MyThread extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		this.calculator.setMemory(50);
	}
}
class YourThread extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		this.calculator.setMemory2(100);
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		MyThread myT = new MyThread();
		myT.setCalculator(calculator);
		myT.start();
		
		YourThread yourT = new YourThread();
		yourT.setCalculator(calculator);
		yourT.start();
	}

}



