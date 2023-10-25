// importation

import java.time.Year;
import java.util.*;


// class Utilisateur

public class Utilisateur extends Personne {

    private String pseudo;
    private List<Facture> factures;
    private Abonnement abonnement;


    public Utilisateur(String nom, String prenom, String mail, String pseudo) {
        
        super(nom, prenom, mail);
        this.pseudo = pseudo;
        
    }


    public String getPseudo() {
        return pseudo;
    }


    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }


    public List<Facture> getFactures() {
        return factures;
    }


    




    
}
