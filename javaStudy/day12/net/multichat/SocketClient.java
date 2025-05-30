package javaStudy.day12.net.multichat;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {

	public ChatServer chatServer;
	public Socket socket;
	public DataInputStream dis; // 자바의 P 및 Object 까지 스트림에서 읽어들이는 스트림
	public DataOutputStream dos; // 자바의 P 및 Object 까지 스트림에서 쓰는 스트림	
    public String clientIp;
    public String chatName;

    public SocketClient(ChatServer chatServer, Socket socket) {   	
    	
    	try {
    		this.chatServer = chatServer;
        	this.socket = socket;
        	
        	this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
			
			this.clientIp = isa.getHostName(); // 서버로부터의 메세지를 수신하는 메서드 호출
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

    // 서버로 부터 온 JSON 받아서 파싱 후 출력
    private void receive() {
		chatServer.executorService.execute(()->{
			try {
				while(true) {
					String recieveJson = dis.readUTF();
					
					JSONObject jsonObject = new JSONObject(recieveJson);
					String command = jsonObject.getString("command");
					
					switch (command) {
					case "incomming":
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "들어왔음");
						chatServer.addSocketClient(this);
						break;
					case "message":
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
					}
				}
			}catch (Exception e) {
				chatServer.sendToAll(this, "나갔음");
				chatServer.removeSocketClient(this);
			}
		});
	}
    
    public void send(String json) {

    	try {
			dos.writeUTF(json);
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void close() {
    	try {
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

 }