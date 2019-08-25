package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 简易记事本
 * 使用PW将用户输入的每行字符串写入用户指定的文件中
 * 构造方法使用流连接形式,不使用直接对文件操作的.
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个文件名:");
		String fileName = scanner.nextLine();
		
		FileOutputStream fos
			= new FileOutputStream(fileName);
		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		/*
		 * 当PrintWriter的构造方法第一个参数为流(
		 * 字节流,字符流均可)时,那么支持一个重载的
		 * 构造方法可以传入一个boolean值,该值若为
		 * true,则当前PrintWriter具有自动行刷新功能
		 * 即:每当调用println方法写出一行字符串后会
		 * 自动调用flush方法将其真实写出.
		 * 需要注意,调用print方法是不会flush的
		 */
		PrintWriter pw = new PrintWriter(osw,true);
		
		System.out.println("请开始你的表演");
		String line = null;
		while(true){
			line = scanner.nextLine();
			if(line.equals("exit")){
				break;
			}
			pw.println(line);
		}
		System.out.println("再见!");
		pw.close();
	}
}







