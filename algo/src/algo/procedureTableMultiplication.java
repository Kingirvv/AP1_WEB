package algo;

import java.util.Scanner;

public class procedureTableMultiplication {

	
	static void multi(int n, int nb) {
		int i, resultat=1;
		for (i=1; i<=nb;i++) {
			resultat = n*i;
			System.out.println(i+"*"+n +"="+resultat);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner saisi = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre pour la multiplication:");
        int valeur1, valeur2;
        valeur1 = saisi.nextInt();
        System.out.println("veuillez saisir un nombre d'arret:");
        valeur2 = saisi.nextInt();
		System.out.println("Tables des : "+valeur1);
		multi(valeur1,valeur2);
	}

}
