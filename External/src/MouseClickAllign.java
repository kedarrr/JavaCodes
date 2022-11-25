import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClickAllign extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseClickAllign frame = new MouseClickAllign();
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
	public MouseClickAllign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		textField = new JTextField();
		textField.setBounds(119, 42, 214, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = e.getX();
				if(i<=120)
				{
					textField.setHorizontalAlignment(JTextField.LEFT);
				}
				if(i<=240 && i>120)
				{
					textField.setHorizontalAlignment(JTextField.CENTER);
				}
				if(i>240)
				{
					textField.setHorizontalAlignment(JTextField.RIGHT);
				}
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}

}
