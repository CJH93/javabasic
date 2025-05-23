package javaStudy.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx2 {
	
	static void mkFile() throws IOException, FileNotFoundException {
		
		File file = new File("mydata.dat");
		
		FileOutputStream fos = null;
		
		String message = "나의 첫 생성된 파일의 내용";
		
		fos = new FileOutputStream(file);
		
		byte[] bArr = message.getBytes();
		
		for(int i = 0; i < bArr.length; i++)
		{
			byte b = bArr[i];
			fos.write(b);
			
		}
		fos.close();
		System.out.println("파일 생성 됨");
	}
	
	public static void main(String[] args) throws Exception {
		
		mkFile();
		
	}


}
