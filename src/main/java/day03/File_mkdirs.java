package day03;

import java.io.File;

/**
 * 创建一个多级目录
 * @author adminitartor
 *
 */
public class File_mkdirs {
	public static void main(String[] args) {
		/*
		 * 在当前目录中创建
		 * ./a/b/c/d/e/f
		 */
		File dir = new File(
			"a"+File.separator+
			"b"+File.separator+
			"c"+File.separator+
			"d"+File.separator+
			"e"+File.separator+"f"
		);
		
		if(!dir.exists()){
			/*
			 * mkdirs是在创建当前File表示的目录
			 * 同时将该目录其上的所有不存在的父目录
			 * 一同创建出来.
			 */
			dir.mkdirs();
			System.out.println("创建完毕");
		}else{
			System.out.println("该目录已存在");
		}
	}
}







