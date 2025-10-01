package ttt;
import java.util.Scanner;
public class ALGO_3_Exo2 {

	static void MULTI(int n,int nb)
	{
		int i;

		for ( i=1; i<=nb;i=i+1)
		{
			System.out.println(i+"*"+n+"="+i*n);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);




		int table,nombre;
		System.out.println("Saisir la table de multiplication ; ");
		table = scanner.nextInt();
		System.out.println("Jusqu'ou souhaitons nous allez ?");
		nombre = scanner.nextInt();

		MULTI(table,nombre);
	}

}










