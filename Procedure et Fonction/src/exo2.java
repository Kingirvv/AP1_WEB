import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table_multi(8,12);
		
	}
	
	public static void table_multi(int n, int nb) {
		int i;
		System.out.println("Table des " + n);
		for (i=1; i<=nb; i++) {
			System.out.println( i + "*" + n + " = " + (i*n));
		}
	}
 }
