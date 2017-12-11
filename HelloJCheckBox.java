import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJCheckBox extends JFrame implements ActionListener{
	private JLabel lbl;
//	private JLabel lbl1;
//	private JLabel lbl2;
	private JCheckBox check;
	private JCheckBox check1;
	private JCheckBox check2;
	public static void main(String[] args){
		HelloJCheckBox hcb = new HelloJCheckBox("CheckBox!");
		hcb.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(this.check.isSelected()){
			this.lbl.setText(this.check.getText()+"が選択されています");
		}else//{
//			this.lbl.setText("");
//		}
		if(this.check1.isSelected()){
			this.lbl.setText(this.check1.getText()+"が選択されています");
		}else//{
//			this.lbl.setText("");
//		}
		if(this.check2.isSelected()){
			this.lbl.setText(this.check2.getText()+"が選択されています");
		}else{
			this.lbl.setText("");
		}
	}
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(300,200);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnl = new JPanel();
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		pnl.setLayout(new GridLayout(3,1));
		pnl2.setLayout(new GridLayout(3,1));
		this.check = new JCheckBox("Tank",true);
		this.check1 = new JCheckBox("Carry");
		this.check2 = new JCheckBox("Sup");
		ButtonGroup bg = new ButtonGroup();
		bg.add(check);
		bg.add(check1);
		bg.add(check2);
		JButton btn = new JButton("Click");
		btn.addActionListener(this);
		this.lbl = new JLabel("Hello");
//		this.lbl1 = new JLabel("Hello");
//		this.lbl2 = new JLabel("Hello");

		pnl.add(check);
		pnl.add(check1);
		pnl.add(check2);
		pnl1.add(btn);
		pnl2.add(this.lbl);
//		pnl2.add(this.lbl1);
//		pnl2.add(this.lbl2);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.WEST);
		cp.add(pnl1,BorderLayout.SOUTH);
		cp.add(pnl2,BorderLayout.EAST);
	}
}
