package study;

public interface Slicer {

	public static final String[] slicer = {"chef", "fruit", "Chinese"};
	
	void selectKnife(int selectindex); 
	void sliceObject(String object);
	void containBowl(String object); 
}
