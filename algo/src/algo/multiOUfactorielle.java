package algo;

import java.util.Scanner;



public class multiOUfactorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner saisi1 = new Scanner(System.in);
		int choix;

		do {
			System.out.println ("Que souhaitez vous faire 1 : factorielle; 2 : multiplication");
			int reponse = saisi1.nextInt();
			if (reponse == 2) {
				Scanner saisi = new Scanner(System.in);
				System.out.println("veuillez saisir un nombre pour la multiplication :");
				int valeur1, valeur2;
				valeur1 = saisi.nextInt();
				System.out.println("Jusqu'ou souhaitez vous aller ?");
				valeur2 = saisi.nextInt();
				System.out.println("Tables des : "+valeur1);
				multi(valeur1,valeur2);

			}
			else {
				Scanner saisi = new Scanner(System.in);
				System.out.println("veuillez saisir un nombre :");
				int valeur;
				valeur = saisi.nextInt();


				System.out.println("La factorielle de "+ valeur +" : " + fact(valeur));

			}
			System.out.println ("souhaitez vous relancer le programme ? 1 : oui/ 2 : non");
			Scanner saisi3 = new Scanner(System.in);
			choix = saisi3.nextInt();


		}while(choix==1);
	}


	static int fact (int var) {
		int i,resultat=1;

		for (i = var; i>=2; i=i-1) {
			resultat = resultat*i;

		}
		return resultat;

	}
	static void multi(int n, int nb) {
		int i, resultat=1;
		for (i=1; i<=nb;i++) {
			resultat = n*i;
			System.out.println(i+"*"+n +"="+resultat);
		}
	}

}
