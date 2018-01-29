import java.io.*;
import java.net.*;

public class Writenet{
	public static void main(String[] args) throws Exception{
		
		byte[] buff = new byte[1024];
		Socket writeSocket;
		InputStream in;
		InputStreamReader inr;
		BufferedReader br;
		OutputStream out;
		PrintWriter pw;
		boolean cont = true;

		try{
			writeSocket = new Socket("172.16.21.46", 6000);
			while(cont){
				in = writeSocket.getInputStream();
				out = writeSocket.getOutputStream();
			
				inr = new InputStreamReader(in);
				br = new BufferedReader(inr);

				String msg = new java.util.Scanner(System.in).nextLine();
				if(msg.equals("end")){
					cont = false;
					System.out.println("終了します");
				}else{
					System.out.println(msg+"を送信しました。終わる場合は、｢end｣と打ってください。");
				}
				pw = new PrintWriter(out);

				pw.println(msg);
				pw.flush();
			}
		}catch(Exception e){
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
		}
	}
}