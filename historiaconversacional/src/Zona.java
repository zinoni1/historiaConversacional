
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zona {

    private String nom;
    private String descripcio;
    public ArrayList<Objecte> arrayObjectes = new ArrayList<>();
    public ArrayList<Personatges> arrayPersonatges = new ArrayList<>();
    public static Map<String, Integer> mapaZones = new HashMap<String, Integer>();

    static {
        mapaZones.put("dormitori", 1);
        mapaZones.put("menjador", 2);
        mapaZones.put("cuina", 5);
        mapaZones.put("banys", 10);
        mapaZones.put("vestuari", 6);
        mapaZones.put("taller", 9);
        mapaZones.put("comandament", 8);
        mapaZones.put("oficines", 7);
        mapaZones.put("salaSortidaExterior", 3);
        mapaZones.put("propulsors", 4);
    }
    private Objecte objecte;
    public static int id;
    private int adalt;
    private int abaix;
    private int dreta;
    private int esquerra;
    private Personatges personatge;
    public int nord;
    public int sud;
    public int est;
    public int oest;

    public Zona(String nom, String descripcio, int adalt, int abaix, int dreta, int esquerra, int id, int nord,
            int sud, int est, int oest) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.adalt = adalt;
        this.abaix = abaix;
        this.dreta = dreta;
        this.esquerra = esquerra;
        this.id = id;
        this.nord = nord;
        this.sud = sud;
        this.est = est;
        this.oest = oest;
        this.arrayObjectes = arrayObjectes;
        this.arrayPersonatges = arrayPersonatges;
    }

    public String getNom() {
        return this.nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setPersonatge(Personatges bond) {
        this.personatge = bond;
    }

    public ArrayList<Objecte> getArrayObjectes() {
        return arrayObjectes;
    }

    public void setArrayObjectes(ArrayList<Objecte> arrayObjectes) {
        this.arrayObjectes = arrayObjectes;
    }

    public Objecte getObjecte() {
        return objecte;
    }

    public int getAdalt() {
        return this.adalt;
    }

    public int getAbaix() {
        return abaix;
    }

    public int getDreta() {
        return dreta;
    }

    public int getEsquerra() {
        return esquerra;
    }

    public Personatges getPersonatge() {
        return personatge;
    }

    public boolean isAdalt() {
        return adalt != -1;
    }

    public int getId() {
        return this.id;
    }

    public int getNord() {
        return nord;
    }

    public int getSud() {
        return sud;
    }

    public int getEst() {
        return est;
    }

    public int getOest() {
        return oest;
    }

    public boolean isAbaix() {
        return abaix != -1;
    }

    public boolean isDreta() {
        return dreta != -1;
    }

    public boolean isEsquerra() {
        return esquerra != -1;
    }

    public ArrayList<Personatges> getArrayPersonatges() {
        return arrayPersonatges;
    }

    public static String getNombrePorId(int id) {

        String nombre = "";
        for (Map.Entry<String, Integer> entry : mapaZones.entrySet()) {
            if (entry.getValue() == id) {
                nombre = entry.getKey();
                break;
            }
        }
        return nombre;

    }

}