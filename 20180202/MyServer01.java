import java.io.*;
import java.net.*;

public class MyServer01{
	public static void main(String[] args) throws InterruptedException{
		byte[] buff = new byte[1024];
		ServerSocket ss;
		Socket soc;
		OutputStream out;

		try{
			ss = new ServerSocket(6000, 30);
			System.out.println("サーバー建てたよ");
			while(true){
				soc = ss.accept();
				out = soc.getOutputStream();
				System.out.println("Connect");
				soc.close();
			}
		}catch (Exception e) {
			System.exit(1);	
		}
	}
}