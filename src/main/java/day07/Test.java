package day07;

import java.util.Scanner;

/**
 * 输入一个数字,从该数字开始倒数,直到0为止.
 * 每个一秒倒数一次.
 * 
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		while(num>0){
			System.out.println(num--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("结束!");
	}
}






