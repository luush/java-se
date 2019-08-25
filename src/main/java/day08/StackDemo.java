package day08;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 栈用来存一组元素,但是存取元素必须遵循先进后出
 * 原则.通常使用栈来实现"后退"功能.
 * @author adminitartor
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack 
			= new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);
		
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		while(stack.size()>0){
			str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}







