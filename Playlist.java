//importation
import java.util.*;

// class Playlist
public class Playlist {

    private String libelle;
    private double duree;
    private List<Musique> musiques;

     

    public Playlist(String libelle) {
        

        this.libelle = libelle;
        calculDuree();
        
    } 

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getDuree() {
        return duree;
    }

   

    public List<Musique> getMusiques() {
        return musiques;
    }

    // set Liste de musique

    public void setMusiques(List<Musique> musiques) {
        this.musiques = musiques;
        calculDuree();
    }

    // set rajoute une musique dans la liste

    public void setMusiques(Musique musiques) {
        this.musiques.add(musiques);
        calculDuree();;
    }

    public void calculDuree(){
        

        for (Musique musique : musiques ) {
             this.duree = 0;
             this.duree =+ musique.getdureeSeconde();
          }
    }
   
    
}
