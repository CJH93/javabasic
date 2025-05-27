package javaStudy.day9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
* FileBackUp.java 를 생성한 후 InputEx1.java 를 복사한 InputEx1_back.java 파일을 생성하라.
* 조건으로는 100 byte 배열을 생성해서 read/write 하는데 사용
* 
*/

public class FileBackUp {

	public static void main(String[] args) throws Exception {
		
		
		byte[] backByte = new byte[100];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		String source = "D:\\backEnd_Workspace_Real\\javaStudy\\src\\javaStudy\\day9\\InputEx1.java";
		String backUP = "D:\\backEnd_Workspace_Real\\javaStudy\\src\\javaStudy\\day9\\InputEx1_back.java";
		int rData;
		
			fis = new FileInputStream(source);
			// filter(BufferInput)
			bis = new BufferedInputStream(fis);
			// output
			fos = new FileOutputStream(backUP);
			// filter(BufferOutput)
			bos = new BufferedOutputStream(fos);
			
			while((rData = bis.read(backByte)) != -1)
				
				fos.write(backByte, 0, rData);
			
			bis.close();
			bos.close();
			System.out.println("파일 백업 완료됨.");
		
		

	}

}
