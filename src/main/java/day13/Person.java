package day13;

public class Person {
	private int age;
	private String name;
	private String gender;
	private long salary;
	
	
	public void sayHello(){
		System.out.println("hello!!");
	}
	
	public void sayName(){
		System.out.println("my name is cangcang!");
	}
	
	public void sayInfo(String info){
		System.out.println("这个参数是:"+info);
	}
	
	public void sayInfo(String name,int age){
		System.out.println("我叫:"+name+",我今年"+age+"岁");
	}
	
	private void sayHa(){
		System.out.println("我是私有方法,哈哈哈");
	}
}
