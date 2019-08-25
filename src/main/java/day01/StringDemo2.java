package day01;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "a";
		for(int i=0;i<1000000;i++){
			str = str + str;
		}
				
	}
}
