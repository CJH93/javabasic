package javaStudy.day12.net.multichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {

	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	
	public void connect()throws Exception{
		socket = new Socket("192.168.50.35", 8888);//서버의 IP 및 port 입력하기
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
		
	}
	public void recieve() {
		Thread thread = new Thread(()->{
			try {
				while(true) {
					String json = dis.readUTF();
					JSONObject jsonObject = new JSONObject(json);
					String clientIp = jsonObject.getString("clientIp");
					String chatName = jsonObject.getString("chatName");
					String message = jsonObject.getString("message");
					System.out.println("<" + chatName + "@" + clientIp +">" + message);
				}
			}catch(Exception e) {
				System.out.println("[클라이언트]서버와 연결 종료됨");
				System.exit(0);
			}
		});
		thread.start();
	}
	public void send(String json)throws Exception{
		dos.writeUTF(json);
		dos.flush();
	}
	public void unconnect()throws Exception{
		socket.close();
	}
	
	public static void main(String[] args)throws Exception{
		ChatClient chatClient = new ChatClient();
		chatClient.connect();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대화명 입력해");
		chatClient.chatName = sc.nextLine();
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", "incomming");
		jsonObject.put("data", chatClient.chatName);
		String json = jsonObject.toString();
		chatClient.send(json);
		
		chatClient.recieve();
		
		System.out.println("=======================================");
		System.out.println("보낼 메세지 입력하고 Enter");
		System.out.println("채팅 종료시 q");
		System.out.println("=======================================");
		
		while(true) {
			String message = sc.nextLine();
			if(message.equalsIgnoreCase("q")) {
				break;
			}else {
				jsonObject = new JSONObject();
				jsonObject.put("command", "message");
				jsonObject.put("data", message);
				json = jsonObject.toString();
				chatClient.send(json);
			}
		}
		sc.close();
		chatClient.unconnect();
	}
}
