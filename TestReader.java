import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) throws IOException{
		try{
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Hello");
			while(true){
				String msg = br.readLine();
				if(msg.equals(null)){
					break;
				}else{
					System.out.println(msg);
				}
			}
		}catch(NullPointerException e){
			System.out.println("読み込み終了！");
		}
	}
}