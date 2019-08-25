package day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流.特点:可以按行读取字符串
 * 由于有缓冲,读取字符时的效率好.
 * @author adminitartor
 *
 */
public class BufferedReader_readLine {
	public static void main(String[] args) throws IOException {
		/*
		 * ./src/main/java/day05/BufferedReader_readLine.java
		 */
		FileInputStream fis
			= new FileInputStream(
				"src"+File.separator+
				"main"+File.separator+
				"java"+File.separator+
				"day05"+File.separator+
				"BufferedReader_readLine.java"
			);
		InputStreamReader isr
			= new InputStreamReader(fis);
		BufferedReader br
			= new BufferedReader(isr);
		/*
		 * BufferedReader提供了读取一行字符串的
		 * 方法:
		 * String readLine()
		 * 该方法会连续读取若干字符,直到读取了换行
		 * 符为止,然后将换行符之间读取到的所有字符
		 * 以一个字符串形式返回.需要注意,返回的字符
		 * 串中不包含最后的换行符.
		 * 当该方法返回null时,表示末尾(不会再读取到
		 * 任何数据)
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}







