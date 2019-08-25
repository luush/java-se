package day07;
/**
 * 守护线程
 * 守护线程又称为后天线程. 默认创建出来的线程都是
 * 前台线程.
 * 使用上守护线程与前台线程没有区别.而区别在于结束
 * 实际上有一点不同,即进程结束.
 * 当一个进程中的所有前台线程都结束时,进程结束,无论
 * 该进程中的守护线程是否还在运行都要强制将它们结束.
 * 
 * @author adminitartor
 *
 */
public class Thread_setDaemon {
	public static void main(String[] args) {		
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose:啊啊啊啊啊啊AAAAAaaaaa....");
				System.out.println("特效:噗通!");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		//设置为守护线程,必须在线程启动之前设置.
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
	}
}










