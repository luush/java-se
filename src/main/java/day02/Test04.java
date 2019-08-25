package day02;

public class Test04 {
	public static void main(String[] args) {
		String url = "GET /reg?username=fanchuanqi&password=123456&nickname=fanfan&phonenumber=1354444444 HTTP/1.1";
		/*
		 * 解析该请求内容,
		 * 输出:
		 * method:GET
		 * uri:/reg
		 * protocol:HTTP/1.1
		 * 注册用户信息:fanchuanqi,123456,fanfan,1354444444
		 * 其中用户信息解析出来后存入一个UserInfo对象中
		 * 然后在注册用户信息输出时,输出该对象toString返回
		 * 的字符串.
		 */
		//1按照空格拆分
		String[] data = url.split("\\s");
		String method = data[0];
		String uri = data[1];
		String protocol = data[2];
		
		//2解析uri
		//2.1首先按照?拆分两部分
		data = uri.split("\\?");
		uri = data[0];
		/*
		 * data[1]:username=fanchuanqi&password=123456&nickname=fanfan&phonenumber=1354444444
		 */
		//2.2按照"&"拆分出每一个参数
		String[] argArray = data[1].split("&");
		//2.3实例化一个UserInfo用于保存用户信息
		UserInfo userInfo = new UserInfo();
		//2.4将每一个参数按照"="拆分
		for(int i=0;i<argArray.length;i++){
			//arg:username=fanchuanqi 
			String arg = argArray[i];
			String[] infos = arg.split("=");
			if(infos[0].equals("username")){
				userInfo.setUsername(infos[1]);
			}else if(infos[0].equals("password")){
				userInfo.setPassword(infos[1]);
			}else if(infos[0].equals("nickname")){
				userInfo.setNickname(infos[1]);
			}else if(infos[0].equals("phonenumber")){
				userInfo.setPhonenumber(Integer.parseInt(infos[1]));
			}
		}
		/*
		 * method:GET
		 * uri:/reg
		 * protocol:HTTP/1.1
		 * 注册用户信息:
		 */
		System.out.println("method:"+method);
		System.out.println("uri:"+uri);
		System.out.println("protocol:"+protocol);
		System.out.println("注册用户信息:"+userInfo);
		
	}
}

class UserInfo{
	private String username;
	private String password;
	private String nickname;
	private int phonenumber;
	/*
	 * 添加构造方法,get,set方法,重写toString方法
	 * toString方法返回的字符串格式:
	 * username,password,nickname,phonenumber
	 * 例如:
	 * fanchuanqi,123456,fanfan,1354444444
	 */
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return username+","+password+","+nickname+","+phonenumber;
	}
}





