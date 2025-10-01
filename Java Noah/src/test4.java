import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rejouer;
		Scanner masaisie1 = new Scanner(System.in);
		do {
		//
		int nb ;
		int min=1;
		int max = 100;
		nb = (int)(Math.random()*(max-min))+min;
		Scanner masaisie = new Scanner(System.in);
		int reponse = 0;
		
		do {
			System.out.println("Saisir un nombre");
			reponse=masaisie.nextInt();
			if (nb<reponse)
			System.out.println("Saisir un nombre plus petit");
			else if (nb>reponse)
			{
			System.out.println("Saisir un nombre plus grand");
			}
			
		}while (nb!=reponse);
		System.out.println("Felicitation");
		System.out.println("Voulez vous recommencer ? oui=1, non=2");
		rejouer=masaisie1.nextInt();
		}while(rejouer==1);
			
		
	}
}


       