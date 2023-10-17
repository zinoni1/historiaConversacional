public class Personatges {
    private Zona zonaActual;
    private String nom;
    private String descripcio;
    public Objecte[] Inventari;

    public Personatges(String nom, String descripcio) {

    }

    // crear metode parlar
    public void parlar() {
        System.out.println("Hola el meu nom es" + nom + ", i" + descripcio);
    }

    // crear metode get_pos

    public void get_posicio() {
    }

    // crear metode set_pos
    public void set_posicio() {

    }

    // retorna la zona actual
    public Zona getZonaActual() {
        return zonaActual;
    }

    public String getDescripcio() {
        return this.descripcio;
    }
}
