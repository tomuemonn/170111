import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu extends JFrame implements ActionListener{
	
	private JLabel lbl;
	private JRadioButton[] rdb;
	private JCheckBox[] checkBox;

	public static void main(String[] args) {
		Fukushu fs = new Fukushu("復習！");
		fs.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String msg ="";
		for(int i = 0; i < 3; i++){
			if(this.checkBox[i].isSelected()){
				msg = msg + this.checkBox[i].getText()+"と";
			}
		}
		for(int i = 0; i < 3; i++){
			if(this.rdb[i].isSelected()){
				msg = msg + this.rdb[i].getText()+"が選択されています";
			}
		}
		lbl.setText(msg);
	}
	Fukushu(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

		JMenuItem fileItem1 = new JMenuItem("new");
		JMenuItem fileItem2 = new JMenuItem("open");
		JMenuItem fileItem3 = new JMenuItem("close");

		JMenuItem editItem1 = new JMenuItem("cut");
		JMenuItem editItem2 = new JMenuItem("copy");
		JMenuItem editItem3 = new JMenuItem("paste");

		JMenuItem helpItem1 = new JMenuItem("version");
		JMenuItem helpItem2 = new JMenuItem("index");

		setJMenuBar(menubar);

		menubar.add(fileMenu);
		menubar.add(editMenu);
		menubar.add(helpMenu);

		fileMenu.add(fileItem1);
		fileMenu.add(fileItem2);
		fileMenu.add(fileItem3);

		editMenu.add(editItem1);
		editMenu.add(editItem2);
		editMenu.add(editItem3);

		helpMenu.add(helpItem1);
		helpMenu.add(helpItem2);

		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new GridLayout(6,1));
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(new GridLayout(1,1));

		rdb = new JRadioButton[3];
		rdb[0] = new JRadioButton("RADIO");
		rdb[1] = new JRadioButton("Radio");
		rdb[2] = new JRadioButton("radio");

		ButtonGroup bgr = new ButtonGroup();
		bgr.add(rdb[0]);
		bgr.add(rdb[1]);
		bgr.add(rdb[2]);

		pnl1.add(rdb[0]);
		pnl1.add(rdb[1]);
		pnl1.add(rdb[2]);

		checkBox = new JCheckBox[3];
		checkBox[0] = new JCheckBox("CHECK");
		checkBox[1] = new JCheckBox("Check");
		checkBox[2] = new JCheckBox("check");

//		ButtonGroup bgc = new ButtonGroup();
//		bgc.add(checkBox[0]);
//		bgc.add(checkBox[1]);
//		bgc.add(checkBox[2]);

		pnl1.add(checkBox[0]);
		pnl1.add(checkBox[1]);
		pnl1.add(checkBox[2]);

		JButton btn = new JButton("OK");
		btn.addActionListener(this);

		lbl = new JLabel("");
		pnl2.add(lbl);

		Container cp = getContentPane();
		cp.add(pnl1,BorderLayout.WEST);
		cp.add(pnl2,BorderLayout.EAST);
		cp.add(btn,BorderLayout.SOUTH);
	}
}