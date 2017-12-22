import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiInput extends JFrame implements ActionListener{
	private JRadioButton[] rdb;
	
	public static void main(String[] args) {
		GuiInput gi = new GuiInput("GUI");
		gi.setVisible(true);
	}
	GuiInput(String tilte){
		setTitle(title);
		setSize(400,400);
		setLocation(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		rdb = new JRadioButton[3];
		rdb[0] = new JRadioButton("Male");
		rdb[1] = new JRadioButton("Female");
		rdb[2] = new JRadioButton("other");

	}
}