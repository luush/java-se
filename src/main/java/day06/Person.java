package day06;
/**
 * 使用当前类测试异常的抛出
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * throw用于抛出一个异常
	 * throws用于在方法上声明该方法可能抛出某些异常
	 *       以便通知调用者处理这些异常.
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException{
		if(age<0||age>100){
			throw new IllegalAgeException("年龄不合法!");
		}
		this.age = age;
	}
	
	
}








