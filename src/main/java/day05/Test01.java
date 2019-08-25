package day05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 解析emp.dat文件,将10个员工信息输出到控制台
 * @author adminitartor
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("emp.dat","r");
		
		for(int i=0;i<10;i++){
			//读取员工姓名  32字节的字符串
			String name = readString(raf,32);	
			//读取年龄
			int age = raf.readInt();		
			//读取性别
			String gender = readString(raf,10);					
			//读取工资
			int salary = raf.readInt();	
			//读取入职日期
			String hiredate = readString(raf,30);
			System.out.println(name+","+age+","+gender+","+salary+","+hiredate);
		}
	}	
	public static String readString(RandomAccessFile raf,int len) throws IOException{
		byte[] data = new byte[len];
		raf.read(data);
		return new String(data).trim();
	}
}





