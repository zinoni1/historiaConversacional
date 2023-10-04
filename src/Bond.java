public class Bond extends Personatges {
    public Bond(String nom, String descripcio) {
        super(nom, descripcio);
    }

    public static Zona zonaActual;

    public static Zona getZonaActual() {
        return zonaActual;
    }

    public static void setZonaActual(Zona zona) {
        zonaActual = zona;
    }

}
