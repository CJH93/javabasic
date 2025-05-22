package javaStudy.day6;

import java.util.Map;

public class SystemExam {

	public static void main(String[] args) {
		// OS 환경 get
		
		Map<String , String> systemEnv = System.getenv();
		System.out.println(systemEnv);
		

	}

}
