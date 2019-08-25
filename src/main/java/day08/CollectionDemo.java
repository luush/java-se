package day08;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合框架
 * java提供了一套用于维护一组元素的数据结构解决方案--集合
 * java.util.Collection
 * Collection是所有集合的顶级接口,规定了所有集合都应
 * 具备的功能.
 * 
 * Collection下面派生了两个常用的子接口:
 * List:可重复集并且有序
 * Set:可不重复集
 * 重复与否指的是元素是否可以重复,而重复的判断标准
 * 是依靠元素自身equals比较的结果.比较为true则认为
 * 两个元素是重复元素,Set集合不允许出现重复元素.
 * 
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();	
		/*
		 * boolean add(E e)
		 * 向当前集合中添加元素,成功添加会返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		/*
		 * int size()
		 * 返回当前集合的元素数量
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * 判断当前集合是否为空集(不含有元素)
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		
		/*
		 * void clear()
		 * 清空集合
		 */
		c.clear();
		System.out.println("集合已清空");
		
		System.out.println(c);//[]
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
	}
}








