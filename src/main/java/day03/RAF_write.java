package day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile写字符串
 * @author adminitartor
 *
 */
public class RAF_write {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile(
				"raf.txt","rw"
		    );
		String str = "好久没见了,什么角色呢,悉心装扮着白色衬衫的.";
		byte[] data = str.getBytes("gbk");
		raf.write(data);
		System.out.println("写出完毕");
		
		raf.close();
		
	}
}





