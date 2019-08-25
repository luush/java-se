package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 通过数组的工具类Arrays的方法asList实现.
 * 
 * 需要注意,该方法仅能将数组转换为List集合
 * @author adminitartor
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		
		List<String> list = Arrays.asList(array);
		System.out.println("size:"+list.size());
		System.out.println(list);
		
		/*
		 * 将集合元素改变为:
		 * [one,2,three,four,five]
		 */
		list.set(1, "2");
		System.out.println(list);
		/*
		 * 当将一个数组转换为集合后,对该集合元素操作
		 * 就是对原数组对应元素的操作.
		 */
		System.out.println(Arrays.toString(array));
		
		/*
		 * 向集合中添加新元素:six
		 */
//		list.add("six");//不受支持,因为会导致数组扩容
		
		List<String> list1 
			= new ArrayList<String>(list);
		list1.add("six");
		System.out.println(list1);
		
	}
}







