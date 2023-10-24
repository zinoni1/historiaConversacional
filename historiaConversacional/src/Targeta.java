public class Targeta extends Objecte {
    public String propietari;

    public Targeta(String nom, String descripcio, String propietari) {
        super(nom, descripcio);
    }

    public void obrirPorta() {
        System.out.println("Has obert la porta");
    }

}
