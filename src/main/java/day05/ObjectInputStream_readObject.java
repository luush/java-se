package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 * 用于进行对象反序列化
 * @author adminitartor
 *
 */
public class ObjectInputStream_readObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		/*
		 * ObjectInputStream提供方法:
		 * Object readObject()
		 * 该方法可以读取字节并还原为指定的对象
		 * 需要确保OIS读取的字节是通过对象输出流(OOS)
		 * 将一个对象写出的字节.否则会抛出异常.
		 */
		Person p = (Person)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
		
	}
}






