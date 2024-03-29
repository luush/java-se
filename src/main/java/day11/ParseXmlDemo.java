package day11;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 解析XML
 * @author adminitartor
 *
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
//		list.add(new Emp(1,"张三",22,"男",3000));
//		list.add(new Emp(3,"李四",23,"女",4000));
//		list.add(new Emp(4,"王五",24,"男",5000));
//		list.add(new Emp(5,"赵六",25,"女",6000));
		/*
		 * 原来我们程序使用的数据都是写死在程序里的
		 * 这样带来的问题是数据发生改变就会修改源代码
		 * 这在实际开发中是极其不可取的!
		 * 所以在实际开发中,我们通常的作法是将程序
		 * 与程序运行时需要的数据分离开,将数据保存
		 * 到一个文件中,程序运行时通过读取文件中的
		 * 数据来运行.这样将来数据有修改只需要在该
		 * 文件中作出修改即可,程序无需做任何改动.
		 * 
		 * 将emplist.xml文件中的员工信息读出来存入
		 * List集合.
		 * 
		 * 使用DOM解析XML的大致步骤
		 * 1:创建SAXReader
		 * 2:使用SAXReader读取XML文档并生成
		 *   Document对象
		 *   这一步就是DOM耗时耗资源的地方,因为要
		 *   将XML文档全部读取完毕并以Document对象
		 *   存入内存.
		 * 3:通过Document获取根元素
		 * 4:按照XML文档结构从根元素开始逐级获取子元素
		 *   以达到获取XML文档数据的目的  
		 */
		try {
			//1
			SAXReader reader = new SAXReader();
			//2
//			reader.read(new File("emplist.xml"));
			Document doc = reader.read(
				new FileInputStream("emplist.xml")
			);
			System.out.println("读取XML文档完毕!");
			
			/*
			 * 3获取根元素
			 * Document提供的方法:
			 * Element getRootElement()
			 * 获取当前XML文档的根元素
			 * 
			 * org.dom4j下的Element的每一个实例
			 * 用于表示XML文档中的一个元素(一对标签)
			 * 
			 */
			Element root = doc.getRootElement();
			/*
			 * Element提供了获取当前元素信息的方法:
			 * 常用:
			 * 1:String getName()
			 *   获取当前元素的名字
			 * 2:String getText()
			 *   获取当前元素中间的文本数据(开始
			 *   标签与结束标签中间的文本内容)
			 * 3:List elements()
			 *   获取当前元素中的所有子元素
			 * 4:List elements(String name)
			 *   获取当前元素中的所有同名子元素
			 * 5:Element element(String name)
			 *   获取当前元素中指定名字的子元素 
			 * 6:String elementText(String name)
			 *   获取当前元素中指定名字子元素中间的
			 *   文本.
			 *   String str = ele.elementText(name);
			 *   效果等同于:
			 *   String str = ele.element(name).getText();
			 *   
			 * 7:Attribute attribute(String name)
			 *   获取当前元素中指定名字的属性
			 *   
			 * 8:String attributeValue(String name)
			 *   获取当前元素中指定名字的属性的值
			 *               
			 */
			
			List<Element> emplist = root.elements();
			for(Element empEle : emplist){
				//获取员工名字
				Element nameEle = empEle.element("name");
				String name = nameEle.getText();
				System.out.println(name);
				//获取年龄
				int age = Integer.parseInt(
					empEle.elementText("age")
				);
				//获取性别
				String gender = empEle.elementText("gender");
				
				//获取工资
				int salary = Integer.parseInt(
					empEle.elementText("salary")	
				);
				//获取ID属性
				int id = Integer.parseInt(
					empEle.attributeValue("id")
				);
				
				Emp emp = new Emp(id, name, age, gender, salary);
				list.add(emp);
			}
			
			
			System.out.println("解析完毕!");
			list.forEach((e)->System.out.println(e));
			
//			for(Emp e : list){
//				System.out.println(e);
//			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}





