import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiInputTest extends JFrame implements ActionListener{	
	public static void main(String[] args) {
		GuiInputTest gi = new GuiInputTest("GUI");
		gi.setVisible(true);
	}
	GuiInputTest(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


	}
}