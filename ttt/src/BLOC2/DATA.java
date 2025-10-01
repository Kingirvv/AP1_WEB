package BLOC2;
import java.util.Scanner;
public class DATA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CLIENT client1,client2;
		String CIN,Nom,Prenom;
		int tel;
		
		client1 = new CLIENT();
		
		System.out.println("Donner le CIN");
		CIN = scanner.next();
		System.out.println("Donner le Nom");
		Nom = scanner.next();
		System.out.println("Donner le Prénom");
		Prenom = scanner.next();
		System.out.println("Donner le Numéro de tel");
		tel = scanner.nextInt();
	}

}
