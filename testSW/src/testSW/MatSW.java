package testSW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MatSW {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
   private int calcul;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatSW window = new MatSW();
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
	public MatSW() {
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

		JButton btnNewButton = new JButton("=");

		btnNewButton.setBounds(239, 124, 89, 23);
		frame.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(10, 125, 78, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);


		textField_1 = new JTextField();
		textField_1.setBounds(152, 125, 77, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);


		textField_2 = new JTextField();
		textField_2.setBounds(338, 125, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul = 3;
			}
		});
		btnNewButton_1.setBounds(96, 124, 46, 23);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul=2;
			}
		});
		btnNewButton_2.setBounds(96, 90, 46, 23);
		frame.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul=1;

			}
		});
		btnNewButton_3.setBounds(96, 56, 46, 23);
		frame.getContentPane().add(btnNewButton_3);

		btnNewButton_4 = new JButton("*");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul=4;
			}
		});
		btnNewButton_4.setBounds(96, 156, 46, 23);
		frame.getContentPane().add(btnNewButton_4);


		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nb=0;
				int nb1=Integer.parseInt(textField.getText());
				int nb2=Integer.parseInt(textField_1.getText());
				

				if (calcul==1)
				{
					nb=nb1+nb2;
				}

				else
				{
					if (calcul==2)
					{
					nb=nb1-nb2;
					}
				
					else
					{
						if (calcul==3)
						{
						nb=nb1/nb2;
						}
						
							
						else
						{
								if (calcul==4)
								{
								nb=nb1*nb2;
								}
						}
					}

				}


				System.out.println(nb);

				String s=String.valueOf(nb);
				textField_2.setText(s);






			}
		});

	}
}
