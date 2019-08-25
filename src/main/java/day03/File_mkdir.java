package day03;

import java.io.File;

/**
 * 创建一个目录
 * @author adminitartor
 *
 */
public class File_mkdir {
	public static void main(String[] args) {
		/*
		 *	在当前目录中创建一个名为demo的目录 
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("创建完毕!");
		}else{
			System.out.println("该目录已存在!");
		}
	}
}








