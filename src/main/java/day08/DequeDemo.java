package day08;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列Deque
 * java.util.Deque是Queue的子接口,规定了双端
 * 队列的相关方法.
 * 双端队列的特点是可以分别从队列首尾做进出队操作.
 * 双端队列提供了更有方向性的进出队方法.
 * @author adminitartor
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque 
			= new LinkedList<String>();		
		deque.offer("one");
		deque.offer("two");
		System.out.println(deque);
		
		deque.offerFirst("three");
		System.out.println(deque);
		
		deque.offerLast("four");
		System.out.println(deque);
		
		/*
		 * 队列提供了引用队首元素方法peek,
		 * 它与poll的区别在于获取后该元素依然在
		 * 队列中.
		 * 在双端队列中还支持peekFirst,peekLast
		 */
		String str = deque.peek();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
	}
}





