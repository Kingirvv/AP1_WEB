package ttt;
import java.util.Scanner;
public class ALGO_3_Exo1 {



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



		int nombre,b;
		System.out.println("Ecrire un nombre: ");
		nombre = scanner.nextInt();
		b= FACTO(nombre);
				
				
		System.out.println("La factoriele de "+nombre+"="+b);



	}









}
