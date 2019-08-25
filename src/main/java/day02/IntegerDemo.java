package day02;
/**
 * 包装类
 * 由于基本类型没有面向对象特性,在实际开发中不能
 * 直接参与面向对象的开发环节.为此java为这8个基本
 * 类型提供了对应的包装类.
 * 其中6个数字类型的包装类都继承自Number,而char,
 * boolean的包装类直接继承自Object.
 * @author adminitartor
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int i = 128;
//		Integer i1 = new Integer(i);
//		Integer i2 = new Integer(i);
		
		Integer i1 = Integer.valueOf(i);
		Integer i2 = Integer.valueOf(i);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		
		Double d1 = Double.valueOf(123.123);
		Double d2 = Double.valueOf(123.123);
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		
		int d = i1.intValue();
		System.out.println(d);
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		d = d1.intValue();
		System.out.println(d);
		dou = d1.doubleValue();
		System.out.println(dou);
		
	}
	
}















