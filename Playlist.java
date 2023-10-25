// Importation des classes nécessaires
import java.util.*;

// Classe Playlist
public class Playlist {

    private String libelle; // Le libellé de la playlist
    private double duree; // La durée totale de la playlist en secondes
    private List<Musique> musiques; // Liste des musiques dans la playlist

    // Constructeur de la classe Playlist
    public Playlist(String libelle) {
        this.libelle = libelle; // Initialise le libellé avec la valeur passée en paramètre
        calculDuree(); // Calcule et initialise la durée totale de la playlist
        this.musiques = new ArrayList<Musique>(); // Initialise la liste de musiques
    } 

    // Méthode pour récupérer le libellé de la playlist
    public String getLibelle() {
        return libelle; // Retourne le libellé
    }

    // Méthode pour définir un nouveau libellé pour la playlist
    public void setLibelle(String libelle) {
        this.libelle = libelle; // Met à jour le libellé avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer la durée totale de la playlist
    public double getDuree() {
        return duree; // Retourne la durée totale
    }

    // Méthode pour récupérer la liste des musiques dans la playlist
    public List<Musique> getMusiques() {
        return musiques; // Retourne la liste de musiques
    }

    // Méthode pour définir la liste complète de musiques pour la playlist
    public void setMusiques(List<Musique> musiques) {
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
        for (Musique musique : musiques ) {
             this.duree = 0; // Réinitialise la durée à chaque itération
             this.duree += musique.getdureeSeconde(); // Ajoute la durée de chaque musique à la durée totale
          }
    }  
}
