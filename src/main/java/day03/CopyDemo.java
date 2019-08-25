package day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF复制文件
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"setup.exe","r");
	
		RandomAccessFile desc
			= new RandomAccessFile(
				"setup_cp.exe","rw"	
			);
		long start = System.currentTimeMillis();
		int d = -1;//临时保存每次读取的字节
		while( (d = src.read()) !=-1 ){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		src.close();
		desc.close();
	}
	
	
	
}





