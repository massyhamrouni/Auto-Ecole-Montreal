public class Eleve extends Personne {
    private String niveau;

    public Eleve(String nom, int age, String niveau) {
        super(nom, age);
        this.niveau = niveau;
    }

    public String getNiveau(){
        return niveau;
    };
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    @Override
    public String getRole() {
        return "Eleve";
    }
    @Override
    public void afficherInfo() {
        System.out.println(getRole() + " : " + getNom() + " (" + getAge() + " ans, niveau " + niveau + ")");
    }
}
