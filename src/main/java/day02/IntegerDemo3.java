package day02;
/**
 * 包装类提供了一个静态方法:parseXXX(String str)
 * 可以将字符串转换为对应的基本类型数据.前提是
 * 该字符串的内容必须能正确表示基本类型可以保存
 * 的值.
 * @author adminitartor
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		String str = "123";
		int d = Integer.parseInt(str);
		System.out.println(d+1);//124
		
		double dou = Double.parseDouble(str);
		System.out.println(dou);//123.123
	}
}






