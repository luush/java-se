package day07;
/**
 * 使用匿名内部类完成两种方式线程的创建
 * @author adminitartor
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		/*
		 * 使用匿名内部类完成方式一创建线程
		 */
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊?");
				}
			}
		};
		
		/*
		 * 使用匿名内部类完成方式二创建Runnable
		 */
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的!");
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}








