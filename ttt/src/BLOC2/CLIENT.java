package BLOC2;

public class CLIENT {

	private String CIN;
	private String Nom;
	private String Prenom;
	private int tel;
	
	
	
	public CLIENT() {
		super();
	}
	
	public CLIENT(String cIN, String nom, String prenom) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
	}

	public CLIENT(String cIN, String nom, String prenom, int tel) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
		this.tel = tel;
	}
	
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	public void AFFICHER() {
		System.out.println("CIN : "+CIN+"  - Nom : "+Nom+"  - Prénom : "+Prenom+"  - Téléphone : "+tel );
	}
	
	
}
