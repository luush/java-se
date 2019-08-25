package day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据以及RAF对于指针的操作
 * @author adminitartor
 *
 */
public class RAF_wr_type {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.dat","rw"
			);	
		/*
		 * long getFilePointer()
		 * 获取文件指针位置
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);//0
		
		int imax = Integer.MAX_VALUE;
		/*
		 * int最大值的2进制形式:
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111 
		 */
		raf.write(imax>>>24);
		
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(imax>>>16);
		raf.write(imax>>>8);
		raf.write(imax);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * 一次性写出4个字节,将给定的int值写出
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		
		//操作指针
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * EOFException:end of file
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//读取long
		//1:移动指针到long值的第一个字节的所在位置
		raf.seek(8);
		//2:连续读取8个字节还原为该long值
		long l = raf.readLong();
		System.out.println(l);
		System.out.println("pos:"+raf.getFilePointer());
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		raf.seek(0);
		long lon = raf.readLong();
		System.out.println(lon);
		
		raf.close();
	}
}





