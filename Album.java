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

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public int getdureeSecondeTotal() {
        return dureeSecondeTotal;
    }
    public void setdureeSecondeTotal() {
        for (Musique musique : musiques) {
            dureeSecondeTotal += musique.getdureeSeconde();
        }
    }
    public String getVisuel() {
        return visuel;
    }
    public void setVisuel(String visuel) {
        this.visuel = visuel;
    }

    public ArrayList<Musique> getMusiques() {
        return musiques;
    }

    
    public ArrayList<Artiste> getArtistes() {
        return artistes;
    }

    public void setArtistes(ArrayList<Artiste> artistes) {
        this.artistes = artistes;
    }

}
