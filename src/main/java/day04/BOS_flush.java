package day04;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲输出流的缓冲区问题
 * @author adminitartor
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream(
				"bos.txt"	
			);
		
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String str = "你在南方的艳阳里大雪纷飞.";
		byte[] data = str.getBytes("UTF-8");
		bos.write(data);
		/*
		 * void flush()
		 * 将缓冲区已经缓存的数据一次性写出.
		 * 频繁的调用flush会降低写出效率,但是可以
		 * 保证写出数据的即时性.
		 */
		bos.flush();
		System.out.println("写出完毕!");
		
		bos.close();
	}
}







