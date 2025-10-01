package BLOC2;

public class LIVRE {

	private String Titre;
	private AUTEUR Auteur;
	private Float Prix;
	
	
	public LIVRE() {
		super();
	}


	public LIVRE(String titre, AUTEUR auteur, Float prix) {
		super();
		Titre = titre;
		Auteur = auteur;
		Prix = prix;
	}


	public String getTitre() {
		return Titre;
	}


	public void setTitre(String titre) {
		Titre = titre;
	}


	public AUTEUR getAuteur() {
		return Auteur;
	}


	public void setAuteur(AUTEUR auteur) {
		Auteur = auteur;
	}


	public Float getPrix() {
		return Prix;
	}


	public void setPrix(Float prix) {
		Prix = prix;
	}


	public void AFFICHER_LIVRE() {
		System.out.println("Titre : "+Titre+"  - Prix : "+Prix );
		Auteur.AFFICHER_AUTEUR();
	}
	


}
