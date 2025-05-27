package javaStudy.day8;

public class OfficSubsPR implements Subscribe<Office> {

	@Override
	public Office rent() {
		return new Office();
	}

}
