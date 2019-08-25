package day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 * InputStreamReader
 * @author adminitartor
 *
 */
public class InputStreamReader_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis 
			= new FileInputStream("osw.txt");
		
		InputStreamReader isr
			= new InputStreamReader(fis,"GBK");		
		
//		char[] data = new char[100];
//		int len = isr.read(data);		
//		String str = new String(data,0,len);		
//		System.out.println(str);
		
		StringBuilder builder = new StringBuilder();
		String str = "";
		int d = -1;
		while((d = isr.read())!=-1){
			builder.append((char)d);
		}
		str = builder.toString();
		System.out.println(str);
		isr.close();
	}
}








