package day03;

import java.io.File;

/**
 * 删除一个目录
 * @author adminitartor
 *
 */
public class File_delete2 {
	public static void main(String[] args) {
		/*
		 *	将当前目录中的demo目录删除 
		 */
		File dir = new File("demo");
		if(dir.exists()){
			/*
			 *	delete方法在删除目录的时候
			 *  需要注意,只能删除空目录. 
			 */
			dir.delete();
			System.out.println("目录已删除");
		}else{
			System.out.println("该目录不存在");
		}
		
	}
}



