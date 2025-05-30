package javaStudy.day12.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

//서버소켓..여기서는 accept() 이용해서 요청이 오는 클라이언트와 1 : 1 소켓을 연결하고
//메세지를 주고 받을수 있도록 in-out 스트림을 연결합니다.
//각각의 소켓은 쓰래드로 처리 하도록 할예정임

public class ServerEx1 {

	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("서버를 종료 하려면 q 입력");
		
		startServer();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.next();
			if(key.equalsIgnoreCase("q")) {
				break;
			}
		}
		
		//스트림 연결후 데이터 in-out 시킵니다.
		
		stopServer();

	}
	public static void startServer() {
		Thread thread = new Thread() {
			public void run() {
				//서버소켓 생성 및 port 바인드
				try {
					serverSocket = new ServerSocket(50001);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("[서버 시작됨]");
				
				while(true) {
					System.out.println("클라이언트 연결 요청을 기다림");
					 
					try {
						 Socket socket = serverSocket.accept();
						 InetAddress inetAddress = socket.getInetAddress();
						 System.out.println(inetAddress.getHostAddress()+"과의 소켓 연결됨");
						 
						 InputStream is = socket.getInputStream();
						 byte[] bytes = new byte[1024];
						 int readBytes = is.read(bytes);
						 System.out.println(readBytes);
						 
						 
						 String fromClientMsg = new String(bytes,0, readBytes,"UTF-8");
						 
						 System.out.println("클라이언트의 메세지 : " + fromClientMsg);
						 
						 
						 OutputStream os = socket.getOutputStream();
						 bytes = "안녕하세요..이건 서버의 메세지 입니다. 반가워요".getBytes("UTF-8");
						 os.write(bytes);
						 os.flush();
						 System.out.println("클라이언트에게 메세지 전송 완료됨");
						 socket.close();
						 System.out.println("클라이언트와 연결 종료함");
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					//연결된 소켓의 정보를 얻어내기..InetSocketAddress 를 이용하면 상대의 ip 등의 네트웍 정보를 얻어낼수 있음
					
				}
			}
		};
		thread.start();
	}
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("서버 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
