import java.io.*;
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("data.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		String userData = "";
		try{
			System.out.println("メッセージを入力してください。終了する場合は「exit」と入力してください。");
			while(true){
				System.out.print("メッセージを入力してください> ");
				userData = new Scanner(System.in).nextLine();
				if(userData.equals("exit")) break;
				bw.write(userData+"\r\n");
			}
			bw.close();
		}catch(IOException e){
			System.out.println("ファイルの書き込みに失敗しました。");
		}
	}
}