package javaStudy.day11.thread;

import java.util.Scanner;

class InputThread implements Runnable {
	Scanner sc = null;
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("하고 싶은 말?");
		sc.next();
	}
}

public class ThreadEx1 {
	
//	static void getInput() {
//		System.out.println("ID 입력");
//		new Scanner(System.in).next(); 
		// next 는 사용자의 입력을 enter 기준으로 프로그램 내로 input 해주는 메서드
		// 즉 enter 가 들어올때까지 대기
		
//	}
	
	static void recieve() {
		System.out.println("친구로부터 메시지 도착");
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread inputTread = new Thread(new InputThread());
		inputTread.start();
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i < 10; i++)
		{
			Thread.sleep(1000);
			recieve();
		}
		
		System.out.println("메인메서드 종료");

	}

}
