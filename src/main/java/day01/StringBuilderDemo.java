package day01;
/**
 * java.lang.StringBuilder
 * 由于String的设计不利于频繁修改内容,所以java
 * 专门提供了一个用于修改字符串内容的类:StringBuilder
 * StringBuilder提供了一个可变的字符数组,所以字符串
 * 内容的修改都是在这个数组中进行,而不会每次修改都
 * 创建一个新对象.
 * @author adminitartor
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "努力学习java";
		
		StringBuilder builder 
			= new StringBuilder(str);
		/*
		 * 努力学习java
		 * 努力学习java,为了找个好工作!
		 */
//		str = str+",为了找个好工作!";
		/*
		 * 向当前字符串末尾追加给定内容
		 */
		builder.append(",为了找个好工作!");
		System.out.println(builder.toString());
		
		/*
		 * 努力学习java,为了找个好工作!
		 * 努力学习java,就是为了改变世界!
		 */
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder.toString());
		
		/*
		 * 努力学习java,就是为了改变世界!
		 * ,就是为了改变世界!
		 */
		builder.delete(0, 8);
		System.out.println(builder.toString());
		
		/*
		 * ,就是为了改变世界!
		 * 活着,就是为了改变世界!
		 */
		builder.insert(0, "活着");
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());
	}
}








