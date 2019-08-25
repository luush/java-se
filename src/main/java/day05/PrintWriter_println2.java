package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * PrintWriter提供了常规的构造方法,允许传入
 * 一个字节流或者字符流完成流连接的创建形式
 * @author adminitartor
 *
 */
public class PrintWriter_println2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("pw2.txt");
		/*
		 * 若希望指定字符集,需要自行连接转换流
		 * 因为转换流可以将字符按照指定的字符集
		 * 转换为字节
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"GBK");
		
		PrintWriter pw
			= new PrintWriter(osw);
		/*
		 * PW的构造方法允许直接传入字节流,但实际
		 * 内部还是会根据流连接最终变为PW的.只是
		 * 这样做不能指定字符集
		 */
//		PrintWriter pw
//			= new PrintWriter(fos);
		pw.println("我在二环路的里边,想着你.");
		pw.println("你在远方的山上,春风十里.");
		
		pw.close();
	}
	
}






