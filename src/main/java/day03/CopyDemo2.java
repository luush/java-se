package day03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据量减少读写次数可以提高读写效率
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"setup.exe","r");
	
		RandomAccessFile desc
			= new RandomAccessFile(
				"setup_cp2.exe","rw"	
			);
		/*
		 * RAF提供了批量读写字节的方法:
		 * int read(byte[] data)
		 * 一次性读取给定字节数组总长度的字节量
		 * 并将读到的字节存入到该数组中.返回值为
		 * 实际读取到的字节量,若返回值为-1表示
		 * 本次没有读取到任何字节(文件末尾读取)
		 */
		byte[] data = new byte[1024*10];//10k
		int len = -1;//每次实际读取到的字节数
		
		long start = System.currentTimeMillis();
		while((len = src.read(data)) != -1){
			/*
			 * write(byte[] data)
			 * 一次性将给定字节数组中的所有字节写出
			 * 
			 * write(byte[] data,int offset,int len)
			 * 将给定字节数组从下标为offset处的连续len个字节
			 * 一次性写出
			 */
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}








