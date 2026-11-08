
public class Camion extends Vehicule {

    protected double chargeMaxTonnes;
    public Camion(String immatriculation, String marque,
                  int annee, int kilometrage,
                  double chargeMaxTonnes) {
        super(immatriculation, marque, annee, kilometrage);
        this.chargeMaxTonnes = chargeMaxTonnes;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Charge maximale : "
                + chargeMaxTonnes + " tonnes");
    }

    @Override
    public double calculerVignette() {

        return 1000 + (200 * chargeMaxTonnes);
    }
}
