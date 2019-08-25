package day02;
/**
 * 包装类定义了相关的常量
 * 其中数字类型的包装类有两个常用的常量:
 * MAX_VALUE,MIN_VALUE分别表示包装类对应的基本
 * 类型数据的取值范围.
 * @author adminitartor
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		int imax = Integer.MAX_VALUE;
		System.out.println("imax:"+imax);
		
		int imin = Integer.MIN_VALUE;
		System.out.println("imin:"+imin);
		
		long lmax = Long.MAX_VALUE;
		System.out.println("lmax:"+lmax);
	}
}


