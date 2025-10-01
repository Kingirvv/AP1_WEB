
public class Proprietaire {
	private String nom;
    private String adresse;
    private String telephone;
    
public Proprietaire (String nom, String adresse, String telephone) {
	this.adresse = adresse;
	this.nom = nom;
	this.telephone = telephone;
}
public String getadresse() { return adresse;}
public void Setadresse(String adresse) {this.adresse = adresse;}
public String getnom() {return nom;}
public void Setnom(String nom) {this.nom = nom;}
public String gettelephone() {return telephone;}
public void Settelephone(String telephone) {this.telephone = telephone;}
Proprietaire p1 = new Proprietaire("Jacque MARTIN", "Paris", "0102030405");

}
