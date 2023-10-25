import java.util.ArrayList;

public class Album {
    private String titre;
    private int dureeTotal;
    private String visuel;
    private ArrayList<Musique> musiques = new ArrayList<Musique>();

    public Album(String titre, int dureeTotal, String visuel, ArrayList<Musique> musiques) {
        this.titre = titre;
        this.dureeTotal = dureeTotal;
        this.visuel = visuel;
        this.musiques = musiques;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public int getDureeTotal() {
        return dureeTotal;
    }
    public void setDureeTotal(int dureeTotal) {
        this.dureeTotal = dureeTotal;
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

}
