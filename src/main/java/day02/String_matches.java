package day02;
/**
 * 字符串支持正则表达式的相关方法:
 * 
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足
 * 格式要求,满足则返回true.
 * 需要注意,正则表达式就算不添加边界符(^...$)也是
 * 做全匹配验证.
 * @author adminitartor
 *
 */
public class String_matches {
	public static void main(String[] args) {
		/*
		 * 验证邮箱的正则表达式:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 * 
		 */
		String mail = "fancq@tedu.cn";
		System.out.println("1:"+mail);
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		System.out.println("2:"+regex);
		boolean match = mail.matches(regex);
		if(match){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
		
	}
}





