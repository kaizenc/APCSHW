import javax.swing.*;
import java.awt.*;
import java.awt.event.*;]
//Upload to GitHub with 05GUICtoF
public class Windows extends JFrame {
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
	pane.add(l);
	pane.add(b);
	pane.add(t);
    }

    public static void main(String[] args) {
        Windows g = new Windows();
        g.setVisible(true);
    }
}