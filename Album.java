import java.util.ArrayList;

public class Album {
    private String titre;  // Titre de l'album
    private int dureeSecondeTotal; // Durée totale en secondes de toutes les musiques de l'album
    private String visuel; // Chemin vers l'image de l'album
    private ArrayList<Musique> musiques = new ArrayList<Musique>(); // Liste des musiques dans l'album

    // Constructeur de la classe Album
    public Album(String titre, String visuel, ArrayList<Musique> musiques) {
        this.titre = titre; // Initialise le titre avec la valeur passée en paramètre
        setdureeSecondeTotal(); // Calcule et initialise la durée totale en secondes
        this.visuel = visuel; // Initialise le chemin vers l'image de l'album
        this.musiques = musiques; // Initialise la liste de musiques avec celle passée en paramètre
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
}
