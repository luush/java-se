package day03;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author adminitartor
 *
 */
public class File_listFiles {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有子项
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * 判断当前File表示的是否为一个文件
		 * 
		 * boolean isDirectory()
		 * 判断当前File表示的是否为一个目录
		 */
		if(dir.isDirectory()){
			/*
			 * File[] listFiles()
			 * 获取当前目录中的所有子项
			 */
			File[] subs = dir.listFiles();
			System.out.println("subs:"+subs.length);
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				if(sub.isDirectory()){
					System.out.print("目录:");
				}
				if(sub.isFile()){
					System.out.print("文件:");
				}
				System.out.println(sub.getName());
			}
		}
	}
}








