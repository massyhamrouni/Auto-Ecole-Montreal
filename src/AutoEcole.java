import java.util.ArrayList;

public class AutoEcole {
    private String nom;
    public ArrayList<Personne> Personnes = new ArrayList<>();
    public ArrayList<Voiture>  Voitures = new ArrayList<>();
    public AutoEcole(String nom) {
        this.nom = nom;
    }

    public void ajouterPersonne(Personne p) {
        Personnes.add(p);
    }
    public void ajouterVoiture(Voiture v) {
        Voitures.add(v);
    }

    public void afficherTout(){
        System.out.println("AutoEcole : " + nom);
        System.out.println("------Personnes-------" );
        for (Personne p : Personnes) p.afficherInfo();
        System.out.println("------Voitures-------" );
        for (Voiture v : Voitures) v.demarrer();
    }
}
