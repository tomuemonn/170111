import javax.swing.*;
import java.awt.*;

public class Hello extends JFrame{
	public static void main(String[] args) {
		Hello hello = new Hello("HELLO");
		hello.setVisible(true);
	}
	Hello(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton btn = new JButton("Click Me!");

		JPanel pnl = new JPanel();
		pnl.add(btn);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.SOUTH);
	}
}
