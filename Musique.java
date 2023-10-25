import java.util.GregorianCalendar;

public class Musique {
    private String titre; // Titre de la musique
    private String typeMusique; // Type de musique
    private int dureeSeconde; // Durée en secondes de la musique
    private String visuel; // Chemin vers l'image de la musique
    private int tempo; // Tempo de la musique
    private String statut; // Statut de la musique (peut être utile pour des informations supplémentaires)
    private String styleMusique; // Style de la musique
    private Artiste artiste; // Artiste associé à la musique
    private Album album; // Album associé à la musique
    private GregorianCalendar dateDepot; // Date de dépôt de la musique
    private int nbEcoutes; // Nombre d'écoutes de la musique

    // Constructeur de la classe Musique
    public Musique(String titre, String typeMusique, int dureeSeconde, Artiste artiste, Album album, int tempo, String statut, String styleMusique) {
        this.titre = titre; // Initialise le titre avec la valeur passée en paramètre
        this.typeMusique = typeMusique; // Initialise le type de musique avec la valeur passée en paramètre
        this.dureeSeconde = dureeSeconde; // Initialise la durée en secondes avec la valeur passée en paramètre
        this.artiste = artiste; // Initialise l'artiste associé avec la valeur passée en paramètre
        this.album = album; // Initialise l'album associé avec la valeur passée en paramètre
        this.tempo = tempo; // Initialise le tempo avec la valeur passée en paramètre
        this.statut = statut; // Initialise le statut avec la valeur passée en paramètre
        this.styleMusique = styleMusique; // Initialise le style de musique avec la valeur passée en paramètre
        this.dateDepot = new GregorianCalendar(); // Initialise la date de dépôt avec la date courante
    }

    // Méthode pour récupérer le titre de la musique
    public String getTitre() {
        return titre; // Retourne le titre
    }

    // Méthode pour définir un nouveau titre pour la musique
    public void setTitre(String titre) {
        this.titre = titre; // Met à jour le titre avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le type de musique
    public String getTypeMusique() {
        return typeMusique; // Retourne le type de musique
    }

    // Méthode pour définir un nouveau type de musique
    public void setTypeMusique(String typeMusique) {
        this.typeMusique = typeMusique; // Met à jour le type de musique avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer la durée en secondes de la musique
    public int getdureeSeconde() {
        return dureeSeconde; // Retourne la durée en secondes
    }

    // Méthode pour définir une nouvelle durée en secondes pour la musique
    public void setdureeSeconde(int dureeSeconde) {
        this.dureeSeconde = dureeSeconde; // Met à jour la durée en secondes avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le chemin vers l'image de la musique
    public String getVisuel() {
        return visuel; // Retourne le chemin vers l'image
    }

    // Méthode pour définir un nouveau chemin vers l'image de la musique
    public void setVisuel(String visuel) {
        this.visuel = visuel; // Met à jour le chemin vers l'image avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le tempo de la musique
    public int getTempo() {
        return tempo; // Retourne le tempo
    }

    // Méthode pour définir un nouveau tempo pour la musique
    public void setTempo(int tempo) {
        this.tempo = tempo; // Met à jour le tempo avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le statut de la musique
    public String getStatut() {
        return statut; // Retourne le statut
    }

    // Méthode pour définir un nouveau statut pour la musique
    public void setStatut(String statut) {
        this.statut = statut; // Met à jour le statut avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le style de musique
    public String getStyleMusique() {
        return styleMusique; // Retourne le style de musique
    }

    // Méthode pour définir un nouveau style de musique
    public void setStyleMusique(String styleMusique) {
        this.styleMusique = styleMusique; // Met à jour le style de musique avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer l'artiste associé à la musique
    public Artiste getArtiste() {
        return artiste; // Retourne l'artiste associé
    }

    // Méthode pour définir un nouvel artiste associé à la musique
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste; // Met à jour l'artiste associé avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer l'album associé à la musique
    public Album getAlbum() {
        return album; // Retourne l'album associé
    }

    // Méthode pour définir un nouvel album associé à la musique
    public void setAlbum(Album album) {
        this.album = album; // Met à jour l'album associé avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer la date de dépôt de la musique
    public GregorianCalendar getDateDepot() {
        return dateDepot; // Retourne la date de dépôt
    }

    // Méthode pour récupérer le nombre d'écoutes de la musique
    public int getNbEcoutes() {
        return nbEcoutes; // Retourne le nombre d'écoutes
    }

    // Méthode pour définir un nouveau nombre d'écoutes pour la musique
    public void setNbEcoutes(int nbEcoutes) {
        this.nbEcoutes = nbEcoutes; // Met à jour le nombre d'écoutes avec la nouvelle valeur passée en paramètre
    }
}
