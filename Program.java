import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Artiste mozart = new Artiste("Mozart", "Wolfgang Amadeus", "mozart@gmail.com");
        Artiste bach = new Artiste("Bach", "Jean-Sébastien", "bach@gmail.com");

        Utilisateur utilisateur1 = new Utilisateur("Dupont", "Jean", "dupont@gmail.com", "jdupont");
        Utilisateur utilisateur2 = new Utilisateur("Durand", "Pierre", "durand@gmail.com", "pdurand");

        Abonnement premium = new Abonnement("Premium", 0.03);
        Abonnement standard = new Abonnement("Standard", 0.02);

        ArrayList<Artiste> artistes1 = new ArrayList<Artiste>();
        artistes1.add(mozart);
        artistes1.add(bach);
        Musique musique1 = new Musique("Symphonie n°40", "Cover", 300, bach, 120, "En cours de validation", "Classique");
        Musique musique2 = new Musique("Symphonie n°41", "Cover", 400, bach, 120, "publiée", "Classique");
        Musique musique3 = new Musique("Symphonie n°42", "Cover", 200, mozart, 120, "En cours de validation", "Classique");
        Musique musique4 = new Musique("Symphonie n°43", "Cover", 500, mozart, 120, "En cours de validation", "Classique");

        System.out.println("Titre de la musique : " + musique1.getTitre());
        System.out.println("Type de musique : " + musique1.getTypeMusique());




        ArrayList<Musique> musiques1 = new ArrayList<Musique>();
        musiques1.add(musique2);
        musiques1.add(musique4);

        ArrayList<Musique> musiques2 = new ArrayList<Musique>();
        musiques2.add(musique1);
        musiques2.add(musique3);

        //Album compilClassique = new Album("Compilation Classique", "visuel", artistes1, musiques1);

        utilisateur1.setListeEcoute(musiques1);
        utilisateur2.setListeEcoute(musiques2);

        utilisateur1.setAbonnement(premium);
        utilisateur2.setAbonnement(standard);

        
        Facture facture1 = new Facture(utilisateur1);
        Facture facture2 = new Facture(utilisateur2);
        facture1.setTotalAPayer();
        facture2.setTotalAPayer();

        System.out.println("Total à payer pour l'utilisateur 1 : " + facture1.getTotalAPayer());
        System.out.println("Total à payer pour l'utilisateur 2 : " + facture2.getTotalAPayer());

        System.out.println("somme perçue par l'artiste : " + mozart.getArgentPercue());
        



}}
