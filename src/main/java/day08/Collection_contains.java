package day08;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素.
 * 
 * @author adminitartor
 *
 */
public class Collection_contains {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(4,5));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * 判断集合c是否包含p对象
		 * 集合contains方法判断包含的逻辑为:
		 * 当前集合元素只要有与给定对象equals比较
		 * 为true的,则认为当前集合包含该元素
		 * 
		 * 作为集合的元素,它的toString,equals方法
		 * 会影响集合很多方法的结果.所以若集合存放
		 * 的是我们自己写的类,那么就要妥善重写这两个
		 * 方法
		 */
		boolean contains = c.contains(p);
		System.out.println("是否包含:"+contains);
	}
}







