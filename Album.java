import java.util.ArrayList;

public class Album {
    private String titre;
    private int dureeSecondeTotal;
    private String visuel;
    private ArrayList<Musique> musiques = new ArrayList<Musique>();
    private ArrayList<Artiste> artistes = new ArrayList<Artiste>();

    public Album(String titre, String visuel,ArrayList<Artiste> artistes, ArrayList<Musique> musiques) {
        this.titre = titre;
        setdureeSecondeTotal();
        this.visuel = visuel;
        this.musiques = musiques;
        this.artistes = artistes;
    }

    // Méthode pour récupérer le titre de l'album
    public String getTitre() {
        return titre; // Retourne le titre
    }

    // Méthode pour définir un nouveau titre pour l'album
    public void setTitre(String titre) {
        this.titre = titre; // Met à jour le titre avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer la durée totale en secondes de l'album
    public int getdureeSecondeTotal() {
        return dureeSecondeTotal; // Retourne la durée totale en secondes
    }

    // Méthode pour calculer et mettre à jour la durée totale en secondes de l'album
    public void setdureeSecondeTotal() {
        for (Musique musique : musiques) {
            dureeSecondeTotal += musique.getdureeSeconde(); // Ajoute la durée de chaque musique à la durée totale
        }
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

    
    public ArrayList<Artiste> getArtistes() {
        return artistes;
    }

    public void setArtistes(ArrayList<Artiste> artistes) {
        this.artistes = artistes;
    }

}
