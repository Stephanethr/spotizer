// Importation des classes nécessaires
import java.util.*;

// Classe Utilisateur qui hérite de la classe Personne
public class Utilisateur extends Personne {

    private String pseudo; // Pseudo de l'utilisateur
    private ArrayList<Facture> factures; // Liste des factures de l'utilisateur
    private Abonnement abonnement; // Abonnement de l'utilisateur
    private ArrayList<Musique> listeEcoute; // Liste des musiques écoutées par l'utilisateur

    // Constructeur de la classe Utilisateur
    public Utilisateur(String nom, String prenom, String mail, String pseudo) {   
        super(nom, prenom, mail); // Appelle le constructeur de la classe parente Personne
        this.pseudo = pseudo; // Initialise le pseudo avec la valeur passée en paramètre
        this.factures = new ArrayList<Facture>(); // Initialise la liste des factures
        this.listeEcoute = new ArrayList<Musique>(); // Initialise la liste des musiques écoutées
    }

    // Méthode pour récupérer le pseudo de l'utilisateur
    public String getPseudo() {
        return pseudo; // Retourne le pseudo
    }

    // Méthode pour définir un nouveau pseudo pour l'utilisateur
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo; // Met à jour le pseudo avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer la liste des factures de l'utilisateur
    public List<Facture> getFactures() {
        return factures; // Retourne la liste des factures
    }
    
    // Méthode pour récupérer l'abonnement de l'utilisateur
    public Abonnement getAbonnement() {
        return abonnement; // Retourne l'abonnement
    }

    // Méthode pour définir un nouvel abonnement pour l'utilisateur
    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement; // Met à jour l'abonnement avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour permettre à l'utilisateur d'écouter une musique
    public void ecouter(Musique musique) {
        this.listeEcoute.add(musique); // Ajoute la musique à la liste des musiques écoutées
    }

    // Méthode pour récupérer la liste des musiques écoutées par l'utilisateur
    public ArrayList<Musique> getListeEcoute() {
        return listeEcoute; // Retourne la liste des musiques écoutées
    }

    // Méthode pour définir la liste des musiques écoutées par l'utilisateur
    public void setListeEcoute(ArrayList<Musique> listeEcoute) {
        this.listeEcoute = listeEcoute; // Met à jour la liste des musiques écoutées
    }

    // Méthode pour ajouter une facture à la liste des factures de l'utilisateur
    public void setFactures(Facture factures) {
        this.factures.add(factures); // Ajoute la facture à la liste des factures
    }
}
