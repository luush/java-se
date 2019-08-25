package day09;
/**
 * 实现Runnable接口
 * @author adminitartor
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		/*
		 * 现一个线程中输出1-100
		 */
//		Runnable r = new Runnable(){
//			public void run(){
//				for(int i=0;i<100;i++){
//					System.out.println(i);
//				}
//			}
//		};
		Runnable r = ()->{
			for(int i=0;i<100;i++){
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}







