package BLOC2;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AUTEUR auteur1,auteur2;
		LIVRE livre1,livre2;
		String titre,auteur,nom,prenom;
		Float prix;
		int année;
		
		
		livre1 = new LIVRE();
		auteur1 = new AUTEUR();
		
		System.out.println("Donner le titre");
		titre = scanner.next();
		System.out.println("Donner le prix");
		prix = scanner.nextFloat();
		
		livre1.setTitre(titre);
		livre1.setPrix(prix);
		
		
		System.out.println("Donner le nom");
		nom = scanner.next();
		System.out.println("Donner le prenom");
		prenom = scanner.next();
		System.out.println("Donner l'année de naissance ");
		année = scanner.nextInt();
		
		auteur1.setNom(nom);
		auteur1.setPrenom(prenom);
		auteur1.setAnnée(année);
		
		System.out.println("Titre : "+livre1.getTitre()+" - Auteur : "+auteur1.getPrenom()+" "+auteur1.getNom()+" ("+auteur1.getAnnée()+")"+" - Prix : "+livre1.getPrix());
	
		
		
	}

}
