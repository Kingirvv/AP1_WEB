package testSW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SWING_calculatrice {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SWING_calculatrice window = new SWING_calculatrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SWING_calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.setBounds(105, 205, 45, 45);
		frame.getContentPane().add(btnNewButton_0);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(60, 71, 45, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(105, 71, 45, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBounds(150, 71, 45, 45);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(60, 115, 45, 45);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(105, 115, 45, 45);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBounds(150, 115, 45, 45);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBounds(60, 160, 45, 45);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBounds(105, 160, 45, 45);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBounds(150, 160, 45, 45);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_CE = new JButton("CE");
		btnNewButton_CE.setBounds(60, 205, 45, 45);
		frame.getContentPane().add(btnNewButton_CE);
		
		JButton btnNewButton_diviser = new JButton("/");
		btnNewButton_diviser.setBounds(195, 71, 45, 45);
		frame.getContentPane().add(btnNewButton_diviser);
		
		JButton btnNewButton_moins = new JButton("-");
		btnNewButton_moins.setBounds(195, 160, 45, 45);
		frame.getContentPane().add(btnNewButton_moins);
		
		JButton btnNewButton_fois = new JButton("*");
		btnNewButton_fois.setBounds(195, 115, 45, 45);
		frame.getContentPane().add(btnNewButton_fois);
		
		JButton btnNewButton_plus = new JButton("+");
		btnNewButton_plus.setBounds(195, 205, 45, 45);
		frame.getContentPane().add(btnNewButton_plus);
		
		JButton btnNewButton_egal = new JButton("=");
		btnNewButton_egal.setBounds(150, 205, 45, 45);
		frame.getContentPane().add(btnNewButton_egal);
		
		textField = new JTextField();
		textField.setBounds(60, 38, 180, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
