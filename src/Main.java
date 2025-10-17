public class Main {
    public static void main(String[] args) {
        AutoEcole ecole = new AutoEcole("Permis+ Montreal");
        ecole.ajouterPersonne(new Eleve("Nicolas", 28, "avancé"));
        ecole.ajouterPersonne(new Moniteur("Julie", 27, 3));
        ecole.ajouterVoiture(new Voiture("Toyota Rav4"));
        ecole.afficherTout();
    }
}
