package day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * 
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("movie.mp4");		
		FileOutputStream fos
			= new FileOutputStream("movie_cp3.mp4");	
		byte[] data = new byte[1024*10];//10k
		int len = -1;//保存每次实际读取到的字节量
		while((len = fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}
}




