package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用新循环遍历集合
 * @author adminitartor
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection<String> c 
			= new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		/*
		 * 编译器在编译源程序时会将新循环遍历集合
		 * 改为使用迭代器遍历方式.所以新循环在遍历
		 * 集合时不能通过集合方法增删元素.
		 */
		for(String str : c){
			System.out.println(str);
		}
		System.out.println(c);
	}
}



