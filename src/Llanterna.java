public class Llanterna extends Objecte {
    private int bateria;
    private boolean encesa;

    public Llanterna(String nom, String descripcio, int bateria, boolean encesa) {
        super(nom, descripcio);
        this.bateria = bateria;
        this.encesa = encesa;
    }

    public void encendre() {
        if ((bateria > 0) && (encesa == false)) {
            encesa = true;
            System.out.println("Has encès la llanterna");
        } else if ((bateria > 0) && (encesa == true)) {
            System.out.println("La llanterna ja està encesa");
        } else if ((bateria == 0) && (encesa == false)) {
            System.out.println("No pots encendre la llanterna perquè no té bateria");
        }
    }

}
