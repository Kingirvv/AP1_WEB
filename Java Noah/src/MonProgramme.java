import java.util.Scanner;

public class MonProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // AFFICHER HELLO
		System.out.println("Hello");
		
		// VARIABLE ET OPERATION
		int unentier, unentier2;
		String unechaine;
		float undecimal;
		boolean unbool;
		
		unentier=1;
		unentier2 = unentier+3;
		
		System.out.println("Valeur de l'entier 2 :"+unentier2);
		
		// FAIRE UNE SAISIE
		Scanner masaisie = new Scanner(System.in);
		System.out.println("Merci de saisir votre prenom");
		unechaine = masaisie.nextLine();
		System.out.print("Bonjour "+ unechaine);
	}
    
}
