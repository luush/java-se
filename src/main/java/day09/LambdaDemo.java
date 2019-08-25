package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Lambda表达式  实现函数式编程
 * Lambda是JDK8推出的一个新特性.
 * lambda常用在快捷方便的创建匿名内部类上.
 * 需要注意的是lambda创建匿名内部类要求该接口或者
 * 类只能有一个方法.
 * lambda是编译器认可,而非虚拟机,编译器最终会将
 * 其改写为内部类形式.
 * 
 * lambda表达式语法
 * (parameters)->expression
 * 或
 * (parameters)->{statements;}
 * 
 * 例如:
 * ()->5        不需要参数,返回值为5
 * (x,y)->x-y   需要传入两个参数,返回值为x-y
 * (int x,int y)->x-y; 需要传入两个int型参数,返回值为x-y
 * (s)->System.out.println(s)
 * @author adminitartor
 *
 */
public class LambdaDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");	
//		list.forEach(new Consumer<String>(){
//			public void accept(String o){
//				System.out.println(o);
//			}
//		});	
		list.forEach((o)->System.out.println(o));
		
		
		
		
		
		
	}
}






