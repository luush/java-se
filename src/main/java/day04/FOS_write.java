package day04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java io  java标准IO
 * IO流根据方向分为:
 * 输入流:外界到我们编写的程序中的方向,所有输入流
 *       是用于从外界获取数据的流.读操作
 * 输出流:将数据从我们编写的程序发送到外界的方向,
 *       写操作.
 * 
 * java将流分为两类:
 * 节点流:节点流又称为低级流,是实际连接程序与数据源
 *       的"管道",负责传输数据.读写一定是建立在节点
 *       流上进行的.
 * 处理流:处理流又称为高级流,用于处理其他流,不能独立
 *       存在(没有意义),使用高级流处理其他流的目的
 *       是通过高级流带来的功能简化我们对数据读写时
 *       的某些复杂处理.      
 * 
 * 文件流
 * FileInputStream,FileOutputStream
 * 它们是一对低级流,作用是对文件读写数据.
 * 从功能上讲它们与RandomAccessFile一致,但是底层
 * 实现不同,RandomAccessFile是专门设计用来读写文件
 * 数据的,基于指针操作.而文件流符合JAVA标准IO操作.
 * 
 * 
 * @author adminitartor
 *
 */
public class FOS_write {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream(String fileName)
		 * FileOutputStream(File file)
		 * 上面两种构造方法创建的文件输出流都是
		 * 覆盖写操作,即:若指定的文件已经存在会
		 * 将该文件所有内容清除,然后通过该流写出
		 * 的内容会作为这个文件的新内容.
		 * 
		 * FileOutputStream(String fileName,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * 追加写模式,即:若指定的文件已经存在会
		 * 接着在文件末尾写入新数据.
		 */
		FileOutputStream fos
			= new FileOutputStream("fos.txt",true);
		
		String str = "她不在和谁谈论相逢的孤岛,";
		fos.write(str.getBytes("UTF-8"));
		str = "因为心里早已荒无人烟.";
		fos.write(str.getBytes("UTF-8"));

		
		System.out.println("写出完毕!");
		fos.close();
	}
}








