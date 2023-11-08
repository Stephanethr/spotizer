import java.util.ArrayList;

public class Album extends Collection {


    public Album(String titre, String visuel,ArrayList<Artiste> artistes, ArrayList<Musique> musiques) {
        super(titre, visuel, artistes, musiques);
        
    }

    @Override
    public void setMusiques(Musique musique) {
        this.musiques.add(musique); // Retourne la liste de musiques
        musique.setAlbum(this);
    }



}
