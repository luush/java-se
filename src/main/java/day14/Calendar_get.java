package day14;

import java.util.Calendar;

/**
 * Calendar提供了一个方法:
 * int get(int field)
 * 该方法的作用是获取当前Calendar所表示的时间中
 * 给定时间分量所对应的值.
 * 
 * 参数是一个int值,不同的值表示不同的时间分量.
 * Calendar提供了大量的常量,来表示不同时间分量.
 * @author adminitartor
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//获取年?
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
//		获取月?  月从0开始
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		/*
		 * 获取日
		 * 相关的常量:
		 * DATE          月中的天
		 * DAY_OF_MONTH  月中的天
		 * DAY_OF_WEEK   周中的天
		 * DAY_OF_YEAR   年中的天
		 */
		int day = calendar.get(Calendar.DATE);
		System.out.println(day);
		
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第:"+doy+"天");
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		//今天是周四
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("今天是周"+data[dow]);
		
		/*
		 * int getActualMaximum(int field)
		 * 获取给定时间分量所允许的最大值,参考
		 * 时间为当前Calendar表示的时间
		 * 
		 * 查看今年共多少天?
		 */
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(year+"年共"+days+"天");
		
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month+"月共"+days+"天");
	}
}










