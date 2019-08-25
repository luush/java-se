package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室服务端
 * 
 * 将ClientHandler换为第二种创建线程的方式:
 * 实现Runnable接口形式
 * 
 * @author adminitartor
 * @version 1.1
 */
public class Server_v2 {
	/*
	 * 运行在服务端的java.net.ServerSocket
	 * 主要有两个作用:
	 * 1:向操作系统申请服务端口,客户端就是通过这个
	 *   端口与服务端程序建立连接的.
	 * 2:监听该服务端口,一旦一个客户端通过该端口
	 *   尝试建立连接,ServerSocket就会实例化一个
	 *   Socket与客户端进行通讯.  
	 */
	private ServerSocket server;
	
	public Server_v2() throws IOException{
		/*
		 * 1:实例化ServerSocket的同时,向系统
		 *   申请服务端口.
		 * 若当前操作系统的其他应用程序占用了
		 * 这里申请的端口时,会抛出:
		 * Address already in use
		 */
		System.out.println("初始化服务端...");
		server = new ServerSocket(8088);
		System.out.println("服务端初始化完毕!");
	}
	
	public void start(){
		try {
			/*
			 * ServerSocket提供的方法:
			 * Socket accept()
			 * 该方法是一个阻塞方法,调用后程序就
			 * 阻塞了("卡住了"),监听服务端口,等待
			 * 客户端的连接,一旦一个客户端建立了
			 * 连接,那么该方法会返回一个Socket与
			 * 该客户端通讯.
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了!");
				/*
				 * 启动一个线程来处理该客户端的交互
				 */
				ClientHandler handler 
					= new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				System.out.println("启动了一个线程负责处理该客户端");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Server_v2 server = new Server_v2();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 该线程负责并发运行处理指定客户端的数据交互
	 * @author adminitartor
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		public ClientHandler(Socket socket){
			this.socket = socket;
		}
		public void run(){
			try {			
				InputStream in 
					= socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				while(true){
					//读取到客户端发送过来的内容
					String str = br.readLine();
					System.out.println("客户端说:"+str);
				}
			} catch (Exception e) {
				
			}
		}
	}
	
}















