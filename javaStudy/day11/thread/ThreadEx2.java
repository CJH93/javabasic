package javaStudy.day11.thread;

import java.util.Scanner;

/*
 * 스레드를 생성하는 방법은 두 가지가 있음
 * 
 *  1. 스레드 클래스를 상속하는 방법. 상속한 클래스는 그 자체가 스레드임
 *  2. Runnable 인터페이스를 구현하고, Thread 객체에 탑재되는 방법
 *  
 */

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i = 0; i < 1000; i++)
		{
			System.out.print("+");
		}
		System.out.println(Thread.currentThread().getName() + " 종료함");
	}
}

class YourThread implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 1000; i++)
		{
			System.out.print("!");
		}
		System.out.println(Thread.currentThread().getName() + " 종료함");
	}
}

public class ThreadEx2 {
	
	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start();
		
		Thread runnableThread = new Thread(new YourThread());
		runnableThread.start();
		
		Thread threead4 = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i = 0; i < 1000; i++)
			{
				System.out.print("&");
			}
			System.out.println(Thread.currentThread().getName() + " 종료함");
		});
		threead4.start();
		
		for(int i = 0; i < 1000; i++)
		{
			System.out.print("*");
		}
		System.out.println(Thread.currentThread().getName() + " 종료함");
		
		
		
	}

}
