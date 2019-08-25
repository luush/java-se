package day02;
/**
 * 测试Point重写的Object相关方法
 * @author adminitartor
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object 定义了toString方法.
		 * 该方法的意义是将当前字符串转为一个
		 * 字符串.
		 * 通常该字符串的内容包含该对象的属性信息
		 * Object已经实现了toString方法,返回的
		 * 是当前对象的句柄(类名@地址)
		 * 
		 * JAVA很多的API都会使用给定对象的toString
		 * 方法.
		 * System.out.println(Object obj)方法都
		 * 使用了,该方法会将给定对象的toString返回
		 * 的字符串输出到控制台.
		 * 
		 * 
		 * JAVA API中提供的类大部分都已经重写
		 * 过toString方法.只有我们自己定义的类
		 * 需要自行重写toString方法.
		 */
//		String str = p.toString();
//		System.out.println(str);		
		System.out.println(p);
		
		
		Point p2 = new Point(1,2);
		System.out.println("p1:"+p);
		System.out.println("p2:"+p2);
		
		/*
		 * "=="是值比较
		 * 对于两个引用类型变量而言,值比较就是
		 * 比较地址,若"=="为true则表示两个引用
		 * 类型变量指向同一个对象.
		 */
		System.out.println(p==p2);//false
		/*
		 * Object提供了equals方法,目的是比较
		 * 两个对象的内容是否一样.
		 * Object实现的equals内部就是"=="比较
		 * 的,所以若不重写该方法是没有实际意义的.
		 * JAVA API中大部分类都重写了equals方法.
		 * 只有自己定义的类我们在需要使用的时候
		 * 必须重写它.
		 */
		System.out.println(p.equals(p2));//true
	}
}







