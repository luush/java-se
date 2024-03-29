package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 频繁地创建销毁线程,或者创建过多的线程都会给系统
 * 带来风险.轻者拖慢系统,出现卡顿现象,严重时可能出现
 * 内存溢出系统瘫痪.
 * 为此,我们在处理并发量大的业务逻辑时,常常使用线程池
 * 来管理和调度线程.
 * 
 * 线程池主要解决两个问题:
 * 1:重用线程(避免频繁创建销毁线程)
 * 2:控制线程数量(避免因为大量的线程导致的系统崩溃)
 * 
 * @author adminitartor
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool 
			= Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					try {		
						System.out.println(
							t.getName()+":正在执行任务");
						Thread.sleep(5000);
						System.out.println(
							t.getName()+":执行任务完毕");
					} catch (InterruptedException e) {
						System.out.println(
							t.getName()+"被中断了!");
					}
				}
			};
			threadPool.execute(runn);
			System.out.println("将任务交给了线程池");
		}//循环结束
		
//		threadPool.shutdownNow();
//		System.out.println("线程池停止了");
		
	}
}







