import java.io.*;
import java.net.*;

public class MyClient03{
	public static void main(String[] args) throws Exception{
		
		byte[] buff = new byte[1024];
		Socket writeSocket;
		InputStream in;
		InputStreamReader inr;
		BufferedReader br;
		String msg;
		try{
			writeSocket = new Socket("localhost", 5000);
			in = writeSocket.getInputStream();
			inr = new InputStreamReader(in);
			br = new BufferedReader(inr);
	
			msg = br.readLine();
			System.out.println(msg);

		}catch(Exception e){
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
		}
	}
}