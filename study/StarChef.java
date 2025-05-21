package study;

public class StarChef extends Chef {
	
	public StarChef(String name, String type, String[] showBroadcast) {
		super(name, type);
	
	this.showBroadcast = showBroadcast;
		
	}
	
	public String[] showBroadcast = {"KBS", "SBS", "MBC"};
	
	public void showBroadcast () {
		for(int i = 0; i < showBroadcast.length; i++) {
			if(showBroadcast[i].equals("KBS")) 
			{
				System.out.println("CJH 셰프");
			}
			else if(showBroadcast[i].equals("SBS"))
			{
				System.out.println("BSN 셰프");
			}
			else
			{
				System.out.println("SMW 셰프");
			}
		}	
	}
	
	
	
}
