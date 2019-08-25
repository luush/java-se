package day02;
/**
 * 和谐用语
 * @author adminitartor
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|nc|mdzz|mmp|dsb|tmd|djb|cnm)";
		String message = "wqnmlgb!你怎么这么的nc!你个dsb!mmp!你个djb!";
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}
}



