package day09;
/**
 * 有效缩小同步范围可以在保证并发安全的前提下提高
 * 并发执行效率.
 * 
 * 同步块,同步块可以更精确的控制需要同步的代码片段.
 * @author adminitartor
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop{
//	public synchronized void buy(){
	public void buy(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在选衣服");
			Thread.sleep(5000);
			synchronized(this){
				System.out.println(t.getName()+":正在试衣服");
				Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+":结账离开");
		
		} catch (Exception e) {
			
		}
	}
}







