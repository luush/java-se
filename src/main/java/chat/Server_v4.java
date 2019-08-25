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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 聊天室服务端
 * 
 * 改动:将存放所有客户端输出流的数组改为使用List
 *      集合实现.
 * @author adminitartor
 * @version 1.3
 */
public class Server_v4 {
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
	/*
	 * 该数组用于存储所有客户端的输出流,做广播操作
	 */
	private List<PrintWriter> allOut;
	
	public Server_v4() throws IOException{
		/*
		 * 1:实例化ServerSocket的同时,向系统
		 *   申请服务端口.
		 * 若当前操作系统的其他应用程序占用了
		 * 这里申请的端口时,会抛出:
		 * Address already in use
		 */
		System.out.println("初始化服务端...");
		server = new ServerSocket(8088);
		allOut = new ArrayList<PrintWriter>();
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
			Server_v4 server = new Server_v4();
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
			PrintWriter pw = null;
			try {			
				InputStream in 
					= socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				OutputStream out 
					= socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(out,"UTF-8");
				pw = new PrintWriter(osw,true);
				/*
				 * 将当前ClientHandler所对应的客户端
				 * 的输出流存入到共享数组中,便于其他ClientHandler
				 * 使用.
				 */
//				//1 首先扩容allOut数组
//				System.out.println("allOut扩容前长度:"+allOut.length);
//				allOut = Arrays.copyOf(allOut, allOut.length+1);
//				System.out.println("allOut扩容完毕,长度:"+allOut.length);
//				//2 将当前对应客户端的输出流存入该数组
//				allOut[allOut.length-1] = pw;
				
				allOut.add(pw);
				System.out.println("当前在线人数:"+allOut.size()+"人");
				
				String str = null;
				while((str = br.readLine())!=null){
					//读取到客户端发送过来的内容
					System.out.println("客户端说:"+str);
//					pw.println(str);
					/*
					 * 遍历共享数组,将该用户发送过来的消息
					 * 发送给所有客户端
					 */
					for(PrintWriter o : allOut){
						o.println(str);
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				//处理客户端断开连接的操作				
				
				//将当前客户端的输出流从共享数组中删除
				/*
				 * 思路:
				 * 找到要删除的元素,将它与数组最后一个元素
				 * 调换位置,缩容
				 */
				//1找到要删除的元素
//				for(int i=0;i<allOut.length;i++){
//					PrintWriter out = allOut[i];
//					if(out==pw){
//						//将最后一个元素放到当前位置
//						allOut[i] = allOut[allOut.length-1];
//						//缩容
//						allOut = Arrays.copyOf(allOut, allOut.length-1);
//						break;
//					}
//				}
				
				allOut.remove(pw);
				System.out.println("一个用户下线了.");
				System.out.println("当前在线人数:"+allOut.size()+"人");
			}
		}
	}
	
}















