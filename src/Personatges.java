public class Personatges {
    private Zona zonaActual;
    private String nom;
    private String descripcio;

    public Personatges(String nom, String descripcio) {

    }

    // crear metode parlar
    public void parlar() {
        System.out.println("Hola el meu nom es" + nom + ", i" + descripcio);
    }

    // crear metode get_pos

    public void get_posicio() {
        System.out.println(zonaActual.getNom());
    }

    // crear metode set_pos
    public void set_posicio() {
        zonaActual.comandament();
    }

}
