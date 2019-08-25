package day09;
/**
 * synchronized的互斥性
 * 
 * synchronized修饰多段代码,但是这些同步块的同步
 * 监视器对象是同一个时,那么这些代码间就是互斥的.
 * 多个线程不能同时在这些代码中用运行.
 * 
 * @author adminitartor
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Coo coo = new Coo();
		Thread t1 = new Thread(){
			public void run(){
				coo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				coo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Coo{
	public synchronized void methodA(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(
				t.getName()+":正在执行A方法...");
			Thread.sleep(5000);
			System.out.println(
				t.getName()+":执行A方法完毕!");
		} catch (Exception e) {			
		}
	}
	public void methodB(){
		synchronized (this) {					
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在执行B方法...");
				Thread.sleep(5000);
				System.out.println(t.getName()+":执行B方法完毕!");
			} catch (Exception e) {			
			}
		}
	}
}






