package javaStudy.day8.collection;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		// 프로퍼티스 파일을 읽음
		try {
			properties.load(PropertiesExam.class.getResourceAsStream("db.properties"));
			String admin = properties.getProperty("admin");
			String id = properties.getProperty("id");
			String pass = properties.getProperty("pass");
			String driver = properties.getProperty("driver");
			
			System.out.println("이름: " + admin + ", 아이디: " + id + ", 패스워드: " + pass + ", 드라이버: " + driver);
//			System.out.println(admin);
//			System.out.println(id);
//			System.out.println(pass);
//			System.out.println(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
