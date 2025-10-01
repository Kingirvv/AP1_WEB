package ARRAY;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Livre> liste = new ArrayList<Livre>();
		

		
		Livre livre1,livre2,livre3,livre4;
		int prix;
		String titre, Auteur;
		livre1 = new Livre("1111111","titre 1", "auteur 1", 1);
		livre2 = new Livre("2222222","titre 2", "auteur 2", 2);
		livre3 = new Livre("3333333","titre 3", "auteur 3", 3);
		livre4 = new Livre("4444444","titre 4", "auteur 4", 4);
		
		liste.add(livre1);
		liste.add(livre2);
		liste.add(livre3);
		liste.add(livre4);
		
		
		livre1.Afficher();
		System.out.println("");
		livre2.Afficher();
		System.out.println("");
		livre3.Afficher();
		System.out.println("");
		livre4.Afficher();
	}

}
