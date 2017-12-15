import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJRadioButton extends JFrame implements ActionListener{
	private JLabel lbl;
	private JCheckBox[] check;
	
	public static void main(String[] args){
		HelloJRadioButton hjrb = new HelloJRadioButton("RadioButton");
		hjrb.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		for(int i = 0; i < 3; i++){
			if(this.check[i].isSelected()){
				this.lbl.setText(this.check[i].getText()+"が選択されています。");
				i = 3;
			}else{
				this.lbl.setText("何も選択されていません。");
			}
		}
	}
	
	HelloJRadioButton(String title){
		setTitle(title);
		setSize(300,200);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.lbl = new JLabel("Hello");
		this.check = new JCheckBox[3];
		this.check[0] = new JCheckBox("Tank");
		this.check[1] = new JCheckBox("Carry");
		this.check[2] = new JCheckBox("Sup");
		ButtonGroup bg = new ButtonGroup();
		bg.add(check[0]);
		bg.add(check[1]);
		bg.add(check[2]);

		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new GridLayout(3,1));
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(new GridLayout(1,1));
		JPanel pnl3 = new JPanel();
		JButton btn = new JButton("Ok!");
		btn.addActionListener(this);	

		pnl1.add(this.check[0]);
		pnl1.add(this.check[1]);
		pnl1.add(this.check[2]);
		pnl2.add(lbl);
		pnl3.add(btn);

		Container cp = getContentPane();
		cp.add(pnl1,BorderLayout.WEST);
		cp.add(pnl2,BorderLayout.EAST);
		cp.add(pnl3,BorderLayout.SOUTH);

	}
}