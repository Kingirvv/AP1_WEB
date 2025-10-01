import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Voiture v1;
v1 = new Voiture ("Renault","Megane","occasion",90000,2010,"rouge","CBO 582 75", null);
Voiture v2 = new Voiture("Peugeot","300","neuve",0,2010,"noir",null,null);
System.out.println(v1);
 v2.Setimat("AA 111 00");
 System.out.println(v1.getkm());
 Scanner sc = new Scanner (System.in);
 System.out.println("Saisir la nouvelle couleur pour la Voiture 1");
 String couleur;
 couleur = sc.nextLine();
 System.out.println("couleur v1 = "+v1.getcouleur());
 v1.Setcouleur(couleur);
 System.out.println("nouvelle couleur v1 = "+v1.getcouleur());
 v1.AFFICHER();
 v2.AFFICHER();
 v1.augmentation(250);
 v1.AFFICHER();
 Proprietaire p1 = new Proprietaire("Jacque MARTIN", "Paris", "0102030405");
 v1.Setproprio(p1);
	}
	 
}
