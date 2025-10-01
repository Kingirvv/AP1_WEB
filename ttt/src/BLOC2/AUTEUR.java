package BLOC2;

public class AUTEUR {
	
	private String nom;
	private String prenom;
	private int année;
	
	
	
	public AUTEUR(String nom, String prenom, int année) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.année = année;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAnnée() {
		return année;
	}
	public void setAnnée(int année) {
		this.année = année;
	}
	public AUTEUR() {
		super();
	}
	
	public void AFFICHER_AUTEUR() {
		System.out.println("Nom : "+nom+" - Prenom : "+prenom+" - Année : "+année);
	}

}
