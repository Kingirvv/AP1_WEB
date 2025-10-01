package BLOC2;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				String couleur;
				VOITURE Voiture1,Voiture2;
				Voiture1 = new VOITURE("Renault","Mégane",false,90000,2000,"rouge","CBO 582 75");
				Voiture2 = new VOITURE("Peugeot","306",true,0,2016,"noire","");
				System.out.println(Voiture2.getCouleur());
				couleur=Voiture2.getCouleur();
				
	
	}

}
