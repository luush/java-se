package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author adminitartor
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * 封装了TCP协议,使用它可以基于TCP协议与远端
	 * 计算机的程序交互
	 */
	private Socket socket;
	/**
	 * 构造方法,用来初始化客户端
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public Client() throws UnknownHostException, IOException{
		/*
		 * 实例化Socket的使用通常传入两个参数:
		 * 1:远端计算机的地址信息(IP)
		 * 2:端口号
		 *   通过端口号可以找到运行在远端计算机中
		 *   需要通讯的应用程序.
		 *   
		 * 实例化Socket的过程就是发起连接的过程.
		 * 若服务端没有响应,这里会抛出异常  
		 */
		System.out.println("正在连接服务端...");
		socket = new Socket(
			"localhost",8088
		);
		System.out.println("已连接服务端!");
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		try {
			/*
			 * 若希望像服务端发送数据,需要通过
			 * Socket获取输出流,通过该流写出的
			 * 数据就被发送到了服务端.
			 * 
			 * Socket提供的方法:
			 * OutputStream getOutputStream()
			 */
			OutputStream out 
				= socket.getOutputStream();	
			OutputStreamWriter osw
				= new OutputStreamWriter(out,"UTF-8");			
			PrintWriter pw
				= new PrintWriter(osw,true);
			
			//建立好输入流
//			InputStream in = socket.getInputStream();
//			InputStreamReader isr
//				= new InputStreamReader(in,"UTF-8");
//			BufferedReader br
//				= new BufferedReader(isr);
				
			Scanner scanner = new Scanner(System.in);
			while(true){
				String str = scanner.nextLine();
				pw.println(str);//发送至服务端
				//读取服务端发送回来的内容并输出到控制台
//				String message = br.readLine();
//				System.out.println("服务端说:"+message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






