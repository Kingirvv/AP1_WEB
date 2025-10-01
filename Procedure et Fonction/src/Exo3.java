
public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rep;
		int n;
		int nb;
		int total;
		 ;
	}
	public static int facto(int nb) {
		int resultat,i;
		resultat = nb;
		for (i=nb-1;i>1;i-- ) {
			resultat = resultat*i;
		}
		return resultat;
	}
	public static void table_multi(int n, int nb) {
		int i;
		System.out.println("Table des " + n);
		for (i=1; i<=nb; i++) {
			System.out.println( i + "*" + n + " = " + (i*n));
		}
	}
}