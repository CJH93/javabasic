package javaStudy.day4.InterfaceEx;

public class UseRemotcon {

	public static void main(String[] args) {
		/*
		 * 다형성을 이용해서 TV, Audio 리모컨 객체 생성 
		 */
		RemotControl tvRc = new TV();
		RemotControl audioRc = new Audio();
				
		tvRc.turnOn();
		audioRc.turnOn();
		
		System.out.println("티비의 최대 볼륨은 " + RemotControl.MAX_VOLUME);
		
		tvRc.turnOff();
		audioRc.turnOff();
		
		tvRc.volumeUp(15);
		tvRc.volumeDown(5);
		
		audioRc.volumeUp(12);
		audioRc.volumeUp(9);
		
		tvRc.setMute(true);
		audioRc.setMute(true);
		
		System.out.println(((TV)tvRc).getVolume());
		System.out.println(((Audio)audioRc).getVolume());
		
		RemotControl.changeBatter();
		

	}

}
