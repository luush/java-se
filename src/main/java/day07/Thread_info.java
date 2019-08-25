package day07;
/**
 * 获取线程相关信息的方法
 * @author adminitartor
 *
 */
public class Thread_info {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("自定义线程t1执行了!");
				
				//获取线程ID  id:唯一标识
				long id = this.getId();	
				System.out.println("t1的ID:"+id);
				
				//获取名字 Thread-xx
				String name = this.getName();
				System.out.println("t1的名字:"+name);
				
				//获取线程优先级  1-10
				int priority = this.getPriority();
				System.out.println("t1的优先级:"+priority);
				
				//查看当前线程是否为守护线程
				boolean isDaemon = this.isDaemon();
				System.out.println("t1是否为守护线程:"+isDaemon);
				
				//查看线程是否处于活动状态
				boolean isAlive = this.isAlive();
				System.out.println("t1是否活着:"+isAlive);
				
				//查看线程是否被中断
				boolean isInterrupted = this.isInterrupted();
				System.out.println("t1是否被中断了:"+isInterrupted);
				
			}
		};
		t1.start();
	}
}




