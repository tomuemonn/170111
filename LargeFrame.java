import javax.swing.JFrame;

public class LargeFrame extends JFrame {
	public static void main(String[] args){
		LargeFrame frame = new LargeFrame("HELLO");
		frame.setVisible(true);
	}
	LargeFrame(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
