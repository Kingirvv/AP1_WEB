import java.util.Scanner;
public class shifumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbpoint;
		int choixu,choixPC,pointu,pointPC;
		int rep;
		Scanner masaisie = new Scanner(System.in);


		do {
			pointu=0;
			pointPC=0;

			//ETAPE 1
			System.out.println("en combien de point ? (3-5-10)");
			nbpoint=masaisie.nextInt();

			do {
				//ETAPE2
				System.out.println("Choisir PIERRE=1, FEUILLE=2, CISEAU=3");
				choixu=masaisie.nextInt();
				while(choixu!=1 && choixu!=2 && choixu!=3)
				{
					System.out.println("ERREUR DE SAISIE");
					System.out.println("Choisir PIERRE=1, FEUILLE=2, CISEAU=3");
					choixu=masaisie.nextInt();
				}

				//ETAPE3
				choixPC=(int)(Math.random()*3)+1;

				//ETAPE4

				//Thread.sleep(3000);
				switch (choixPC) {
				case 1 : System.out.println("Choix de l'ordinateur : PIERRE"); break;
				case 2 : System.out.println("Choix de l'ordinateur : FEUILLE"); break;
				case 3 : System.out.println("Choix de l'ordinateur : CISEAU"); break;
				}


				//ETAPE5
				if(choixPC==choixu) {
					System.out.println("Egalité");
				}
				else
				{
					if((choixu==1 && choixPC==3) || (choixu==2 && choixPC==1)  || (choixu==3 && choixPC==2))
					{
						System.out.println("Victoire du joueur");
						pointu++;
					}
					else
					{
						System.out.println("Victoire du PC");
						pointPC++;
					}
				}
				System.out.println("Point Joueur :"+pointu);
				System.out.println("Point PC :"+pointPC);

			}while(pointPC!=nbpoint & pointu !=nbpoint);

			//ETAPE6
			if(pointPC==nbpoint) {
				System.out.println("Vous avez perdu victoire du PC ");
			}
			else
			{
				System.out.println("BRAVO le joueur a gagné");
			}

			//ETAPE7
			System.out.println("Voulez vous recommencer : (0:non ; 1:oui)");
			rep=masaisie.nextInt();
		}while (rep==1);
		System.out.println("A BIENTOT !");

	}

}
