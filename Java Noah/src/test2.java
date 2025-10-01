import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SAISIR UN PRIX HT + AFFICHER PRIX TTC
		
		float undecimal;
		
		Scanner masaisie = new Scanner(System.in);
		System.out.println("Merci de saisir un prix HT");
		float prix = masaisie.nextFloat();
		float ht = (float) 1.2;
		float ttc = prix * ht;
		System.out.println("Le prix en ttc est de " + ttc);
		
		}

}
