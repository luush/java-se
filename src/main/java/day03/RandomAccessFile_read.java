package day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取一个字节
 * @author adminitartor
 *
 */
public class RandomAccessFile_read {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat","r");
		/*
		 * 读取一个字节,并以int形式返回
		 * 若返回值为-1表示读取到了文件末尾.
		 * 00000000 00000000 00000000 11111111
		 */
		int d = raf.read();
		System.out.println(d);
		
		//由于文件只有一次字节,再次读取会返回-1
		d = raf.read();
		System.out.println(d);//-1
		raf.close();
	}
}





