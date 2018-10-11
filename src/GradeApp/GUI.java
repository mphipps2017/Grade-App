package GradeApp;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class GUI extends JFrame{
	
	private JFrame jframe;
	private JTextField item1;
	
	public GUI() {
		super("Title");
		setLayout(new FlowLayout());
		item1 = new JTextField("Text                     ");
		add(item1);
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(275,180);
		gui.setVisible(true);
	}
}
