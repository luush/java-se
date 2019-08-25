package day08;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供的基于下标操作方法之:get,set
 * @author adminitartor
 *
 */
public class List_get_set {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * 获取指定位置上的元素
		 */
		//String str = array[1]
		String str = list.get(1);
		System.out.println(str);		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index, E e)
		 * 将给定元素设置到指定位置,返回值为
		 * 原位置对应的元素.所以set方法是替换
		 * 元素操作.
		 */
		//[one,2,three,four]
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
	}
}





