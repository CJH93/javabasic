package javaStudy.day4.quiz;

public class Account {
	
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			System.out.println("입금액은 " + Account.MIN_BALANCE + "원 보다 작거나 " + Account.MAX_BALANCE + "원 보다 크면 안됨");
			return;
		}
			
		this.balance += balance;
	}

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(10000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}
	
	
}
