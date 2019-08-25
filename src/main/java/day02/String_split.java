package day02;
/**
 * 字符串支持正则表达式方法二:
 * 
 * String[] split(String regex)
 * 按照当前字符串中满足正则表达式的部分进行拆分
 * 字符串.将拆分出来的每段内容存入一个数组并返回
 * 该数组.
 * 若当前字符串中连续匹配了两次要拆分的部分,那么
 * 中间会拆出一个空字符串.
 * @author adminitartor
 *
 */
public class String_split {
	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		/*
		 * 按照数字部分进行拆分,得到所有的字母部分
		 * abc def ghi jkl
		 */
		String[] data = str.split("[0-9]+");
		System.out.println("len:"+data.length);
		for(int i=0;i<data.length;i++){
			System.out.println("data["+i+"]:"+data[i]);
		}
	}
}



