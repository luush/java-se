package day08;
/**
 * 使用当前类作为集合元素测试集合对自定义类型元素
 * 的排序
 * @author adminitartor
 *
 */
public class Point2 
			implements Comparable<Point2>{
	private int x;
	private int y;
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
	public Point2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	/**
	 * 当一个类实现了Comparable接口后,就要求必须
	 * 重写方法:compareTo
	 * 该方法的作用是用当前对象(this)与参数对象o
	 * 比较大小.
	 * 返回值是一个整数,返回值并不关注具体取值,而
	 * 关注的是取值范围:
	 * 当返回值>0:即表示当前对象大于参数对象(this>o)
	 * 当返回值<0:即表示当前对象小于参数对象
	 * 当返回值=0:两个对象相等
	 */
	public int compareTo(Point2 o) {
		/*
		 * 点到原点的距离长的大
		 */
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}

}





