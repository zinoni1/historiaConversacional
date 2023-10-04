import java.util.ArrayList;

public class Zona {
    public String nom;
    private String descripcio;
    public ArrayList<Objecte> arrayObjectes = new ArrayList<>();
    private Objecte objecte;

    public Zona(String nom, String descripcio, ArrayList<Objecte> arrayObjectes) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.arrayObjectes = arrayObjectes;

    }

    // crear getNOM
    public String getNom() {
        return nom;
    }

    // banys
    public void banys() {
        Zona banys = new Zona("Banys", "Banys per fer-te una passadeta", arrayObjectes);
        System.out.println(banys.nom + ": " + banys.descripcio);

    }

    // menjador
    public void menjador() {
        Zona menjador = new Zona("Menjador", "Menjador per menjar", arrayObjectes);
        System.out.println(menjador.nom + ": " + menjador.descripcio);

    }

    // tallers
    public void tallers() {
        Zona tallers = new Zona("Tallers", "Tallers per arreglar els teus aparells", arrayObjectes);
        System.out.println(tallers.nom + ": " + tallers.descripcio);
        arrayObjectes.add(objecte.getEina());

    }

    // vestuaris
    public void vestuaris() {
        Zona vestuaris = new Zona("Vestuaris", "Vestuaris per canviar-te", arrayObjectes);
        System.out.println(vestuaris.nom + ": " + vestuaris.descripcio);
        arrayObjectes.add(objecte.getTraje());
    }

    // cuina
    public void cuina() {
        Zona cuina = new Zona("Cuina", "Cuina per cuinar ", arrayObjectes);
        System.out.println(cuina.nom + ": " + cuina.descripcio);

        for (int i = 0; i < 6; i++) {
            arrayObjectes.add(objecte.getDonut());
        }
    }

    // dormitori
    public void dormitori() {
        Zona dormitori = new Zona("Dormitori", "Dormitori per dormir", arrayObjectes);
        System.out.println(dormitori.nom + ": " + dormitori.descripcio);
    }

    // comandament
    public void comandament() {
        Zona comandament = new Zona("Comandament", "Comandament per comandar", arrayObjectes);
        System.out.println(comandament.nom + ": " + comandament.descripcio);

    }

    public void oficines() {
        Zona oficines = new Zona("Oficines", "Oficines per treballar", arrayObjectes);
        System.out.println(oficines.nom + ": " + oficines.descripcio);
    }

    public void salaSortida() {
        Zona salaSortida = new Zona("Sala sortida exterior", "Sala sortida per sortir a l'exterior", arrayObjectes);
        System.out.println(salaSortida.nom + ": " + salaSortida.descripcio);
    }

    public void propulsors() {
        Zona propulsors = new Zona("Propulsors", "Dormitori per dormir", arrayObjectes);
        System.out.println(propulsors.nom + ": " + propulsors.descripcio);
    }

}
