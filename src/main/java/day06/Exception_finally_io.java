package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 异常处理机制在IO中的应用
 * @author adminitartor
 *
 */
public class Exception_finally_io {
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			InputStream in = System.in;
			InputStreamReader isr 
				= new InputStreamReader(in);
			br = new BufferedReader(isr);
			String line = null;
			while(true){
				line = br.readLine();
				if("exit".equals(line)){
					break;
				}
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("出错了!");
		}finally{
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}





