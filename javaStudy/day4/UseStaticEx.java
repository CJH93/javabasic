package javaStudy.day4;

class Calculator {
	
	// static 블락 : 클래스가 로드 되면서 제일 먼저 호출되는 블락.
	// static 변수, 메서드 보다 더 먼저 호출됨.
	public static final int V1;
	public static final int V2;
	
	static { // static 블락 우선
		V1 = 1;
		V2 = 2;
	}
	
	// static final : 일반적으로 공유 목적의 상수를 선언할때 자바에서는 static final 을 사용
	// 접근제어자는 public 이 일반적
	// 이 때 변수의 이름을 모두 대문자로 주는게 일반적임
	// static final 은 값 변경 금지, 사용시엔 class 로 접근
	int a;
	
	public static final double LOAN_RATE = 0.04;
	
	static double pi = Math.PI;
	
	static int plus(int x, int y) {
		// this.a;  // static 에서는 this 사용 불가
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}

class LoanAcc {
	String accNo;
	int loan_Money;
	
	public double calLoanInterest() { // 년 이자 금액 확인하기
		return this.loan_Money * Calculator.LOAN_RATE;
	}
}

public class UseStaticEx {

	public static void main(String[] args) {
		double res1 = 10 * 10 * Calculator.pi;
		int res2 = Calculator.plus(10, 1);
		int res3 = Calculator.minus(10, 1);
		
		System.out.println(res1 + " : " + res2 + " : " + res3);
		
		// 1000 만원의 이자금액을 알아봅시다.
		LoanAcc myLoan = new LoanAcc();
		myLoan.loan_Money = 10000000;
		
		double theInterest = myLoan.calLoanInterest();
		System.out.println("천만원의 이자금액 " + theInterest);
				
	}

}
