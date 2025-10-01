package ttt;
import java.util.Scanner;
public class ALGO_3_Exo3 {

	static void MULTI(int n,int nb)
	{
		int i;

		for ( i=1; i<=nb;i=i+1)
		{
			System.out.println(i+"*"+n+"="+i*n);

		}
	}
	static int FACTO(int n)
	{
		int nb;
		nb=1;
		for (int i=1; i<=n;i++) {
			nb=nb*i;
		}
		return nb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int partie;
		String reponse;
		partie = 0;
		reponse = "O";
		
		while (reponse.equals("O"))
		{
		
		int choix;
		System.out.println("Que souhaitez vous faire (1 : factorielle ; 2 : multipiclation)");
		choix = scanner.nextInt();

		if (choix == 1)
				{

			int nombre,b;
			System.out.println("Ecrire un nombre: ");
			nombre = scanner.nextInt();
			b= FACTO(nombre);
					
					
			System.out.println("La factoriele de "+nombre+"="+b);

				}
		
		else
		{
			int table,nombre;
			System.out.println("Saisir la table de multiplication ; ");
			table = scanner.nextInt();
			System.out.println("Jusqu'ou souhaitons nous allez ?");
			nombre = scanner.nextInt();

			MULTI(table,nombre);
			
		}
		
		System.out.println("Souhaitez vous relancer le progremme (O:N) ");
		reponse = scanner.next();
		
		}
		
	}

}










