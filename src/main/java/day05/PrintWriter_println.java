package day05;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * 缓冲字符流由于内部有缓冲区,读写字符的效率高.
 * 并且字符流的特点是可以按行读写字符串.
 * BufferedWriter,BufferedReader
 * 
 * PrintWriter也是缓冲字符输出流,它内部总是连接
 * BufferedWriter,除此之外PW还提供了自动行刷新
 * 功能.所以更常用.
 * @author adminitartor
 *
 */
public class PrintWriter_println {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * PrintWriter提供了直接对文件进行写操作
		 * 的构造方法:
		 * PrintWriter(File file)
		 * PrintWriter(String fileName)
		 * 若希望按照指定的字符集向文件写出字符串,
		 * 可以使用对应重载的构造方法:
		 * PrintWriter(File file,String csn)
		 * PrintWriter(String fileName,String csn)
		 * 第二个参数可以指定字符集的名字(charSetName)
		 */
		PrintWriter pw 
			= new PrintWriter("pw.txt","GBK");
		
		pw.println("董小姐,你从没忘记你的微笑.");
		pw.println("就算你和我一样,渴望着衰老.");
		
		System.out.println("写出完毕!");
		pw.close();
	}
}









