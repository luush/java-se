package day01;

public class StringUtil {
	/**
	 * 获取给定的路径中的域名
	 * 例如:url-->http://www.oracle.com
	 * 方法会返回其中的域名部分:oracle
	 * @param url 传入的路径
	 * @return
	 */
	public String getHostName(String url){
		/*
		 * http://www.oracle.com
		 * http://www.oracle.com.cn
		 * 
		 * 思路:取第一个点到第二个点之间的字符串
		 */
		//查第一个点之后第一个字符的位置
		int start = url.indexOf(".")+1;
		//第二个点的位置
		int end = url.indexOf(".",start);
		String name = url.substring(start,end);
		return name;
	}
	
	public static void main(String[] args) {
		StringUtil util = new StringUtil();
		/*
		 * www.oracle.com
		 * http://www.oracle.com
		 * http://www.oracle.com.cn
		 * http://www.tedu.cn
		 */
		String name = util.getHostName("http://www.tedu.com.cn");
		System.out.println(name);
	}
}






