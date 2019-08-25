package day01;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定字符串开始或结尾的
 * @author adminitartor
 *
 */
public class String_startsWith_endsWith {
	public static void main(String[] args) {
		String str = "thinking in java";
		boolean starts = str.startsWith("thin");
		System.out.println("starts:"+starts);
		
		boolean ends = str.endsWith("va");
		System.out.println("ends:"+ends);
		
	}
}







