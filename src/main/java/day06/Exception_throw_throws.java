package day06;
/**
 * throw用于抛出一个异常
 * 
 * @author adminitartor
 *
 */
public class Exception_throw_throws {
	public static void main(String[] args){
		System.out.println("程序开始了");
		Person p = new Person();
		/*
		 * 当调用一个含有throws声明异常抛出的方法时
		 * 编译器会检查当前代码有没有处理该异常.
		 * 若没有处理则编译不通过,那么处理异常的
		 * 方式有两种:
		 * 1:使用try-catch捕获并处理该异常
		 * 2:在当前方法上继续使用throws声明该异常
		 *   的抛出
		 */
		try {
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println(p.getAge());
		System.out.println("程序结束了");
	}
}






