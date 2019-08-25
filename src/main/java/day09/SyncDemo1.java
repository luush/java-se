package day09;
/**
 * 多线程并发安全问题
 * 当多个线程并发访问同一资源时,由于线程切换时机不确定
 * 导致执行代码顺序的混乱,从而出现执行未按程序设计顺序
 * 运行导致出现各种错误,严重时可能导致系统瘫痪.
 * 
 * @author adminitartor
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans = 20;
	/*
	 * 当一个方法是用synchronized修饰后,该方法
	 * 成为同步方法,即:多个线程不能同一时间在该方
	 * 法内执行.只能一个线程一个线程的执行该方法.
	 * 
	 * 在一个方法上是用synchronized,那么同步监视器
	 * 对象就是该方法所属对象,即:方法中的"this".
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了!");
		}
		Thread.yield();
		return beans--;
	}
}








