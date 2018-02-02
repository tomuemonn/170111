import java.io.*;
import java.net.*;

public class MyClient04{
	public static void main(String[] args) throws InterruptedException{
		
		byte[] buff = new byte[1024];
		Socket soc;
		OutputStream out;
		String msg;

		try{
			soc = new Socket("localhost", 4999);
			msg =   "学籍番号:170111" +
					"\n" + "Githubのユーザー名: tomuemon" +
					"\n" + "ワッハッハ";  
			out = soc.getOutputStream();
			out.write(msg.getBytes());
			soc.close();
			
		}catch(Exception e){
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
		}
	}
}