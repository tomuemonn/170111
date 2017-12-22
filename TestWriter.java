import java.io.*;

public class TestWriter{
	public static void main(String[] args) throws IOException{
		try{
			FileWriter fw = new FileWriter("data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("ALOHA!");
			bw.close();
		}catch (Exception e) {
			System.out.println("ファイルの書き込みに失敗しました");
		}
	}
}