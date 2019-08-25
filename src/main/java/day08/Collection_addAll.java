package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 * @author adminitartor
 *
 */
public class Collection_addAll {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add(".net");
		System.out.println(c1);
		
		Collection c2 = new HashSet();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println(c2);

		/*
		 * 将c2集合中的所有元素存入c1
		 * boolean addAll(Collection c)
		 * 将给定集合的所有元素添加到当前集合中
		 * 添加后当前集合元素发生改变则返回true
		 */
		c1.addAll(c2);
		System.out.println(c1);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("ios");
//		c3.add("php");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("c1包含c3所有元素:"+contains);
		
		/*
		 * boolean removeAll(Collection c)
		 * 删除当前集合中与给定集合中的公有元素
		 * 删交集
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}
}










