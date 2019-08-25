package day01;

public class StringBuilderDemo2 {
	public static void main(String[] args) {
		String str = "a";
		StringBuilder builder 
			= new StringBuilder(str);
		for(int i=0;i<1000000;i++){
			builder.append("a");
		}
	}
}
