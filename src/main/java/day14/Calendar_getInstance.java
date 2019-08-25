package day14;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * 日历类,用于操作时间的类.
 * 
 * 常用实现类:GregorianCalendar,即所谓的"阳历"
 * 
 * Calendar提供了一个静态方法:getInstance,通过
 * 这个方法可以获取一个当前系统所在地区适用的实现类
 * 通常返回的都是阳历历法.
 * @author adminitartor
 *
 */
public class Calendar_getInstance {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		/*
		 * Calendar提供了方法:
		 * Date getTime()
		 * 该方法可以获取当前Calendar所表示的
		 * 时间,并以一个Date形式返回.
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * void setTime(Date date)
		 * 设置当前Calendar表示给定的Date对象
		 * 所表示的时间.
		 */
		calendar.setTime(date);
		
	}
	
}










