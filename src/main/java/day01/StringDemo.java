package day01;
/**
 * 字符串常量池
 * java对字符串有一个优化措施,就是在堆内存中开辟
 * 了一段空间专门用来存储曾经创建的字符串对象(字
 * 面量形式创建才会存储),以便重用它们.这样可以减少
 * 因大量内容相同的字符串对象的创建,降低内存开销.
 * @author adminitartor
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = "123abc";
		
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//true
		
		String s4 = new String("123abc");
		System.out.println(s2==s4);//false
		/*
		 * java在编译期间会做一个优化
		 * 即:当一个计算表达式中参与计算的参数都
		 *    是字面量时,编译器会直接将该计算表达
		 *    式进行计算,并将结果代替该表达式编译
		 *    到class文件中.这样可以避免JVM每次
		 *    运行时再进行计算.
		 * 编译后的字节码文件中下面的代码为:
		 * String s5 = "123abc";   
		 */
		String s5 = "123"+"abc";
		System.out.println(s2==s5);//true
		/*
		 * 修改字符串内容一定创建新对象
		 */
		String s = "123";
		String s6 = s+"abc";
		System.out.println(s2==s6);//false
		
		s1 = s1+"!";//修改后s1指向一个新对象
		System.out.println(s1);
		System.out.println(s1==s2);//false
		
	}
}





