package javaStudy.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * InputStream : 추상화된 클래스. 이 클래스의 read() 는 추상메서드.
 * 모든 하위 클래스는 이 메서드를 오버라이드 함
 * 이 메서드는 스트림 내부에 있는 하나의 byte 를 read 한 후, 그 값을 int로 리턴함
 * 
 * 위 클래스의 하위 클래스는 어디로부터 스트림을 연결할 것인지를 정의한 클래스.
 * source target 에 따른 알맞은 하위 클래스를 이용, 스트림을 연결하면
 * 내부적으로 바이트의 흐름이 생성되어, 스트림에 쌓여지고 이를 read() 로 읽어들임
 *  
 */

public class InputEx1_back {

	public static void main(String[] args) {
		
		// File 로 부터 스트림을 생성하도록 FileInputStream 객체 생성
		
		/*
		 * 꼭 기억하기!
		 * 스트림이 연결된 모든 API 는 아래와 같은 순서를 가져야 함.
		 * 스트림 연결 (객체 생성) --> 읽거나 쓴다 (read or write) --> 반드시 닫는다 (close) 
		 */
		
		FileInputStream fis = null;
		
		try 
		{
			fis = new FileInputStream("mydata.data");
			// 스트림에 있는 첫 번째 바이트 읽음
			System.out.println(fis.available());
			
			/* 
			 * read(byte[]) : 한 번에 byte[] 크기 만큼 읽고
			 * 새롭게 읽은 byte 의 수(count) 를 리턴함
			 * 만약 파일의 끝에 다다른 경우, 더 이상 읽을게 없기 때문에
			 * -1 을 리턴 시킴
			 * 
			 */
			
			byte readByte[] = new byte[3];
			//2개 만큼 읽고, 0번 인덱스 부터 저장. 실제 읽은 갯수 리턴
			int readCnt = fis.read(readByte, 0, 2);
			System.out.println(readCnt);
			System.out.print(Arrays.toString(readByte));
			
			/* read(byte[]) byte 배열 이용 */
//			byte readByte[] = new byte[3];
//			int cnt;
//			while((cnt = fis.read(readByte)) != -1)
//				for(int i = 0; i < cnt; i++)
//				{
//					System.out.print((char)readByte[i]);
//				}
//						
			/* 루프 */
//			byte readByte[] = new byte[3];
//			while(true)
//			{
//				int cnt = fis.read(readByte);
//				if(cnt == -1)
//					break;
//				for(int i = 0; i < readByte.length; i++)
//				{
//					System.out.print((char)readByte[i]);
//				}				
//			}
			
			// 스트림의 첫 3 바이트만 읽어서 출력
//			int readCount = fis.read(readByte);
			
			
			/* 손수 끝까지 해보기 */
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
//			
//			readCount = fis.read(readByte);
//			System.out.println("읽은 바이트 수 : " + readCount);
//			System.out.println(Arrays.toString(readByte));
			
			
			
			
			/* 방법 2 */
//			int data = -1;
//			while((data = fis.read()) != -1)
//			{
//				System.out.print(data);
//			}
			
			/* 방법 1 */
//			int data = -1;
//			while(true)
//			{
//				data = fis.read();
//				if(data == -1)
//					break;
//				System.out.print(data);
//			}
			System.out.println();
			System.out.println(fis.available());
			fis.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
//		catch (FileNotFoundException e) 
//		{		
//			e.printStackTrace();
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
		
		
		
		
		
	}

}
