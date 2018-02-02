import java.io.*;
import java.net.*;

public class MyServer02{
	public static void main(String[] args) throws InterruptedException{
		byte[] buff = new byte[1024];
		ServerSocket ss;
		Socket soc;
		OutputStream out;
		InetAddress ia;
		String msg;
		try{
			ss = new ServerSocket(6000, 30);
			System.out.println("サーバー建てたよ");
			while(true){
				soc = ss.accept();
				msg = "Connect!";
				out = soc.getOutputStream();
				ia = soc.getInetAddress();
				for(int i = 0; i < msg.length(); i++)
					out.write((int) msg.charAt(i));
				System.out.println("アドレス:"+ia+"からConnect");
				soc.close();
			}
		}catch (Exception e) {
			System.exit(1);	
		}
	}
}