package day01;
/**
 * String substring(int start,int end)
 * 截取字符串
 * @author adminitartor
 *
 */
public class String_substring {
	public static void main(String[] args) {
		//            01234567890123
		String str = "www.oracle.com";
		/*
		 * 在java API中有一个特点,就是用两个数字
		 * 表示范围时,通常都是"含头不含尾"的.
		 */
		//截取oracle
		str = str.substring(4,10);
		System.out.println(str);
	}
}








