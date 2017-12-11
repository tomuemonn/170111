import javax.swing.*;
import java.awt.*;

public class HelloJCheckBox extends JFrame{
	public static void main(String[] args){
		HelloJCheckBox hcb = new HelloJCheckBox("CheckBox!");
		hcb.setVisible(true);
	}
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,1));
		JCheckBox check = new JCheckBox("Tank");
		JCheckBox check1 = new JCheckBox("Carry");
		JCheckBox check2 = new JCheckBox("Sup");


		pnl.add(check);
		pnl.add(check1);
		pnl.add(check2);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
}
