import javax.swing.*;
import java.awt.*;

public class UserReg extends JFrame{
	public static void main(String[] args){
		UserReg ur = new UserReg("HELLO!");
		ur.setVisible(true);
	}
	UserReg(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnl = new JPanel();

		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("",4);

		JLabel lbl = new JLabel("mail");
		JLabel lbl1 = new JLabel("password");

		pnl.add(lbl,BorderLayout.NORTH);
		pnl.add(jtf,BorderLayout.NORTH);
		pnl.add(lbl1,BorderLayout.NORTH);
		pnl.add(jpf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
}
