import java.util.ArrayList;

public class Artiste extends Personne {
    private double sommePercue; // Montant total perçu par l'artiste
    private ArrayList<Musique> musiques = new ArrayList<Musique>(); // Liste des musiques associées à l'artiste
    private ArrayList<Album> albums = new ArrayList<Album>(); // Liste des albums associés à l'artiste

    // Constructeur de la classe Artiste
    public Artiste(String nom, String prenom, String email) {
        super(nom, prenom, email); // Appelle le constructeur de la classe parente Personne
        this.sommePercue = 0; // Initialise le montant perçu à zéro
    }

    // Méthode pour récupérer le nom de l'artiste (héritée de la classe Personne)
    public String getNom() {
        return nom; // Retourne le nom
    }

    // Méthode pour définir un nouveau nom pour l'artiste (héritée de la classe Personne)
    public void setNom(String nom) {
        this.nom = nom; // Met à jour le nom avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le prénom de l'artiste (héritée de la classe Personne)
    public String getPrenom() {
        return prenom; // Retourne le prénom
    }

    // Méthode pour définir un nouveau prénom pour l'artiste (héritée de la classe Personne)
    public void setPrenom(String prenom) {
        this.prenom = prenom; // Met à jour le prénom avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le montant total perçu par l'artiste
    public double getArgentPercue() {
        return sommePercue; // Retourne le montant total perçu
    }

    // Méthode pour ajouter une somme au montant total perçu par l'artiste
    public void gagnerArgent(double somme) {
        this.sommePercue += somme; // Ajoute la somme passée en paramètre au montant total perçu
    }

    // Méthode pour récupérer la liste des musiques associées à l'artiste
    public ArrayList<Musique> getMusiques() {
        return musiques; // Retourne la liste des musiques
    }

    // Méthode pour récupérer la liste des albums associés à l'artiste
    public ArrayList<Album> getAlbums() {
        return albums; // Retourne la liste des albums
    }
}
