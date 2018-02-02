import java.io.*;
import java.net.*;

public class MyServer04{
	public static void main(String[] args) throws InterruptedException{
		byte[] buff = new byte[1024];
		ServerSocket ss;
		Socket soc;
		OutputStream out;
		PrintWriter pw;
		String msg = "HELLO";

		try{
			ss = new ServerSocket(5000, 30);
			System.out.println("サーバー建てたよ");
			while(true){
				soc = ss.accept();
				out = soc.getOutputStream();
				pw = new PrintWriter(out);
				pw.println(msg);
				pw.flush();
				System.out.println("Connect");
				soc.close();
			}
		}catch (Exception e) {
			System.exit(1);	
		}
	}
}