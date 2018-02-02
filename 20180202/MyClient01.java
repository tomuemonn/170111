import java.io.*;
import java.net.*;

public class MyClient01{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		Socket soc;
		InputStream input;

		try{
			soc = new Socket("localhost", 5000);
			input = soc.getInputStream();
			int n = input.read(buff);
			System.out.write(buff, 0, n);
		}catch (Exception e) {
			System.err.println("ネットワークエラーです。");
			System.exit(1);
		}
	}
}