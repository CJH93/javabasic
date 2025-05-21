package javaStudy.day5;

import javaStudy.day4.InterfaceEx.Audio;
import javaStudy.day4.InterfaceEx.RemotControl;
import javaStudy.day4.InterfaceEx.TV;

public class InterFaceExam2 {
	
	public static void integrityRemote(RemotControl rc[]) {
		// 여기에 각 오디오, 티비, 스마트 티비 객체가 담긴 rc를 순회하면서
		// 모두 turnOn() 을 실행시키고, 단 스마트 티비인 경우엔 네이버를 search 할 수 있도록 구현
		
//		  for(int i = 0 ; i < rc.length; i++)
//		  {
//			  rc[i].turnOn();
//			  
//			  if(rc[i] instanceof SmartTV) 
//			  {
//				  ((Searchable)rc[i]).search("네이버");
//			  }
//		  }
		
		for (RemotControl theRc : rc)
		{
			theRc.turnOn();
			
			if(theRc instanceof Searchable)
			{
				((Searchable) theRc).search("네이버");
			}
		}
		
	}
	

	public static void main(String[] args) {
		RemotControl rc1[] = {new TV(), new Audio(), new SmartTV()};
		integrityRemote(rc1);
		
		
//		DoService service = new DoServiceImpl(); 
//		
//		service.def1Method();
//		System.out.println();
//		service.def2Method();
//		
//		System.out.println();
//		DoService.staticMethod();
//		System.out.println();
//		DoService.staticMethod2();
//		
//		
//		// 스마트 티비 리모컨 생성
//		RemotControl remocon = new SmartTV();
//		
//		remocon.turnOn();
//		remocon.turnOff();
//		remocon.volumeUp(0);
//		remocon.volumeDown(0);
//		
//		((Searchable)remocon).search("네이버");
	
	}

}
