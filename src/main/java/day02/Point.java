package day02;
/**
 * Point 设计目的:表示直角坐标系上的一个点
 * 特征:x,y两个值
 * 
 * 使用这个类测试作为Object子类对相关方法的
 * 重写原则.
 * 
 * java中所有的类都继承自Object,当一个类没有
 * 使用extends显示继承任何一个类时,编译器在编译
 * 该类后默认会让其继承自Object.
 * 
 * @author adminitartor
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(){
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * 当一个对象的toString被使用,那么就应当
	 * 重写该方法.因为Object提供的该方法返回的
	 * 句柄对实际开发的价值不大.
	 * 重写toString方法的原则是返回的字符串中
	 * 应当包含当前对象需要让外界了解的属性信息.
	 * 格式没有要求,将来按照实际工作中的需求定.
	 * 
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
}















