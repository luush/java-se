package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合中广泛使用泛型,而泛型是用来约束集合中的
 * 元素类型.
 * @author adminitartor
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection<String> c 
			= new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
	}
}








