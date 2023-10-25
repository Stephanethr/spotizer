// Classe Abonnement
public class Abonnement {
    
    // Attributs privés de la classe Abonnement
    private String libelle; // Variable pour stocker le libellé de l'abonnement
    private double prix;   // Variable pour stocker le prix de l'abonnement

    // Constructeur de la classe Abonnement
    public Abonnement(String libelle, double prix) {
        this.libelle = libelle; // Initialise le libellé avec la valeur passée en paramètre
        this.prix = prix;       // Initialise le prix avec la valeur passée en paramètre
    }

    // Méthode pour récupérer le libellé de l'abonnement
    public String getLibelle() {
        return libelle; // Retourne le libellé
    }

    // Méthode pour récupérer le prix de l'abonnement
    public double getPrix() {
        return prix; // Retourne le prix
    }

    // Méthode pour définir un nouveau prix pour l'abonnement
    public void setPrix(double prix) {
        this.prix = prix; // Met à jour le prix avec la nouvelle valeur passée en paramètre
    }
}
