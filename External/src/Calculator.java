import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 10, 148, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(22, 42, 148, 22);
		contentPane.add(textArea_1);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
			}
		});
		btnNewButton.setBounds(22, 82, 46, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
			}
		});
		btnNewButton_1.setBounds(78, 82, 46, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
			}
		});
		btnNewButton_2.setBounds(134, 82, 46, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
			}
		});
		btnNewButton_3.setBounds(22, 123, 46, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
			}
		});
		btnNewButton_4.setBounds(78, 123, 46, 31);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
			}
		});
		btnNewButton_5.setBounds(134, 123, 46, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
			}
		});
		btnNewButton_6.setBounds(22, 164, 46, 31);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
			}
		});
		btnNewButton_7.setBounds(78, 164, 46, 31);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
			}
		});
		btnNewButton_8.setBounds(134, 164, 46, 31);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
			}
		});
		btnNewButton_9.setBounds(78, 205, 46, 31);
		contentPane.add(btnNewButton_9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnC.setBounds(22, 205, 46, 31);
		contentPane.add(btnC);
		
		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(".");
			}
		});
		btnNewButton_11.setBounds(134, 205, 46, 31);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
			}
		});
		btnNewButton_12.setBounds(215, 82, 46, 31);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("-");
			}
		});
		btnNewButton_13.setBounds(215, 123, 46, 31);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("*");
			}
		});
		btnNewButton_14.setBounds(215, 164, 46, 31);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("/");
			}
		});
		btnNewButton_15.setBounds(215, 205, 46, 31);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str = new String[2];
				if(textArea.getText().contains("+"))
				{
					str = textArea.getText().split("\\+");
					double x = Double.parseDouble(str[0]);
					double y = Double.parseDouble(str[1]);
					double z = x+y;
					textArea_1.setText(String.valueOf(z));
				}
				if(textArea.getText().contains("-"))
				{
					str = textArea.getText().split("-");
					double x = Double.parseDouble(str[0]);
					double y = Double.parseDouble(str[1]);
					double z = x-y;
					textArea_1.setText(String.valueOf(z));
				}
				if(textArea.getText().contains("*"))
				{
					str = textArea.getText().split("\\*");
					double x = Double.parseDouble(str[0]);
					double y = Double.parseDouble(str[1]);
					double z = x*y;
					textArea_1.setText(String.valueOf(z));
				}
				if(textArea.getText().contains("/"))
				{
					str = textArea.getText().split("/");
					double x = Double.parseDouble(str[0]);
					double y = Double.parseDouble(str[1]);
					double z = x/y;
					textArea_1.setText(String.valueOf(z));
				}
			}
		});
		btnNewButton_16.setBounds(269, 82, 46, 154);
		contentPane.add(btnNewButton_16);
	}
}
