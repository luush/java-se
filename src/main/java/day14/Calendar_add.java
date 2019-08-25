package day14;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 使当前Calendar表示的时间中指定时间分量的值加
 * 上给定的值.若amount是个负数,则是减去.
 * @author adminitartor
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		/*
		 * 查看3年2个月零25天以后所在周的周五的前8天是哪天?
		 */
		Calendar calendar = Calendar.getInstance();
		
		//加3年
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		
		//加2个月
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		
		//加25天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		//设置为周五
		calendar.set(Calendar.DAY_OF_WEEK, 6);
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.DAY_OF_YEAR, -8);
		System.out.println(calendar.getTime());
	}
}







