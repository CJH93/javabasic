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
			System.out.println(ffe.getMessage());
		}
		catch (IOException ioe)
		{
		
		}
	}
	
	public static void main(String[] args) {
		
		readFile();
		
	}


}
