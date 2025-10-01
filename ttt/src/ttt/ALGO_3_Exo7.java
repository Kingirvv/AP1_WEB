package ttt;
import java.util.Scanner;
public class ALGO_3_Exo7 {

	static float VMAX(float[] T,float nb)
	{
		int i ;
		float max;
		max = 0;
		for (i=0; i<nb; i++)
		{
			if (T[i]>max);
			{
				max = T[i];
			}
		}
		return max;
	}
	
	static float VMOY(float[] T,float nb)
	{
		int i;
		float total,moyenne;
		total=0;
		for (i=0; i<nb;i++)
				{
					total=total+T[i];
				}
			moyenne = total/nb;
		return moyenne;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i,nbe;
		float max,total,moyenne;
		float[] Tnote = new float[100];
		System.out.println("Veuillez saisir le nombre d'élève");
		nbe = scanner.nextInt();		
		
		for (i=0;i<nbe;i++)
		{
		System.out.println("Veuillez saisir la note de l'élève n°"+i+":");
		Tnote[i] = scanner.nextFloat();
		}
		
		max= VMAX(Tnote,nbe);
		moyenne= VMOY(Tnote,nbe);
		
		System.out.println("*************************");
		System.out.println("moyenne classe : "+moyenne+" - note max : "+max);
		
		
		
		

	}

}
