package day07;
/**
 * 线程
 * 线程可以并发运行多段代码.
 * 
 * 创建线程有两种方式
 * 方式一:继承Thread,重写run方法
 * run方法中的代码就是需要让线程并发执行的代码(任务)
 * @author adminitartor
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 启动线程要调用线程的start方法,而不是
		 * 直接调用run方法!
		 * start方法调用完毕后,run方法会很快的被
		 * 调用.
		 */
		t1.start();
		t2.start();
	}
}

/**
 * 第一种创建线程的方式有两个不足
 * 1:继承冲突
 *   由于java是单继承的,这就导致若继承了Thread当前
 *   类就无法继承其他类来复用方法,这在实际开发中是
 *   非常不方便的.
 * 2:由于在当前类内部重写run方法,这就导致当前线程
 *   与该线程要执行的任务有一个必然的耦合关系.不利于
 *   线程复用.  
 * @author adminitartor
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊?");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的!");
		}
	}
}








