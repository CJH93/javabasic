package javaStudy.day5.nestedClassEx;

/*
 * 중첩 인터페이스 : 클래스 내부에 멤버로 선언된 인터페이스를 말함
 * 이렇게 선언하는 이유는 해당 인터페이스가 Outer 의 특정 기능에 긴밀한 관계를 맺도록 하기 위함
 * 이 Outer 는 인터페이스를 구현한 객체를 만들어서 사용하는게 일반적임
 * 
 * 문법 : class Outer { public | default | private [static] interface B }
 */

public class Button {

	private ClickListener clickListener;
	
	public static interface ClickListener {
		void onClick();
	}
	
	public void setclickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 버튼에 클릭 이벤트 메서드를 정의 하는데, 실제 작업은 리스너의 메서드가 수행하도록 함
	public void click() {
		this.clickListener.onClick();
	}
}
