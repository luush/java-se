package day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易的记事本
 * 程序启动后,要求用户输入一个文件名
 * 然后对该文件写数据.
 * 用户输入的每一行内容都写入该文件.当用户输入exit
 * 时程序退出.
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Note note = new Note();
		note.start();
	}
	/**
	 * 程序开始
	 * @throws IOException 
	 */
	public void start() throws IOException{
		//1 获取用户输入的文件
		File file = getUserFile();
		//2 保存用户输入的信息
		writeUserInfo(file);
	}
	/**
	 * 获取用户输入的每行信息并写入到指定文件
	 * @throws IOException 
	 */
	private void writeUserInfo(File file) throws IOException{
		RandomAccessFile raf
			= new RandomAccessFile(file,"rw");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请开始输入内容:");
		while(true){
			String line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			raf.write(line.getBytes("UTF-8"));
			
		}
		System.out.println("再见!");
		raf.close();
	}
	
	/**
	 * 获取用户输入的文件
	 * @return
	 */
	private File getUserFile(){
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("请输入文件名:");
			String fileName = scanner.nextLine();
			File file = new File(fileName);
			if(file.exists()){
				System.out.println(fileName+"已经存在,是否使用该文件? 1:使用 0:重新设置 ");
				String input = scanner.nextLine();
				if("0".equals(input)){
					continue;
				}else{
					return file;
				}
			}
		}
	}
}







