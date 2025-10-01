package ttt;
import java.util.Scanner;
public class ALGO_3_Exo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float max,total,moyenne;
		int nbe;
		float[] Tnote = new float[100];
		
		System.out.println("Veuillez saisir le nombre d'élève");
		nbe = scanner.nextInt();
		max = 0;
		total = 0;
		
		for (int i=0; i<nbe;i++)
		{
			System.out.println("Veuillez saisir la note de l'élève n°"+(i+1)+":");
			Tnote[i] = scanner.nextFloat();
			total=total+Tnote[i];
			if (Tnote[i]>max);
			{
				max = Tnote[i];
			}
			
			
		}
	
		moyenne = total/nbe;
		System.out.println("***************************");
		System.out.println("moyenne classe :"+moyenne+" - note max : "+max);
		
		
		
		

	}

}
