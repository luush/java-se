package day08;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 删除集合元素
 * @author adminitartor
 *
 */
public class Collection_remove {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(3,4));
		System.out.println(c);
		
		Point p = new Point(3,4);
		/*
		 * boolean remove(E e)
		 * 从集合中删除给定元素,删除成功则返回true
		 * 
		 * 删除逻辑为:集合会顺序用给定元素与集合
		 * 元素进行equals比较,删除第一个比较为
		 * true的元素.
		 */
		c.remove(p);
		System.out.println(c);
		
	}
}


