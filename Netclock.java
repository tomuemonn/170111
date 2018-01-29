import java.io.*;
import java.net.*;

public class Netclock{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		ServerSocket servsock;
		Socket clientSock;
		OutputStream out;
		InputStream in;
		InputStreamReader inr;
		BufferedReader br;
		PrintWriter pw;
		String outstr;
		int i = 0;
		boolean cont = true;

		try{
			servsock = new ServerSocket(6000, 200);
			System.out.println("サーバー建てたよ！");

			clientSock = servsock.accept();
			out = clientSock.getOutputStream();
			in = clientSock.getInputStream();
			inr = new InputStreamReader(in);
			br = new BufferedReader(inr);
			pw = new PrintWriter(out);

			while(cont){
				if(i==0){
					System.out.println("Connect!");
					i++;
				}

				String clientData = br.readLine();
				if(clientData.equals("end")){
					cont = false;
				}
				System.out.println("クライアントから受信したデータ:" + clientData);
				
				pw.flush();
			}
			clientSock.close();
		}catch (IOException e){
			System.exit(1);
		}
	}
}