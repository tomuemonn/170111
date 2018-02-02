import java.io.*;
import java.net.*;

public class MyClient02{
	public static void main(String[] args) throws Exception{
		
		byte[] buff = new byte[1024];
		Socket writeSocket;
		InputStream in;
		InputStreamReader inr;
		BufferedReader br;
		OutputStream out;
		PrintWriter pw;

		try{
			writeSocket = new Socket("localhost", 5999);
			in = writeSocket.getInputStream();
			out = writeSocket.getOutputStream();
			
			inr = new InputStreamReader(in);
			br = new BufferedReader(inr);

			System.out.println("送信するデータを書いてね");
			String msg = new java.util.Scanner(System.in).nextLine();
			pw = new PrintWriter(out);

			pw.println(msg);
			pw.flush();
	
		}catch(Exception e){
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
		}
	}
}