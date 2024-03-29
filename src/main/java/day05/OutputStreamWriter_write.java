package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java根据读写数据的单位划分了:字节流,字符流
 * InputStream,OutputStream是所有字节输入流与
 * 字节输出流的父类,常用实现类:FileInputStream,
 * BufferedInputStream等.
 * 
 * Reader,Writer是所有字符输入流与字符输出流的父类
 * 
 * 字节流的读写单位是字节,而字符流的读写单位是字符.
 * 所以字符流有局限性,只适合读写字符数据.
 * 但实际字符流底层本质还是读写字节,只是字符与字节
 * 的转换工作不用我们来做了.
 * 
 * 
 * 转换流
 * OutputStreamWriter,InputStreamReader
 * 
 * @author adminitartor
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		/*
		 * 构造方法若只传入流,那么通过当前转换流
		 * 写出的字符会按照系统默认的字符集转化为
		 * 对应的字节,不推荐.
		 * 可以使用重载的构造方法,在第二个参数中
		 * 明确使用的字符集.
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"GBK");		
		String str = "夜空中最亮的星,能否听清.";
		osw.write(str);
		osw.write("那仰望的人,心底的孤独和叹息.");		
		System.out.println("写出完毕!");
		osw.close();
	}
}











