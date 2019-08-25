package day14;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 设置当前Calendar表示的时间中指定时间分量为给定
 * 的值.
 * @author adminitartor
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar 
			= Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*
		 * 2008-08-08 20:08:08
		 */
		//设置年
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());		
		//设置月
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		System.out.println(calendar.getTime());	
		//设置天
		calendar.set(Calendar.DAY_OF_MONTH, 8);		
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
		
		
		/*
		 * 设置自己出生的那天
		 * 查看那天是星期几,以及那天是那一年的第几天?
		 */
		calendar.get(Calendar.DAY_OF_WEEK);
		calendar.get(Calendar.DAY_OF_YEAR);
	}
}








