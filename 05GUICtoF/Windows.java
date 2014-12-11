import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Windows extends JFrame implements ActionListener{
	private Container pane;

	private JButton b,clear;
	private JLabel l;
	private JTextField t;
	private JCheckBox c;
	private Container text;
	private Container buttons;
	public Windows(){
		this.setTitle("C to F Converter!");
		this.setSize(600,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		pane = this.getContentPane();
		pane.setLayout(new FlowLayout());

		b = new JButton("Convert");
		l = new JLabel("Converter",null,JLabel.CENTER);
		t = new JTextField(12);

		b.setActionCommand("convert");
		b.addActionListener(this);
		clear.setActionCommand("delete");
		clear.addActionListener(this);

		pane.add(l);
		pane.add(b);
		pane.add(t);

		text = new Container();
		text.setLayout(new FlowLayout());
		text.add(l);
		text.add(t);
	}

	public void actionPerformed(ActionEvent e){
		String action = e.getActionCommand();
		if (action.equals("convert")){
			String s = t.getText();
			s = "" + (Double.parseDouble(s)*1.8+32);
			t.setText(s);
		}
		if (action.equals("delete")){
			t.setText("");
		}
	} 

	public static void main(String[] args){
		Windows g = new Windows();
		g.setVisible(true);
	}
}