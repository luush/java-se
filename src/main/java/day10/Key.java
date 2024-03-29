package day10;
/**
 * HashMap内部由数组实现,是当今查询速度最快的
 * 数据结构.
 * HashMap根据key元素决定这组键值对应当存放在
 * 数组的位置,并且也是根据key元素得到位置来检索
 * 数组中的该组键值对以此省去了遍历数组的过程.
 * 
 * 但是使用HashMap时应当尽量避免出现链表的情况.
 * HashMap中链表的产生原因:
 * HashMap是根据key元素的hashcode方法返回的数字
 * 经过散列计算得到该组键值对应当存放在数组的哪个
 * 位置,而根据key元素equals比较查看当前key是否
 * 已经存在于Map中,若存在则直接替换该位置这个key
 * 所对应的value,但是若数组该位置已经存在键值对,
 * 并且key与当前准备存放的键值对中的key的equals
 * 比较不同时,则会在数组当前位置产生链表.这样在
 * 将来根据key检索时会出现遍历链表的情况,这样就
 * 会降低HashMap查询性能.
 * 总结:当key元素hashcode值相同,但是equals比较不同
 *      时就会在HashMap中产生链表,影响查询性能.
 *      
 * JDK中提供的类作为Key元素没问题,都应妥善重写完毕.
 * 当我们自己定义的类需要做为key元素时,也要妥善的
 * 重写上述两个方法.
 *      
 * 在API手册的Object类中对equals,hashcode方法的
 * 重写有相关说明.重写准则:
 * 1:成对重写,即:当我们需要重写一个类的equals方法
 * 时,就应当连同重写hashcode方法.
 * 2:一致性,即:当两个对象equals比较为true时,hashcode
 *   返回的数字应当相等.反之亦然,因为若两个对象equals
 *   比较不同但是hashcode相等时在HashMap中会产生链表.
 * 3:hashcode的稳定性,即:当参与equals比较的属性值没有
 * 发生改变的前提下,多次调用hashcode方法返回的数字应当
 * 相等,不应当变化.
 * 
 * 
 * 
 * @author adminitartor
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}








