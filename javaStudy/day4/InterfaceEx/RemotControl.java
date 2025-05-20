package javaStudy.day4.InterfaceEx;
/*
 * Interface 는 자바에서 기능을 목적으로 다중 상속을 하는데 사용됨
 * Interface 는 class 가 아니기 대문에, 생성자를 가질 수 없고, 때문에
 * 자신의 instance 를 생성할 수 없음
 * 그리고 인터페이스는 기본적으로 메서드를 선언하게 되면 무조건 public abstract 가 컴파일시에 추가됨
 * 
 * 이런 특징들과 또한, 인터페이스 간에는 다중 상속이 가능함
 * ex> Interface a extends B, C, D ...
 * 
 * JDK 17 이전버전에서 인터페이스에서는 상수와 추상 메서드 선언만 가능했지만
 * 업버전된 이후에는 다음과 같은 것들이 추가됨.
 * 
 * 1. public 상수필드, 추상 메서드 --> 기존 내용
 * 2. public default 메서드
 * 3. public 정적(static) 메서드
 * 4. private 메서드
 * 5. private 정적 메서드
 * 
 * 위 내용은 순차적으로 풀어갈 예정.
 */
public interface RemotControl {
	
	// 필드는 컴파일시 기본적으로 public static final 키워드가 붙음.
	// 리모컨에서 사용될 볼륨 필드 선언
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	public abstract void turnOn();
	void turnOff();
	void volumeUp(int volume);
	void volumeDown(int volume);
	
	/*
	 * JDK 17 ? 부터 지원되는 default 메서드 
	 * 이 메서드는 인터페이스가 메서드의 정의부를 갖도록 하는 문법
	 * 이걸 사용하는 주된 목적은, 내부 메서드나, 필드를 이용해서 내용부에서 사용하기 위함이며,
	 * 특히, 이 메서드는 기본적으로 하위 클래스에 상속 되어지기 때문에,
	 * sub class 에서 특정 목적으로 활용되도록 정의 하는 경우도 많음
	 * 꼭 기억! (나중에 스프링부트에 많이 사용)
	 * 문법은 리턴타입 앞에 default 키워드를 넣기만 하면 됨.
	 */
	
	default void setMute(boolean mute) {
		// 사용자가 mute 키를 눌렀는지 확인
		if(mute)
		{
			System.out.println("무음 처리함");
			volumeDown(MIN_VOLUME);
		}
		else
		{
			System.out.println("무음 처리를 해제함");
		}
	}
	
	
	
	
	
}
