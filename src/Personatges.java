public class Personatges {
    private Zona zonaActual;
    public String nom;
    public String descripcio;
    public Objecte[] Inventari;

    public Personatges(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
    }

    // crear metode parlar
    public void parlar() {
        System.out.println("Hola sóc el" + this.nom + ", i" + this.descripcio);
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

    public String getNom() {
        return this.nom;
    }
}
