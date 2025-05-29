package javaStudy.day11.thread;

import lombok.Data;

@Data
class SumThread extends Thread {
	private long sum;
	
	@Override
	public void run() {
		for(int i = 0; i <= 100; i++)
		{
			sum += i;
		}
	}
}

public class ThreadEx3 {

	public static void main(String[] args) {
		
		SumThread t = new SumThread();
		t.start();
		// join() : 호출된 스레드가 작업이 끝날때까지 호출한 스레드가 일시정지 상태에 머무르고
		// 스레드가 작업이 완료되면 interupt 예외를 발생시켜
		// 깨운 후 다시 Runnable 상태로 되돌리게 하는 메서드
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100 까지의 합 : " + t.getSum());
		
	}
	
}
