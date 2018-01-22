import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiInput extends JFrame implements ActionListener{
	private JLabel[] label;
	private JRadioButton[] rbtn;
	private JPanel[] pnl;
	private JButton btn;
	private JTextField jtf;
	private String msg = "";
	private String msg1 = "";
	private String msg2 = "";
	private String[] msg3;
	private String[] data = {"名前:","住所:","メールアドレス:","好きなもの:","血液型"};
	private int y = 0;

	GuiInput(String title){
		setTitle(title);
		setSize(1000,500);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.label = new JLabel[6];
		this.label[0] = new JLabel("");
		this.label[1] = new JLabel("");
		this.label[2] = new JLabel("");
		this.label[3] = new JLabel("");
		this.label[4] = new JLabel("");
		this.label[4].setLayout(new GridLayout(1,4));
		this.label[5] = new JLabel("順番に名前、住所、メールアドレス、好きなものを,区切りで書いてね。");

		this.rbtn = new JRadioButton[4];
		this.rbtn[0] = new JRadioButton("A型");
		this.rbtn[1] = new JRadioButton("B型");
		this.rbtn[2] = new JRadioButton("O型");
		this.rbtn[3] = new JRadioButton("AB型");

		this.btn = new JButton("保存&表示！");
		btn.addActionListener(this);
		

		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtn[0]);
		bg.add(rbtn[1]);
		bg.add(rbtn[2]);
		bg.add(rbtn[3]);

		this.jtf = new JTextField("",20);

		this.pnl = new JPanel[4];
		this.pnl[0] = new JPanel();
		this.pnl[1] = new JPanel();
		this.pnl[1].setLayout(new GridLayout(2,1));
		this.pnl[2] = new JPanel();
		this.pnl[2].setLayout(new GridLayout(5,1));
		this.pnl[3] = new JPanel();
		this.pnl[3].setLayout(new GridLayout(1,4));


		this.pnl[0].add(btn);

		this.pnl[1].add(this.label[5]);
		this.pnl[1].add(jtf);

		this.pnl[2].add(this.label[0]);
		this.pnl[2].add(this.label[1]);
		this.pnl[2].add(this.label[2]);
		this.pnl[2].add(this.label[3]);
		this.pnl[2].add(this.label[4]);

		this.pnl[3].add(this.rbtn[0]);
		this.pnl[3].add(this.rbtn[1]);
		this.pnl[3].add(this.rbtn[2]);
		this.pnl[3].add(this.rbtn[3]);



		Container cp = getContentPane();
		cp.add(this.pnl[0],BorderLayout.SOUTH);
		cp.add(this.pnl[1],BorderLayout.NORTH);
		cp.add(this.pnl[2],BorderLayout.EAST);
		cp.add(this.pnl[3],BorderLayout.WEST);
	}

	public void actionPerformed(ActionEvent e){	
		msg = jtf.getText();
		try{
			FileWriter fw = new FileWriter("guiData.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(msg);
			bw.close();
			FileReader fr = new FileReader("guiData.txt");
			BufferedReader br = new BufferedReader(fr);
			msg2 = br.readLine();
			msg3 = msg2.split(","); 
			for(int u = 0;u < 5;u++){
				this.label[u].setText(data[y]+msg3[u]);
				y++;
			}
		}catch (Exception r) {
			System.out.println("読み込み終了！");
		}
		Boolean result[] = new Boolean[4];
		for(int i = 0; i < 4; i++){
			result[i] = this.rbtn[i].isSelected();
			if(result[i]){
				msg1 = this.rbtn[i].getText();
				this.label[4].setText(msg1);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		GuiInput gi = new GuiInput("GI");
		gi.setVisible(true);
	}
}