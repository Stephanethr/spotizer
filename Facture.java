// Importation des classes nécessaires
import java.util.*;

// Classe Facture
public class Facture {

    private double totalAPayer; // Montant total à payer pour la facture
    private GregorianCalendar dateFacture; // Date de la facture
    private Utilisateur utilisateur; // Utilisateur associé à la facture

    // Constructeur de la classe Facture
    public Facture(Utilisateur utilisateur) {
        setTotalAPayer(); // Calcule et initialise le montant total à payer
        this.dateFacture = new GregorianCalendar(); // Initialise la date de la facture à la date courante
        this.utilisateur = utilisateur; // Initialise l'utilisateur associé à la facture
    }

    // Méthode pour récupérer le montant total à payer
    public double getTotalAPayer() {
        return totalAPayer; // Retourne le montant total à payer
    }

    // Méthode pour récupérer la date de la facture
    public GregorianCalendar getDateFacture() {
        return dateFacture; // Retourne la date de la facture
    }

    // Méthode pour récupérer l'utilisateur associé à la facture
    public Utilisateur getUtilisateur() {
        return utilisateur; // Retourne l'utilisateur associé à la facture
    }

    // Méthode pour calculer et mettre à jour le montant total à payer
    public void setTotalAPayer() {
        int dureeSecondeTotal = 0;

        // Parcours de la liste d'écoute de l'utilisateur
        for (Musique musique : utilisateur.getListeEcoute()) {
            dureeSecondeTotal += musique.getdureeSeconde(); // Calcul de la durée totale en secondes
            musique.getArtiste().gagnerArgent(((((musique.getdureeSeconde()/300) * utilisateur.getAbonnement().getPrix()))*66)/100); // Calcul de la rémunération de l'artiste
        }

        // Calcul du montant total à payer en fonction de la durée totale en secondes et du prix de l'abonnement
        totalAPayer += (dureeSecondeTotal/300) * utilisateur.getAbonnement().getPrix();

        // Mise à jour de la liste des factures de l'utilisateur
        utilisateur.setFactures(this);
    }
}
