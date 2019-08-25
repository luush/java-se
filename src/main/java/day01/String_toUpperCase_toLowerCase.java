package day01;
/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串的英文部分转换为全大写或全小写
 * @author adminitartor
 *
 */
public class String_toUpperCase_toLowerCase {
	public static void main(String[] args) {
		String str = "我爱Java";
		//英文全大写
		String upper = str.toUpperCase();
		System.out.println(upper);
		
		//全小写
		String lower = str.toLowerCase();
		System.out.println(lower);
	}
}







