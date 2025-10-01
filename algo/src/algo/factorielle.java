package algo;
import java.util.Scanner;
public class factorielle {

	
	
	 static int fact (int var) {
	    	int i,resultat=1;
	    
	    	for (i = var; i>=2; i=i-1) {
	    		resultat = resultat*i;
	    		
	    	}
			return resultat;
	    	
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner saisi = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre :");
        int valeur;
        valeur = saisi.nextInt();

        
        System.out.println("La factorielle de "+ valeur +" : " + fact(valeur));
        
	}
	
   

}
