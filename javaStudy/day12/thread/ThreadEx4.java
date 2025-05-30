package javaStudy.day12.thread;
class DoSomeThread extends Thread{
	
	boolean flag = true;
	
	public DoSomeThread() {
		
	}
	@Override
	public void run() {
		while(true) {
			if(flag) {
				System.out.println(Thread.currentThread().getName());
			}else {
				Thread.yield();
			}
		}
	}
}

public class ThreadEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoSomeThread t1 = new DoSomeThread();
		DoSomeThread t2 = new DoSomeThread();
		
		t1.start();
		t2.start();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.flag = false;
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.flag = true;
		
	}

}
