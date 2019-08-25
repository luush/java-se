package day06;
/**
 * 请分别描述final finally finalize?
 * 
 * finalize是Object定义的一个方法,所以所有的类
 * 都具有该方法.该方法是GC在释放一个实例的时候
 * 调用的,这意味着该方法调用完毕这个对象就会被
 * 释放了.
 * @author adminitartor
 *
 */
public class Exception_finally_demo {
	public static void main(String[] args) {
		System.out.println(
			test("0")+","+
		    test("")+","+
			test(null)		
		);
	}
	
	public static char test(String str){
		try {
			System.out.println("test方法开始执行!");
			return str.charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("下标越界了!");
			return '1';
		} catch (Exception e){
			System.out.println("空指针了!");
			return '2';
		} finally{
			//finally中不应当做返回结果操作
//			return '3';
		}
	}
}









