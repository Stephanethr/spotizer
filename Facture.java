// importation

import java.time.Year;
import java.util.*;


//class Facture

public class Facture {


    private double totalAPayer;
    private GregorianCalendar dateFacture;
    private Utilisateur utilisateur;

    public Facture(double totalAPayer,  Utilisateur utilisateur) {
        this.totalAPayer = totalAPayer;
        this.dateFacture = new GregorianCalendar();
        this.utilisateur = utilisateur;
    }

    // methode get set
    public double getTotalAPayer() {
        return totalAPayer;
    }

    public void setTotalAPayer(double totalAPayer) {
        this.totalAPayer = totalAPayer;
    }

    public GregorianCalendar getDateFacture() {
        return dateFacture;
    }
 
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    
}