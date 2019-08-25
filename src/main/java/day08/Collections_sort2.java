package day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序含有自定义类型元素的List集合
 * @author adminitartor
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<Point2> list 
			= new ArrayList<Point2>();		
		list.add(new Point2(5,6));
		list.add(new Point2(4,7));
		list.add(new Point2(2,1));
		list.add(new Point2(8,9));
		list.add(new Point2(7,9));
		System.out.println(list);
		/*
		 *	Collections的sort方法在排序List集合
		 *  时要求该集合的元素必须实现:Comparable
		 *  接口.该接口规定了元素可以比较大小.
		 */
//		Collections.sort(list);
		/*
		 * 排序自定义类型元素时,推荐使用下面的
		 * 重载sort方法.该方法要求传入一个额外的
		 * 比较器,使用匿名内部类即可.这样一句代码
		 * 就可以完成排序操作.而无需在Point2类中
		 * 实现接口并为其提供一个方法.
		 * 
		 * 当我们使用某个功能时,该功能要求我们为其
		 * 修改代码越多,侵入性越强.实际开发中应尽量
		 * 避免侵入性强的功能.
		 * 
		 * 
		 */
		Collections.sort(list,new Comparator<Point2>(){
			public int compare(Point2 o1, Point2 o2) {
				int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
				int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
				return len1-len2;
			}
		});
		
		System.out.println(list);
		
	}
}






