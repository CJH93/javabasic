package javaStudy.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * OutputStream : 스트림을 통해 data 를 특정 대상(파일, 네트워크 등)에다 쓰는 역할을 하는 root class
 * 만약 파일에 데이터를 쓰려면, fileOutputStream 을
 * 기타 다른 곳에 쓰려면, 해당 스트림을 이용
 * 여기서 꼭 알아야 할 것은, 만약 FileOutputStream 을 이용해서 쓸 경우, file 이 존재하지 않는 경우엔 무조건 새로 만들어 버림.
 * 만약 존재한다면, 기존 내용을 지우고 다시 데이터를 쓰게 됨. 꼭 기억!
 * 
 * FileBackUp.java 를 생성한 후 InputEx1.java 를 복사한 InputEx1_back.java 파일을 생성하라.
 * 조건으로는 100 byte 배열을 생성해서 read/write 하는데 사용
 * 
 */

public class InputEx2 {

	public static void main(String[] args) {
		
		byte[] imgByte = new byte[1024]; // 1KB
		FileInputStream fis = null;
		
		String source = "D:\\CJH\\html_Css_Script\\imgs\\kitty-2.png";
		String targetFolder = "D:\\user\\";
		int rData;
		
		// Output 객체 생성
		FileOutputStream fos = null;
		
		try 
		{
			fis = new FileInputStream(source);
			//output
			fos = new FileOutputStream(targetFolder + "졸려.png");
			
			// 배열 이용, 읽은 이미지 데이터를 콘솔에 출력
			while((rData = fis.read(imgByte)) != -1)
				
				fos.write(imgByte, 0, rData);
				
//				for(int i = 0; i < rData; i++)
//				{
//					System.out.print(imgByte[i]);
//					
//					// output
//					fos.write(imgByte[i]);
//				}
				
				fos.close();
				fis.close();
				System.out.println("파일 복사 완료됨.");
		}
		
		
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
		
		
		

	}

}
