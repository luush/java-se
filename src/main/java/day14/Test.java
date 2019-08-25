package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后,要求用户输入自己的生日,
 * 格式如:1992-08-02
 * 然后经过程序计算,显示该用户到今天为止活了多少天.
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		System.out.println(
			"请输入您的生日:yyyy-mm-dd");
		Scanner scanner = new Scanner(System.in);
		String birthStr = scanner.nextLine();
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse(birthStr);
		
		Date now = new Date();
		
		long time = now.getTime()-birth.getTime();
		time = time/1000/60/60/24;
		System.out.println("恭喜您!已经成功活了"+time+"天!请继续保持呦!");
		
		//计算10000天的纪念日
		birth.setTime(
			birth.getTime()+10000L*1000*60*60*24
		);
		
		String str = sdf.format(birth);
		System.out.println("您出生10000天的纪念日为:"+str);
		
	}
}





