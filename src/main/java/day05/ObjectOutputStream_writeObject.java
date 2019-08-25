package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一组高级流,作用是通过这组流可以方便的
 * 读写java中的任何对象.
 * 对象输出流:用于写出对象,由于底层读写都是字节读写,
 *           所以无论什么样的数据都要转换为字节才能
 *           写出.对象输出流可以自行将给定的对象转换
 *           为一组字节然后写出.省去了我们将对象按照
 *           结构转化为字节的麻烦.
 * @author adminitartor
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException {
		/*
		 * 将一个Person实例写入文件保存
		 */
		Person p = new Person();
		p.setName("苍老师");
		p.setAge(18);
		p.setGender("女");
		String[] otherInfo = {"是一名演员","爱好是写毛笔字","促进中日文化交流","广大男性同胞的启蒙老师"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		
		/*
		 * 文件输出流作用:将给定的字节写入到指定文件
		 */
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		/*
		 * 对象输出流作用:将给定的java对象转换为一组
		 *              字节后写出
		 */
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * ObjectOutputStream提供了写对象的
		 * 方法:
		 * void writeObject(Object obj)
		 * 该方法会将给定的对象转换为一组字节然后
		 * 通过其处理的流写出
		 * 
		 * 
		 * 这里的操作是先通过OOS将p对象转换为
		 * 了一组字节,然后再将该组字节通过FOS
		 * 写入到了文件person.obj中
		 * 这里涉及到两个操作:
		 * 1:对象序列化.将一个对象按照结构转换
		 *   为一组字节的过程
		 * 2:对象持久化.将该对象写入文件(硬盘中)
		 *   的过程.
		 * 
		 */
		oos.writeObject(p);
		System.out.println("写出完毕!");
		
		
		oos.close();
	}
}








