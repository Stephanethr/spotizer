public class Personne {
    protected String nom; // Le nom de la personne
    protected String prenom; // Le prénom de la personne
    protected String email; // L'adresse email de la personne

    // Constructeur de la classe Personne
    public Personne(String nom, String prenom, String email) {
        this.nom = nom; // Initialise le nom avec la valeur passée en paramètre
        this.prenom = prenom; // Initialise le prénom avec la valeur passée en paramètre
        this.email = email; // Initialise l'adresse email avec la valeur passée en paramètre
    }

    // Méthode pour récupérer le nom de la personne
    public String getNom() {
        return nom; // Retourne le nom
    }

    // Méthode pour définir un nouveau nom pour la personne
    public void setNom(String nom) {
        this.nom = nom; // Met à jour le nom avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer le prénom de la personne
    public String getPrenom() {
        return prenom; // Retourne le prénom
    }

    // Méthode pour définir un nouveau prénom pour la personne
    public void setPrenom(String prenom) {
        this.prenom = prenom; // Met à jour le prénom avec la nouvelle valeur passée en paramètre
    }

    // Méthode pour récupérer l'adresse email de la personne
    public String getEmail() {
        return email; // Retourne l'adresse email
    }

    // Méthode pour définir une nouvelle adresse email pour la personne
    public void setEmail(String email) {
        this.email = email; // Met à jour l'adresse email avec la nouvelle valeur passée en paramètre
    }
}
