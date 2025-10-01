import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class biblio {

	private JFrame frame;
	private ArrayList <Livre> listeLivres =new ArrayList<>();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biblio window = new biblio();
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
	public biblio() {
		
		Livre livre1 = new Livre("1111111","titre 1", "auteur 1", 1);
		Livre livre2 = new Livre("2222222","titre 2", "auteur 2", 2);
		Livre livre3 = new Livre("3333333","titre 3", "auteur 3", 3);
		Livre livre4 = new Livre("4444444","titre 4", "auteur 4", 4);
		listeLivres.add(livre1);
		listeLivres.add(livre2);
		listeLivres.add(livre3);
		listeLivres.add(livre4);
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
		
		JLabel lblNewLabel = new JLabel("Nombre de livre :");
		lblNewLabel.setBounds(30, 177, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_nbLivre = new JLabel("New label");
		lblNewLabel_nbLivre.setBounds(141, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_nbLivre);
		lblNewLabel_nbLivre.setText(String.valueOf(listeLivres.size()));
		
		
		
		JLabel lblNewLabel_isbn = new JLabel("ISBN DU LIVRE");
		lblNewLabel_isbn.setBounds(10, 23, 105, 14);
		frame.getContentPane().add(lblNewLabel_isbn);
		
		JLabel lblNewLabel_titre = new JLabel("TITRE DU LIVRE");
		lblNewLabel_titre.setBounds(10, 48, 105, 14);
		frame.getContentPane().add(lblNewLabel_titre);
		
		JLabel lblNewLabel_prix = new JLabel("PRIX DU LIVRE");
		lblNewLabel_prix.setBounds(10, 73, 105, 14);
		frame.getContentPane().add(lblNewLabel_prix);
		
		textField = new JTextField();
		textField.setBounds(125, 20, 135, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 45, 135, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 70, 135, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_recher = new JButton("Rechercher");
		btnNewButton_recher.setBounds(301, 19, 106, 23);
		frame.getContentPane().add(btnNewButton_recher);
		
		JButton btnNewButton_ajout = new JButton("AJOUTER");
		btnNewButton_ajout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livre livre5 = new Livre("5555555","titre 5", "auteur 5", 5);
				listeLivres.add(livre5);
				lblNewLabel_nbLivre.setText(String.valueOf(listeLivres.size()));
				
				
			}
		});
		btnNewButton_ajout.setBounds(50, 118, 89, 23);
		frame.getContentPane().add(btnNewButton_ajout);
	}
}
