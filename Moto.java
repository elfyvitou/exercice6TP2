
public class Moto extends Vehicule {
    protected int cylindree;

    public Moto(String immatriculation, String marque,
                int annee, int kilometrage, int cylindree) {
        super(immatriculation, marque, annee, kilometrage);
        this.cylindree = cylindree;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" La capacité du cylindrée est : " + cylindree + " cm3");
    }
    @Override
    public double calculerVignette() {
        if (cylindree <= 125) {
            return 300;
        } else {
            return 600;
        }
    }
}
