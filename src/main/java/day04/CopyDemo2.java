package day04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 处理流,又称高级流,作用是使用它们可以简化我们的
 * 读写操作.
 * 
 * 缓冲流:提高读写效率
 * BufferedInputStream:缓冲字节输入流,提高读取效率
 * BufferedOutputStream:缓冲字节输出流,提高写出效率
 * 
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("wm.exe");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		FileOutputStream fos
			= new FileOutputStream("wm_cp.exe");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		int d = -1;
		long start = System.currentTimeMillis();
		while((d = bis.read()) !=-1){
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕,耗时:"+(end-start)+"毫秒");
		
		bis.close();
		bos.close();
	}
}










