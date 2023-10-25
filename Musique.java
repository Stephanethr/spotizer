import java.util.GregorianCalendar;

public class Musique {
    private String titre;
    private String typeMusique;
    private int dureeSeconde;
    private String visuel;
    private int tempo;
    private String statut;
    private String styleMusique;
    private Artiste artiste;
    private Album album;
    private GregorianCalendar dateDepot;

    public Musique(String titre, String typeMusique, int dureeSeconde, Artiste artiste, Album album, int tempo, String statut, String styleMusique) {
        this.titre = titre;
        this.typeMusique = typeMusique;
        this.dureeSeconde = dureeSeconde;
        this.artiste = artiste;
        this.album = album;
        this.tempo = tempo;
        this.statut = statut;
        this.styleMusique = styleMusique;
        this.dateDepot = new GregorianCalendar();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTypeMusique() {
        return typeMusique;
    }

    public void setTypeMusique(String typeMusique) {
        this.typeMusique = typeMusique;
    }

    public int getdureeSeconde() {
        return dureeSeconde;
    }

    public void setdureeSeconde(int dureeSeconde) {
        this.dureeSeconde = dureeSeconde;
    }

    public String getVisuel() {
        return visuel;
    }

    public void setVisuel(String visuel) {
        this.visuel = visuel;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getStyleMusique() {
        return styleMusique;
    }

    public void setStyleMusique(String styleMusique) {
        this.styleMusique = styleMusique;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public GregorianCalendar getDateDepot() {
        return dateDepot;
    }

}
