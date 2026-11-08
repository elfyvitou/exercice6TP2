
public class Voiture extends Vehicule {

    protected int nombrePortes;

    public Voiture(String immatriculation, String marque,
                   int annee, int kilometrage, int nombrePortes) {

        super(immatriculation, marque, annee, kilometrage);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le nombre de portes est : " + nombrePortes);
    }

    @Override
    public double calculerVignette() {
        return 800;
    }
}
