package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算促销日期
 * 促销日期为该商品过期日前两周的周三
 * 
 * 程序启动后,要求用户输入一个商品的生产日期,以及
 * 保质期的天数.
 * 然后经过处理后输出该商品的促销日期
 * 
 * 日期格式:yyyy-MM-dd
 * 
 * 2017-10-26
 * 15
 * 该商品促销日为:2017-10-25
 * 
 * @author adminitartor
 *
 */
public class Test3 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期:");
		String dateStr = scanner.nextLine();
		System.out.println("请输入保质期的天数:");
		int days = Integer.parseInt(scanner.nextLine());
		
		//先将生产日期的字符串转换为Date
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy-MM-dd"	
			);
		Date date = sdf.parse(dateStr);
//		System.out.println("生产日期:"+date);
		
		//将Date转化为Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//计算过期日
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//计算前两周
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//设置为当周的周三
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		//转换回Date
		date = calendar.getTime();
		
		dateStr = sdf.format(date);
		
		System.out.println("促销日期为:"+dateStr);
		
	}
}





