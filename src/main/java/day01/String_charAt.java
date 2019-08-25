package day01;
/**
 * char charAt(int index)
 * 查看当前字符串中指定下标处对应的字符
 * @author adminitartor
 *
 */
public class String_charAt {
	public static void main(String[] args) {
//		              0123456789012345
		String str = "thinking in java";
		
		//查看第10个字符是什么?
		char c=str.charAt(9);
		System.out.println(c);
		
		
		/*
		 * 检查回文 
		 * 0 1 2 3  5 6 7 8
		 * 上海自来水来自海上
		 * 
		 * 规则:正数位置的字符与倒数位置的字符都
		 * 一样的就是回文
		 */
		String info = "上海自来水来自海上";
		//0 1 2 3
		for(int i=0;i<info.length()/2;i++){
			if(
				info.charAt(i) !=
				info.charAt(info.length()-1-i)
		    ){
				System.out.println("不是回文");
				/*
				 * return可以单独使用,作用是
				 * 结束方法,即:return执行后,该
				 * 方法原本可以执行的后续代码全
				 * 部都不在运行.
				 */
				return;
			}							
		}
		System.out.println("是回文");
	}
}






