package javaStudy.day8;

public class HomeSubsPR implements Subscribe<Home> {

	@Override
	public Home rent() {
		return new Home();
	}

}
