package javaStudy.day4.InterfaceEx;

public class Audio implements RemotControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
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
		System.out.println("현재 오디오 Volume : " + this.volume);
		
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
		System.out.println("현재 오디오 Volume : " + this.volume);
		
	}
	
	public int getVolume() {
		return volume;
	}
	
	// setMute 를 오버라이드 해서 mute 가 토글되면, 원래 volume 값으로 되돌리도록 재정의.
	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute)
		{
			this.memoryVolume = this.volume;
			System.out.println("무음 처리함");
			volumeDown(RemotControl.MIN_VOLUME);
		}
		else
		{
			System.out.println("무음 해제함");
			volumeUp(memoryVolume);
		}
	}

}
