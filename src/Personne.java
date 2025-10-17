public abstract class Personne {
    private  String nom;
    private Integer age;

    Personne(String nom, Integer age) {
        this.nom = nom;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public abstract String getRole();
    public void afficherInfo() {
        System.out.println("nom : " + nom + " (" + age + ")" + " ans" );
    }

}
