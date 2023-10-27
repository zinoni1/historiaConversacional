public class Gonzalin extends Personatges {
    private Zona zonaActual = Joc.ZonaAleatoria2;

    public Gonzalin(String nom, String descripcio) {
        super(nom, descripcio);
        zonaActual = Joc.ZonaAleatoria2;
    }

    @Override
    public Zona getZonaActual() {

        return zonaActual;
    }
}
