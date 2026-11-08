
public class Main {

    public static void main(String[] args) {

        Voiture v = new Voiture("123", "Toyota", 2020, 50000, 4);
        Moto m = new Moto("456", "Yamaha", 2022, 20000, 650);
        Camion c = new Camion("789", "Mercedes", 2019, 100000, 12);

        v.rouler(100);
        m.rouler(200);
        c.rouler(500);

        v.afficher();
        System.out.println("Vignette : " + v.calculerVignette() + " DH");

        m.afficher();
        System.out.println("Vignette : " + m.calculerVignette() + " DH");

        c.afficher();
        System.out.println("Vignette : " + c.calculerVignette() + " DH");
    }
}
