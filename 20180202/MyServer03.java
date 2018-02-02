import java.io.*;
import java.net.*;

public class MyServer03{
	public static void main(String[] args) throws InterruptedException{
		byte[] buff = new byte[1024];
		ServerSocket ss;
		Socket soc;
		OutputStream out;
		InputStream in;
		InputStreamReader inr;
		BufferedReader br;
		PrintWriter pw;

		try{
			ss = new ServerSocket(5999, 30);
			System.out.println("サーバー建てたよ");
			while(true){
				soc = ss.accept();
				out = soc.getOutputStream();
				in = soc.getInputStream();
				inr = new InputStreamReader(in);
				br = new BufferedReader(inr);
				pw = new PrintWriter(out);

				System.out.println("Connect!");
				String clientData = br.readLine();
				System.out.println("クライアントから受信したデータ:" + clientData);
				soc.close();
			}
		}catch (Exception e) {
			System.exit(1);	
		}
	}
}