package javaStudy.day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx3 {
	
	static void readFile() {
		
		File file = new File("mydat.dat");
		
		FileInputStream fis = null;
		
		// 예외가 발생할 코드를 이 구문으로 묶음
		try 
		{ 		
			fis = new FileInputStream(file);
			
			int data = -1;
			
			while((data = fis.read()) != -1) 
			{
				System.out.print((char)data);
			}
			fis.close();
			
			System.out.println();
			System.out.println("파일 다 읽음");
			
		}
		catch (FileNotFoundException ffe)
		{
			ffe.printStackTrace(); // 예외 stack 을 콘솔에 출력하도록 함
			System.out.println(ffe.getMessage());
		}
		catch (IOException ioe)
		{
		
		}
		finally // 예외가 발생하건 말건 무조건 실행되는 코드블락. try catch finally 가 하나의 세트
		// 하지만 익숙해지면 finally 는 잘 정의하지 않음
		{
			if(fis != null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally 실행됨");
		}
	}
	
	public static void main(String[] args) {
		
		readFile();
		System.out.println("프로그램 정상 종료됨");
		
	}


}
