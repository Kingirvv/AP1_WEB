
public class Voiture {
	private String marque;
	private String model;
	private String etat;
	private int km;
	private int annee;
	private String couleur;
	private String imat;
	private Proprietaire proprio;
	
public Voiture (String marque,String model,String etat,int km,int annee,String couleur,String imat, Proprietaire proprio) {
	
	this.marque = marque;
	this.model = model;
	this.etat = etat;
	this.km = km;
	this.annee = annee;
	this.couleur = couleur;
	this.imat = imat;
	this.proprio = proprio;
	
}
public void augmentation(int km) {this.km = km; System.out.println("Le kilométrage a augmenté de " + km + " km.");}
public void AFFICHER() {System.out.println("Voiture : " + " Marque :" + marque  + ", Model : " + model + ", Etat : " + etat + ", km : " + km + ", Annee : " + annee + ", Couleur : " + couleur + ", Imat : " + imat);}

	
public String getmarque() { return marque;}
public void Setmarque(String marque) {this.marque = marque;}
public String getmodel() {return model;}
public void Setmodel(String model) {this.model = model;}
public String getetat() {return etat;}
public void Setetat(String etat) {this.etat = etat;}
public int getkm() {return km;}
public void Setkm(int km) {this.km = km;}
public int getannee() { return annee;}
public void Setannee(int annee) {this.annee = annee;}	
public String getcouleur() { return couleur;}
public void Setcouleur(String couleur) {this.couleur = couleur;}
public String getimat() { return imat;}
public void Setimat(String imat) {this.imat = imat;}
public Proprietaire getproprio() {return proprio;}
public void Setproprio(Proprietaire proprio) {this.proprio = proprio;}


}

