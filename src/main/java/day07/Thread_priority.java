package day07;
/**
 * 线程优先级
 * 
 * 线程不能干涉线程调度的工作,即:线程不能主动获取
 * CPU时间片.
 * 为了最大程度的改善某个线程获取CPU时间片的次数,
 * 可以通过调整线程优先级来完成.
 * 理论上线程优先级越高的线程获取CPU时间片的次数越多.
 * 
 * 线程的优先级有10个等级,分别用整数1-10表示.
 * 1最低,10最高,5为默认值.
 * 
 * @author adminitartor
 *
 */
public class Thread_priority {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);		
		min.start();
		nor.start();
		max.start();
	}
}










