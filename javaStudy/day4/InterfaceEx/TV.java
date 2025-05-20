package javaStudy.day4.InterfaceEx;

public class TV implements RemotControl{
	
	private int volume;
	
	 @Override
	public void turnOn() {
		System.out.println("TV를 켬");
	}
	 
	
	@Override
	public void turnOff() {
		System.out.println("TV 끔");
		
	}

	@Override
	public void volumeUp(int volume) {
		if(volume > RemotControl.MAX_VOLUME)
		{
			this.volume = RemotControl.MAX_VOLUME;
		}
		else
		{
			this.volume = volume;
		}
		System.out.println("현재 TV Volume : " + this.volume);
		
	}

	@Override
	public void volumeDown(int volume) {
		if(volume < RemotControl.MIN_VOLUME)
		{
			this.volume = RemotControl.MIN_VOLUME;
		}
		else
		{
			this.volume = volume;
		}
		System.out.println("현재 TV Volume : " + this.volume);
		
	}
	
	public int getVolume() {
		return volume;
	}

}
