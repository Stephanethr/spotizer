// class Abonnement

public class Abonnement {
    
    private String libelle;
    private double prix;


    
    public Abonnement(String libelle, double prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    
    public String getLibelle() {
        return libelle;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
