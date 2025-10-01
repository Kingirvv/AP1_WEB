import java.util.Scanner;

public class Exo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(facto(8));
		
		
	}
	public static int facto(int nb) {
		int resultat,i;
		resultat = nb;
		for (i=nb-1;i>1;i-- ) {
			resultat = resultat*i;
		}
		return resultat;
	}
	
	
 }
