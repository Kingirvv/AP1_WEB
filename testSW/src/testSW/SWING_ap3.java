package testSW;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SWING_ap3 {

	private JFrame frame;
	private JTextField textField;
	private int tentative=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SWING_ap3 window = new SWING_ap3();
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
	public SWING_ap3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int nba;
		nba = (int)(Math.random()*(100-1));
		tentative=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Devine le nombre :");
		lblNewLabel.setBounds(10, 39, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(113, 36, 72, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre tentative :  0");
		lblNewLabel_1.setBounds(290, 98, 121, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(71, 207, 276, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Recommencez");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_1.setBounds(290, 207, 134, 23);
		frame.getContentPane().add(btnNewButton_1);

		
		JButton btnNewButton = new JButton("?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(nba);
				int nbj=Integer.parseInt(textField.getText());
				btnNewButton_1.setVisible(false);
				
				if (nbj<nba)
				{
					lblNewLabel_2.setText("Raté : le nombre à deviner est + grand !");
					tentative=tentative+1;
					lblNewLabel_1.setText("Nombre tentative : "+tentative);
				}
			
				else
				{
					if (nbj>nba)
					{
						lblNewLabel_2.setText("Raté : le nombre à deviner est + petit !");
						tentative=tentative+1;
						lblNewLabel_1.setText("Nombre tentative : "+tentative);
					}
					else
					{
							lblNewLabel_2.setText("Gagné !");
							tentative=tentative+1;
							lblNewLabel_1.setText("Nombre tentative : "+tentative);
							btnNewButton_1.setVisible(true);
							
						
					}
				}
			
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.setBounds(96, 81, 89, 104);
		frame.getContentPane().add(btnNewButton);
		
			}
}
