package day02;

import java.util.Scanner;

/**
 * 课后练习
 * @author adminitartor
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 程序启动后,要求用户输入一个计算表达式,
		 * 经过程序运算输出结果:
		 * 例如:
		 * 用户输入:1+2
		 * 输出:3
		 * 
		 * 用户输入:2*3
		 * 输出:6
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个计算表达式:");
		String line = scanner.nextLine();
		
		//判断表达式中是否含有+,-,*,/
		//1+1
		if(line.indexOf("+")>0){
			String[] data = line.split("\\+");
			int num1 = Integer.parseInt(data[0]);
			int num2 = Integer.parseInt(data[1]);
			int num = num1+num2;
			System.out.println(num);
		}
		
		
	}
}










