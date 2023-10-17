import java.util.ArrayList;

public class Bond extends Personatges {
    static ArrayList<Objecte> Inventari = new ArrayList<Objecte>();

    public Bond(String nom, String descripcio) {
        super(nom, descripcio);
        this.Inventari = new ArrayList<Objecte>();
    }

}
