package day03;

import java.io.File;

/**
 * java.io.File
 * File表示操作系统中文件系统里的一个文件或目录
 * 使用File可以:
 * 1:访问一个文件或目录的属性信息
 * 2:操作一个文件或目录(创建,删除)
 * 3:访问一个目录的子项
 * 但是不能使用File访问文件数据.
 * @author adminitartor
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 在创建File的时候书写路径尽量使用相对
		 * 路径.避免平台差异性.
		 * 目录层级分隔符应当使用File提供的一个
		 * 常量:File.separator
		 * 
		 * 常见的相对路径:
		 * 1".":表示当前目录,当前目录视运行环境
		 *     不同路径也不同.在eclipse中运行
		 *     java程序时的当前目录是当前类所在
		 *     项目的根目录
		 * 2类加载路径    
		 */
		File file = new File(
			"."+File.separator+"test.txt"
		);
		
		String name = file.getName();
		System.out.println(name);
		
		long length = file.length();
		System.out.println(length);
		
		boolean canRead = file.canRead();//可读
		boolean canWrite = file.canWrite();//可写
		System.out.println("可读:"+canRead);
		System.out.println("可写:"+canWrite);
		
		boolean isHidden = file.isHidden();
		System.out.println("是否为隐藏文件:"+isHidden);
	}
}















