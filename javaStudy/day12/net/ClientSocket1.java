package javaStudy.day12.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket1 {

	public static void main(String[] args) {
		// 클라이언트는 서버의 IP, Port 번호를 가지고 Socket 생성만 하면 일단 OK
		// 데이터를 주고 받는건 계속 이어서 갑니다.

		Socket socket = null;
		try {
			socket = new Socket("192.168.50.247", 50001);
			System.out.println("서버에 잘 연결됨");

			OutputStream os = socket.getOutputStream();
			byte[] bytes = "안녕..난 노쌤이에요.".getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("서버에게 메세지 전송 완료됨");
			
			
			InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readBytes = is.read(bytes);
			String fromServerMsg = new String(bytes, 0, readBytes,"UTF-8");

			System.out.println("서버의 메세지 : " + fromServerMsg);

			

			socket.close();
			System.out.println("서버와 연결 종료");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
