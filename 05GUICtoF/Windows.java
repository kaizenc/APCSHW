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
		this.setSize(300,150);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		pane = this.getContentPane();
		pane.setLayout(new GridLayout(2,1));

		b = new JButton("Convert");
		l = new JLabel("Converter",null,JLabel.CENTER);
		t = new JTextField(12);
		clear = new JButton("Clear");

		b.setActionCommand("convert");
		b.addActionListener(this);
		clear.setActionCommand("delete");
		clear.addActionListener(this);

		buttons = new Container();
		buttons.setLayout(new FlowLayout());
		buttons.add(clear);
		buttons.add(b);

		text = new Container();
		text.setLayout(new FlowLayout());
		text.add(l);
		text.add(t);

		pane.add(text);
		pane.add(buttons);
	}

	public void actionPerformed(ActionEvent e) throws NumberFormatException{
		double x;
		String action = e.getActionCommand();
		loop:
		if (action.equals("convert")){
			String s = t.getText();
			try{
				x = Double.parseDouble(s);
			}catch (NumberFormatException except){
				System.out.println("Not a number, silly");
				break loop;
			}
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