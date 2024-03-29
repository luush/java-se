package day13;

import java.lang.reflect.Method;

/**
 * 调用一个含有参数的方法
 * @author adminitartor
 *
 */
public class ClassDemo3 {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.sayInfo("我是实参!");
		
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Class c = loader.loadClass("day13.Person");
		
		//获取用于描述String的Class实例
//		Class strc = String.class;
//		strc = loader.loadClass("java.lang.String");
		/*
		 * 获取有参方法:
		 * 参数1:该方法的名字
		 * 参数2:这是一个Class类型的数组,数组中的每个
		 *       元素表示要获取的方法的参数类型.需要
		 *       注意,这个数组中的元素个数,类型,顺序
		 *       必须与要获取的方法的参数列表一致
		 * 下面方法获取的是Person中的方法:
		 * sayInfo(String s,int i)
		 *       
		 */
		Method m = c.getDeclaredMethod(
			"sayInfo", 
			new Class[]{String.class,int.class}
		);
		Object o = c.newInstance();
		/*
		 * 调用invoke时,第二个参数为一个对象数组.
		 * 数组中的每个元素就是调用这个方法是需要
		 * 传入的实际参数.
		 * 下面代码等同调用:
		 * p.sayInfo("苍苍",55)
		 */
		m.invoke(o, new Object[]{"苍苍",55});
	}
}





