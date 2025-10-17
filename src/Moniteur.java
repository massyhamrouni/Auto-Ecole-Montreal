public class Moniteur extends Personne {
    private Integer experience;

    public Moniteur(String nom, Integer age, Integer experience) {
        super(nom, age);
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    @Override
    public String getRole() {
        return "Moniteur";
    }

    @Override
    public void afficherInfo() {
        System.out.println("nom : " + getNom() + " (" + getAge() + ")" + " ans " + experience + " d'éxpériences" );
    }
}
