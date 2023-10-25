// importation

import java.util.*;


//class Facture

public class Facture {


    private double totalAPayer;
    private GregorianCalendar dateFacture;
    private Utilisateur utilisateur;

    public Facture(Utilisateur utilisateur) {
        setTotalAPayer();
        this.dateFacture = new GregorianCalendar();
        this.utilisateur = utilisateur;
    }

    // methode get set
    public double getTotalAPayer() {
        return totalAPayer;
    }


    public GregorianCalendar getDateFacture() {
        return dateFacture;
    }
 
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setTotalAPayer() {
        int dureeSecondeTotal = 0;
        for (Musique musique : utilisateur.getListeEcoute()) {
            dureeSecondeTotal += musique.getdureeSeconde();
            musique.getArtiste().gagnerArgent((musique.getdureeSeconde()/300) * utilisateur.getAbonnement().getPrix());
        }
        totalAPayer += (dureeSecondeTotal/300) * utilisateur.getAbonnement().getPrix();
        utilisateur.setFactures(this);
    }

    
}