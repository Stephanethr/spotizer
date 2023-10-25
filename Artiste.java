import java.util.ArrayList;

public class Artiste extends Personne{
    private double sommePercue;
    private ArrayList<Musique> musiques = new ArrayList<Musique>();
    private ArrayList<Album> albums = new ArrayList<Album>();


    public Artiste(String nom, String prenom, String email) {
        super(nom, prenom, email);
        this.sommePercue = 0;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public double getArgentPercue() {
        return sommePercue;
    }
      
    public void gagnerArgent(double somme) {
        this.sommePercue += somme;
    }

    public ArrayList<Musique> getMusiques() {
        return musiques;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
    
}
