import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Fonting extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fonting frame = new Fonting();
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
	public Fonting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(94, 43, 194, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("BOLD");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font f = new Font("Times New Roman",Font.BOLD,23);
				textField.setFont(f);
			}
		});
		rdbtnNewRadioButton.setBounds(41, 126, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnItalic = new JRadioButton("Italic");
		rdbtnItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font f = new Font("Times New Roman",Font.ITALIC,23);
				textField.setFont(f);
			}
		});
		rdbtnItalic.setBounds(130, 175, 103, 21);
		contentPane.add(rdbtnItalic);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Underline");
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font f = new Font("Times New Roman",Font.PLAIN,23);
				Map attributes = f.getAttributes();
				attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
				textField.setFont(f.deriveFont(attributes));
			}
		});
		rdbtnNewRadioButton_1_1.setBounds(241, 126, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
	}
}
