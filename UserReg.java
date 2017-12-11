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

		JPasswordField jpf = new JPasswordField("",10);

		JLabel lbl = new JLabel("mail");
		JLabel lbl1 = new JLabel("password");

		pnl.setLayout(new GridLayout(2,2));
		pnl.add(lbl);
		pnl.add(jtf);
		pnl.add(lbl1);
		pnl.add(jpf);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
}
