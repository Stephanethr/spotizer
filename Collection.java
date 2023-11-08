import java.util.ArrayList;

public abstract class Collection {
    protected String titre;
    protected String visuel;
    protected ArrayList<Musique> musiques;
    protected ArrayList<Artiste> artistes;

    public Collection(String titre, String visuel,ArrayList<Artiste> artistes, ArrayList<Musique> musiques) {
        this.titre = titre;
        this.visuel = visuel;
        this.artistes = artistes;
        this.musiques = musiques;
    }

    
    // Méthode pour récupérer le titre de l'album
    public String getTitre() {
        return titre; // Retourne le titre
    }

    // Méthode pour définir un nouveau titre pour l'album
    public void setTitre(String titre) {
        this.titre = titre; // Met à jour le titre avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le chemin vers l'image de l'album
    public String getVisuel() {
        return visuel; // Retourne le chemin vers l'image
    }

    // Méthode pour définir un nouveau chemin vers l'image de l'album
    public void setVisuel(String visuel) {
        this.visuel = visuel; // Met à jour le chemin avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer la liste des musiques de l'album
    public ArrayList<Musique> getMusiques() {
        return musiques; // Retourne la liste de musiques
    }

    public abstract void setMusiques(Musique musique);

    
    public ArrayList<Artiste> getArtistes() {
        return artistes;
    }

    public void setArtistes(ArrayList<Artiste> artistes) {
        this.artistes = artistes;
    }


}
