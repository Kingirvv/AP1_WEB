package BLOC2;

public class VOITURE {

	private String marque;
	private String modele;
	private boolean etat;
	private int Km;
	private int annee;
	private String couleur;
	private String immatriculation;
	
	
	
	
	
	
	
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getKm() {
		return Km;
	}

	public void setKm(int km) {
		Km = km;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public VOITURE(String marque, String modele, boolean etat, int km, int annee, String couleur,
			String immatriculation) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.etat = etat;
		Km = km;
		this.annee = annee;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
	}
	
	

	
	
	
}
