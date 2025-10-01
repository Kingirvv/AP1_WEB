import java.util.Scanner;

public class test5 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		//SHIFUMI
		Scanner masaisie = new Scanner(System.in);
		int points = 0; 
		int Pierre = 1;
		int Feuille = 2;
		int Ciseau = 3;
		int choix = 0;
		int colonne;
		
	    while (points != 3 && points != 5 && points != 10) {
	         System.out.print("En commbien de points voulez vous que la partie se deroule ? ");
	         if (masaisie.hasNextInt()) {
	         points = masaisie.nextInt();
	         if (points != 3 && points != 5 && points != 10) {
	         System.out.println("Veuillez choisir uniquement 3, 5 ou 10.");
	         }
	         }else{
	         System.out.println("Entrée invalide. Veuillez entrer un nombre.");
	         }
	        }

	        System.out.println("La partie se jouera en " + points + " points ");
        
        while (choix < 1 || choix > 3) {
	        System.out.print("Choisissez : 1 = Pierre, 2 = Feuille, 3 = Ciseau : ");
	        if (masaisie.hasNextInt()) {
	        choix = masaisie.nextInt();
	        if (choix < 1 || choix > 3) {
	        System.out.println("Saisie invalide. Veuillez entrer 1, 2 ou 3.");
	        }
	        }else{
	        System.out.println("Entrée invalide. Veuillez entrer un nombre.");
	        masaisie.nextInt();
	        }
	       }
		 System.out.println("Vous avez choisi : " + choix);
		 int nbsec = 3;
		 Thread.sleep(nbsec*1000);
		 colonne= (int)(Math.random()*3)+1;
		 System.out.println("l'ordinateur a choisi "+colonne);
			
	} 
}
