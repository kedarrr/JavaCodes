import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class MouseKeyboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseKeyboard frame = new MouseKeyboard();
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
	public MouseKeyboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = e.getButton();
				if(i==1)
				{
					textField_1.setText("Left Key Pressed.");
				}
				if(i==2)
				{
					textField_1.setText("Middle Key Pressed.");
				}
				if(i==3)
				{
					textField_1.setText("Right Key Pressed.");
				}
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				textField.setText("X: "+x+"  "+"Y: "+y);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(46, 26, 127, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 80, 127, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int x = e.getKeyCode();
				String str="";
				if(x==KeyEvent.VK_F1)
				{
					str+="F1";
				}
				if(x==KeyEvent.VK_F2)
				{
					str+="F2";
				}
				if(x==KeyEvent.VK_F3)
				{
					str+="F3";
				}
				if(x==KeyEvent.VK_F4)
				{
					str+="F4";
				}
				if(x==KeyEvent.VK_F5)
				{
					str+="F5";
				}
				if(x==KeyEvent.VK_F6)
				{
					str+="F6";
				}
				if(x==KeyEvent.VK_F7)
				{
					str+="F7";
				}
				if(x==KeyEvent.VK_F8)
				{
					str+="F8";
				}
				if(x==KeyEvent.VK_F9)
				{
					str+="F9";
				}
				if(x==KeyEvent.VK_F10)
				{
					str+="F10";
				}
				if(x==KeyEvent.VK_F11)
				{
					str+="F11";
				}
				if(x==KeyEvent.VK_F12)
				{
					str+="F12";
				}
				if(x==KeyEvent.VK_ESCAPE)
				{
					str+="Escape";
				}
				if(x==KeyEvent.VK_CAPS_LOCK)
				{
					str+="CAPS_LOCK";
				}
				if(x==KeyEvent.VK_ALT)
				{
					str+="ALT";
				}
				if(x==KeyEvent.VK_UP)
				{
					str+="UP";
				}
				if(x==KeyEvent.VK_TAB)
				{
					str+="TAB";
				}
				if(x==KeyEvent.VK_BACK_SPACE)
				{
					str+="BACKSPACE ";
				}
				textArea.setText(str);
			}
		});
		textArea.setBounds(46, 135, 127, 27);
		contentPane.add(textArea);
	}

}
