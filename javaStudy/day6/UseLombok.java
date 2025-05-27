package javaStudy.day6;

import java.io.IOException;

public class UseLombok {

	public static void main(String[] args) throws IOException {
//		LombokTest lombokTest = new LombokTest();
//		lombokTest.setAge(0);
		
		LombokTest lom = LombokTest.builder().age(1).fromSns(false).id("cjh").name("CJH").build();

		Runtime runtime = Runtime.getRuntime();
		
		runtime.exec("explorer.exe http://www.naver.com");
		
//		runtime.exec(new String[] {"notepad.exe"});
		
//		System.out.print(false);
//		
//		String str = "Hello";
//		
//		System.err.println(str);
		
	}

}
