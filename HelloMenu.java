import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame{
	public static void main(String[] args) {
		HelloMenu hm = new HelloMenu("Menu!");
		hm.setVisible(true);
	}
	HelloMenu(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem menuItem1 = new JMenuItem("New");
		JMenuItem menuItem2 = new JMenuItem("Open");

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);
	}
}