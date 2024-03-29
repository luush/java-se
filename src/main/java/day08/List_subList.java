package day08;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了可以获取子集的方法:
 * List subList(int start,int end)
 * 获取当前集合指定范围内的子集
 * 
 * 
 * @author adminitartor
 *
 */
public class List_subList {
	public static void main(String[] args) {
		List<Integer> list 
			= new ArrayList<Integer>();		
		for(int i=0;i<10;i++){
			list.add(i);
		}
		//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(list);
		
		//[3, 4, 5, 6, 7]
		List<Integer> subList 
			= list.subList(3, 8);
		System.out.println("sub:"+subList);
		
		//将子集元素扩大10倍
		//[30, 40, 50, 60, 70]
		for(int i=0;i<subList.size();i++){
			subList.set(i, subList.get(i) * 10);
		}
		System.out.println(subList);
		/*
		 * 对一个集合的子集元素操作就是对该集合对应
		 * 元素的操作.
		 */
		System.out.println(list);
		/*
		 * 将list集合中2-8的元素删除?
		 * 
		 * [0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
		 * [0, 1, 9]
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}











