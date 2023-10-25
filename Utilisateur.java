// importation

import java.util.*;


// class Utilisateur

public class Utilisateur extends Personne {

    private String pseudo;
    private ArrayList<Facture> factures;
    private Abonnement abonnement;
    private ArrayList<Musique> listeEcoute;

    public Utilisateur(String nom, String prenom, String mail, String pseudo) {   
        super(nom, prenom, mail);
        this.pseudo = pseudo;
        this.factures = new ArrayList<Facture>();
        this.listeEcoute = new ArrayList<Musique>();
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
    
    public Abonnement getAbonnement() {
        return abonnement;
    }


    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public void ecouter(Musique musique) {
        this.listeEcoute.add(musique);
    }

    
    public ArrayList<Musique> getListeEcoute() {
        return listeEcoute;
    }


    public void setListeEcoute(ArrayList<Musique> listeEcoute) {
        this.listeEcoute = listeEcoute;
    }

    public void setFactures(Facture factures) {
        this.factures.add(factures);
    }





    
}
