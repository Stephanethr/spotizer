public class Program {
    public static void main(String[] args) {
        Artiste mozart = new Artiste("Mozart", "Wolfgang Amadeus", "mozart@gmail.com");
        Artiste bach = new Artiste("Bach", "Jean-Sébastien", "bach@gmail.com");

        Utilisateur utilisateur1 = new Utilisateur("Dupont", "Jean", "dupont@gmail.com", "jdupont");
        Utilisateur utilisateur2 = new Utilisateur("Durand", "Pierre", "durand@gmail.com", "pdurand");

        Abonnement premium = new Abonnement("Premium", 0.03);
        Abonnement standard = new Abonnement("Standard", 0.02);

        Album album1 = new Album("Mozart", mozart);
        Musique musique1 = new Musique("Symphonie n°40", 200, mozart);
        Musique musique2 = new Musique("Symphonie n°41", 300, mozart);
        Musique musique3 = new Musique("Symphonie n°42", 400, bach);
        Musique musique4 = new Musique("Symphonie n°43", 500, bach, "Classique", "En cours de validation", 120);
}}
