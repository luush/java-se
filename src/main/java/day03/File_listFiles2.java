package day03;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的listFiles方法
 * 该方法允许我们传入一个文件过滤器FileFilter
 * 该方法会将File表示的目录中所有满足过滤器要求的
 * 子项返回,而不满足的则被忽略.
 * @author adminitartor
 *
 */
public class File_listFiles2 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中所有名字以"."开头的子项
		 */
		File dir = new File(".");
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("正在过滤子项:"+name);
				return name.startsWith(".");
			}
			
		};
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}









