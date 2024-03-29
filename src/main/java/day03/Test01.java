package day03;

import java.io.File;

/**
 * 1:编写一段程序,要求实现1+2+3+4+...100
 *   并输出结果.
 *   在这段代码中不得出现for,while关键字
 *   
 * 2:假如1块钱可以买1瓶汽水,3个瓶盖可以换一瓶汽水
 *   2个空瓶可以换一瓶汽水,编一段程序计算20块钱总
 *   共可以买到多少瓶汽水?  
 * 
 * 
 * 
 * 练习:删除给定的File表示的文件或目录
 * @author adminitartor
 *
 */
public class Test01 {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	
	public static void delete(File f){
		if(f.isDirectory()){
			//先将该目录中所有子项删除
			File[] subs = f.listFiles();
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				delete(sub);//递归调用
			}
		}
		f.delete();
	}
}





