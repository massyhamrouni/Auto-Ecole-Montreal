public class Voiture implements Roulable {
    private String model;
    private static int compteur = 0;
    public Voiture(String model) {
        this.model = model;
        compteur++;
    }
    @Override
    public void demarrer() {
        System.out.println(model + " Vroommmm ...");
    }
    public static int getCompteur() {
        return compteur;
    }
    public String getModel() {
        return model;
    }
}
