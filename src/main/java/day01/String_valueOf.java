package day01;
/**
 * 字符串提供了一组重载的静态方法:valueOf
 * 作用是将java中其他类型转换为字符串
 * @author adminitartor
 *
 */
public class String_valueOf {
	public static void main(String[] args) {
		int i = 123;
		// "123"
		String istr = String.valueOf(i);
		System.out.println(istr+4);
		
		double d = 123.123;
		String dstr = String.valueOf(d);
		System.out.println(dstr+4);
	
		istr = 123+"";
		System.out.println(istr+4);
	}
}
