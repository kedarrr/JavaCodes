import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button extends JFrame 
{
	private JPanel contentPane;
	
	public static void main(String[] args) 
	{
		Button b = new Button();
		b.setVisible(true);
	}
	
	public Button() 
	{
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(45, 23, 97, 19);
		contentPane.add(l1);
		
		JButton b1 = new JButton("Click");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setText("Button Clicked.");
			}
		});
		b1.setBounds(45, 61, 97, 32);
		contentPane.add(b1);
	}
}
