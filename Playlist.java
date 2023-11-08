// Importation des classes nécessaires
import java.util.*;

// Classe Playlist
public class Playlist extends Collection{
    protected int duree; // Durée totale de la playlist

    // Constructeur de la classe Playlist
    public Playlist(String titre, String visuel, ArrayList<Artiste> artistes, ArrayList<Musique> musiques) {
        super(titre, visuel, artistes, musiques);
        calculDuree(); // Calcule la durée totale de la playlist
    } 

    // Méthode pour définir la liste complète de musiques pour la playlist
    public void setMusiques(ArrayList<Musique> musiques) {
        this.musiques = musiques; // Met à jour la liste de musiques
        calculDuree(); // Recalcule la durée totale
    }

    // Méthode pour ajouter une musique à la playlist
    public void setMusiques(Musique musique) {
        this.musiques.add(musique); // Ajoute la musique à la liste
        calculDuree(); // Recalcule la durée totale
    }

    // Méthode pour calculer la durée totale de la playlist
    public void calculDuree(){
        this.duree = 0; // Initialise la durée à 0
        for (Musique musique : musiques ) {
             this.duree += musique.getdureeSeconde(); // Ajoute la durée de chaque musique à la durée totale
          }
    }  
}
