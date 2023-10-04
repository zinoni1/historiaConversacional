public class Objecte {
    public String nom;
    public String descripcio;

    public Objecte(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
    }

    public String getNom() {
        return nom;
    }

    // crear objecte donut
    public void donut() {
        Objecte donut = new Objecte("Donut", "Un donut de color rosa");
    }

    // crear objecte traje
    public void traje() {
        Objecte traje = new Objecte("Traje", "Un traje de astronauta");
    }

    // crear objecte eina
    public void eina() {
        Objecte eina = new Objecte("Eina", "Una eina per arreglar coses");
    }

    // crear objecte targeta
    public void targeta() {
        Objecte targeta = new Objecte("Targeta", "Una targeta per obrir portes");
    }

    // crear objecte llanterna
    public void llanterna() {
        Objecte llanterna = new Objecte("Llanterna", "Una llanterna per veure a la foscor");
    }

    public Objecte getTraje() {
        return new Objecte("Traje", "Un traje de astronauta");
    }

    public Objecte getEina() {
        return new Objecte("Eina", "Una eina per arreglar coses");
    }

    public Objecte getTargeta() {
        return new Objecte("Targeta", "Una targeta per obrir portes");
    }

    public Objecte getLlanterna() {
        return new Objecte("Llanterna", "Una llanterna per veure a la foscor");
    }

    public Objecte getDonut() {
        return new Objecte("Donut", "Un donut de color rosa");
    }

}
