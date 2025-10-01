package BLOC2;
import java.util.Scanner;
public class COMPTE {
	
	Scanner scanner = new Scanner(System.in);
	private int Solde,Code;
	private CLIENT client;
	
	
	
	public int getSolde() {
		return Solde;
	}
	public int getCode() {
		return Code;
	}
	public CLIENT getClient() {
		return client;
	}
	public void setClient(CLIENT client) {
		this.client = client;
	}
	
	public COMPTE(int solde, int code, CLIENT client) {
		super();
		Solde = solde;
		Code = code;
		this.client = client;
	}
	
	
	public void CREDITER() {
		
		int credit;
		System.out.println("*************************************************");
		System.out.println("Donner le montant à déposer :" );
		credit = scanner.nextInt();
	}
	
	public void CREDITER() {
		
		
		int credit,nc;
		
		System.out.println("Donner un numéro de compte");
		nc = scanner.nextInt();
		
		
		System.out.println("***********************************************");
		System.out.println("Donner le montant à déposer :" );
		credit = scanner.nextInt();
		Solde=Solde+credit;
		System.out.println("Opération bien effectué");
	}
	
	
}
