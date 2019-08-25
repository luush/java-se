package day02;
/**
 * 
 * @author adminitartor
 *
 */
public class Test01 {
	public static void main(String[] args) {
		/*
		 * 
		 * HTTP协议的请求行格式:
		 * method uri protocol
		 * 例如:
		 * GET /index.html HTTP/1.1
		 */
		String line = "GET /index.html HTTP/1.1";
		
		String method,uri,protocol;
		String[] data = line.split("\\s");
//		System.out.println(data.length);
//		for(int i=0;i<data.length;i++){
//			System.out.println(data[i]);
//		}
		method = data[0];
		uri = data[1];
		protocol = data[2];
		
		/*
		 * method:GET
		 * uri:/index.html
		 * protocol:HTTP/1.1
		 */
		System.out.println("method:"+method);
		System.out.println("uri:"+uri);
		System.out.println("protocol:"+protocol);
	}
}






