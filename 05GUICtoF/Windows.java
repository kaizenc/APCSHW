import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Windows extends JFrame{
    private Container pane;

    private JButton b;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
    public Windows() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);


	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	b = new JButton("Convert");
	l = new JLabel("Converter",null,JLabel.CENTER);
	t = new JTextField(12);

	b.addActionListener(this);
	b.setActionCommand("Testing");

	pane.add(l);
	pane.add(b);
	pane.add(t);
    }

    public void actionPerformed(ActionEvent e) {
	if ("disable".equals(e.getActionCommand())) {
	    b2.setEnabled(false);
	    b1.setEnabled(false);
	    b3.setEnabled(true);
	} else {
	    b2.setEnabled(true);
	    b1.setEnabled(true);
	    b3.setEnabled(false);
	}
    } 

    public static void main(String[] args) {
        Windows g = new Windows();
        g.setVisible(true);
    }
}