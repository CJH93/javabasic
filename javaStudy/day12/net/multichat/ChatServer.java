package javaStudy.day12.net.multichat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.simple.JSONObject;

public class ChatServer {
   
   //필드,선언
   ServerSocket serverSocket;
   
   //100개의 스레드를 생성해주는 쓰레드 풀 객체 선언
   ExecutorService executorService = Executors.newFixedThreadPool(100);
   
   //연결된 클라이언트의 소켓과 ID 정보를 담당할 Map 객체 선언
   //이 맵에는 실제 여러분의 메시지가 담기고, 다시 여러분에게 전송되기 때문에
   //반드시 동기화 되어야함. 아니면, 메시지가 섞여서 전달될거임
   
   //때문에 내부적으로 동기화 처리가 된 Map 객체를 얻어서 사용함
   
   Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap());
   
   public void start() throws Exception
   {
      serverSocket = new ServerSocket(8888);
      
      System.out.println("서버 스타트 됨");

      Thread thread = new Thread(()->
      {
         try
         {
            while(true)
            {
               Socket socket = serverSocket.accept();
               SocketClient sc = new SocketClient(this, socket);
            }
         }
         catch(Exception e)
         {
            e.printStackTrace();
         }
      });
      
      thread.start();
   }
   
   public void addSocketClient(SocketClient socketClient)
   {
      String key = socketClient.chatName +"@"+ socketClient.clientIp;
   
      chatRoom.put(key, socketClient);
   
      System.out.println("신규 입장 : " + key);
      System.out.println("현재 채팅자 수 : " + chatRoom.size()+"\n");
   }
   
   public void removeSocketClient(SocketClient socketClient)
   {
      String key = socketClient.chatName +"@"+ socketClient.clientIp;
   
      chatRoom.remove(key);
   
      System.out.println("퇴장 : " + key);
      System.out.println("현재 채팅자 수 : " + chatRoom.size()+"\n");
   }
   
   
   public void sendToAll(SocketClient sender, String message)
   {
      JSONObject root = new JSONObject();
      root.put("clientIp", sender.clientIp);
      root.put("chatName", sender.chatName);
      root.put("message", message);
      String json = root.toString();
      
      Collection<SocketClient> socketClients = chatRoom.values();
      
      for(SocketClient sc: socketClients)
      {
         if(sc == sender) continue;
         sc.send(json);
      }
   }

   public void stop()
   {
      try
      {
         serverSocket.close();
         executorService.shutdown();
         chatRoom.values()
               .stream()
               .forEach(socketClient -> socketClient.close());
      }
      catch (Exception e) {
      }
   }
   
   public static void main(String[] args) {
      try
      {
         ChatServer chatServer = new ChatServer();
         chatServer.start();
         
         System.out.println("서버 종료 시 Q 입력");
         
         Scanner sc = new Scanner(System.in);
         
         while(true)
         {
            String key = sc.nextLine();
            if(key.equalsIgnoreCase("q"))
            {
               break;
            }
         }
      }
      catch (Exception e) {
      }
   }
}