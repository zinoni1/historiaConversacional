import java.util.Scanner;

public class Joc {
        static boolean sortirmenuprin = true;
        static boolean acabarjoc = true;
        static boolean sortirjoc1 = true;

        public static void main(String[] args) throws Exception {
                Jugar();

        }

        static Zona dormitori = new Zona("Dormitori", "Estas al dormitori", 0, -1, -1, 0, 1, 10, 1, 1, 2);
        static Zona menjador = new Zona("Menjador", "Estas al menjador", -1, 0, 0, 0, 2, 2, 3, 1, 5);
        static Zona cuina = new Zona("Cuina", "Estas a la cuina", 0, -1, 0, -1, 5, 6, 5, 2, 5);
        static Zona banys = new Zona("Banys", "Estas als banys", -1, 0, -1, 0, 10, 10, 1, 10, 7);
        static Zona vestuari = new Zona("Vestuari", "Estas al vestuari", -1, 0, 0, -1, 6, 6, 5, 7, 6);
        static Zona taller = new Zona("Taller", "Estas al taller", -1, 0, -1, -1, 9, 9, 7, 9, 9);
        static Zona comandament = new Zona("Comandament", "Estas al comandament", 0, -1, -1, -1, 8, 7, 8, 8, 8);
        static Zona oficines = new Zona("Oficines", "Estas a les oficines", 0, 0, 0, 0, 7, 9, 8, 10, 6);
        static Zona salaSortidaExterior = new Zona("Sala sortida exterior", "Estas a la sala sortida exterior", 0, 0,
                        -1, -1, 3, 2, 4, 3, 3);
        static Zona propulsors = new Zona("Propulsors", "Estas als propulsors", 0, -1, -1, -1, 4, 3, 4, 4, 4);

        static Personatges bond = new Personatges("Bond", "Un agent secret");
        static Personatges iHall = new Personatges("iHall", "Un robot");
        static Personatges gonzalin = new Personatges("Gonzalin", "Un alien");
        static Personatges npc = new Personatges("Npc", "Un company");

        static Objecte einaTaller = new Objecte("Eina del taller", "Una eina que es troba al taller");
        static Objecte llanterna = new Objecte("Llanterna", "Una llanterna que es troba al vestuari");
        static Objecte vestitEspacial = new Objecte("Vestit espacial", "Un vestit espacial que es troba al vestuari");
        static Objecte tarjaIdentificadora = new Objecte("Tarja identificadora",
                        "Una tarja identificadora que es troba a les oficines");
        static Objecte tarjaIdentificadoraCompany = new Objecte("Tarja identificadora company",
                        "Una tarja identificadora company que es troba a les oficines");
        static Objecte donuts = new Objecte("Dònuts", "Uns dònuts que es troben a la cuina");

        static int random = (int) (Math.random() * 10 + 1);
        static String zonaAl = Zona.getNombrePorId(random);
        static Zona ZonaAleatoria = getZonaPorNombre(zonaAl);
        static {
                vestuari.arrayObjectes.add(vestitEspacial);
                menjador.arrayObjectes.add(donuts);
                ZonaAleatoria.arrayObjectes.add(llanterna);
                taller.arrayObjectes.add(einaTaller);
                oficines.arrayObjectes.add(tarjaIdentificadora);
                dormitori.arrayObjectes.add(tarjaIdentificadoraCompany);
        }

        public static Zona getZonaPorNombre(String nombre) {

                switch (nombre) {
                        case "dormitori":
                                return dormitori;
                        case "menjador":
                                return menjador;
                        case "cuina":
                                return cuina;
                        case "banys":
                                return banys;
                        case "vestuari":
                                return vestuari;
                        case "taller":
                                return taller;
                        case "comandament":
                                return comandament;
                        case "oficines":
                                return oficines;
                        case "salaSortidaExterior":
                                return salaSortidaExterior;
                        case "propulsors":
                                return propulsors;
                        default:
                                return null;
                }
        }

        public static void Jugar() {
                Scanner sc = new Scanner(System.in);

                do {
                        System.out.println("1 - Historia / Objectes");
                        System.out.println("2 - Jugar");
                        System.out.println("3 - Sortir");
                        int opcio = sc.nextInt();
                        switch (opcio) {
                                case 1:
                                        System.out.println(
                                                        "Any 2120 D.C. La nau PiaXXII explora l'espai inhòspit en direcció al planeta SUMMEM on es creu que hi poden haver les");
                                        System.out.println(
                                                        "condicions idònies per arrelar una nova vida, que ja no és possible dur a terme en el planeta Pia.");
                                        System.out.println(
                                                        "Després d’un llarg període d’hivernació provocada pel llarg viatge al planeta SUMMEM, el cap de la tripulació");
                                        System.out.println(
                                                        "de la PiaXXII es desperta del son induït. L’ordinador de la nau iHall ha detectat una anomalia en el sistema i");
                                        System.out.println(
                                                        "necessita de la intervenció del cap de la tripulació per resoldre’l.");
                                        System.out.println(
                                                        "- Que tal ha dormit capità Bond?. Em sap greu destorbar-lo però he detectat una anomalia a la nau.");
                                        System.out.println("Sembla ser que se’ns gira feina.");
                                        System.out.println(
                                                        "- Coi de ferralla “intel·ligent”! – En Bond està altament irritat ja que el somni no podia ser d’allò més");
                                        System.out.println(
                                                        "excitant i realista... - espero que hagi estat indispensable haver-me destorbat el són!. Sinó preparat");
                                        System.out.println(
                                                        "per que et programi unes quantes sessions de Treball cooperatiu amb un pedagog inspirat....");
                                        System.out.println(
                                                        "- Li garanteixo Capità Bond que no és una falsa alarma, no m’arriscaria a patir un càstig similar...");
                                        System.out.println(
                                                        "- Està bé iHall – murmurà el capità ja més despert i calmat – donem l’informe de la situació i anem per feina!, que vull tornar a agafar el son.");
                                        System.out.println(
                                                        "iHall procedeix a explicar detalladament la situació al capità.... Resulta que hem xocat amb un petit aeròlit que");
                                        System.out.println(
                                                        "ha provocat petits danys al sistema de propulsió de la nau que requereixen de la intervenció humana.");
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("TUTORIAL OBJECTES");
                                        System.out.println();
                                        System.out.println("Eina del taller: ");
                                        System.out.println("");
                                        System.out.println(
                                                        "L'eina està en el taller però està a les fosques per un fallo de llum i no la podem trobar si no");
                                        System.out.println(
                                                        "disposem de la llanterna que només la iHall sap on és. Caldrà preguntar-li a ell de cara a que ens digui on");
                                        System.out.println("para. En cada partida està en llocs diferents.");
                                        System.out.println("L’eina es pot fer servir amb:");
                                        System.out.println("- Propulsors: repararem el motor de la nau.");
                                        System.out.println(
                                                        "- “Gonzalin”: Si intentem atacar a en “Gonzalin” amb l’eina, se’ns colarà directament per la gola i al");
                                        System.out.println(
                                                        "cap de 7 moviments o instruccions, morirem perquè un nou “Gonzalin” petit sortirà des del nostre estómac.");
                                        System.out.println("");
                                        System.out.println("LLANTERNA: ");
                                        System.out.println("");
                                        System.out.println(
                                                        "La llanterna no sabem inicialment on es troba. Només iHall sap on està situada. En cada partida");
                                        System.out.println(
                                                        "està en llocs diferents de la nau. Per poder trobar-la cal que preguntem a iHall que en un 50% de probabilitat");
                                        System.out.println(
                                                        "ens dirà on està de forma correcta. En l’altra 50% ens dirà una bestiesa.");
                                        System.out.println("La llanterna la podem fer servir:");
                                        System.out.println(
                                                        "- En qualsevol lloc de la nau: La podem encendre en qualsevol lloc. Serà imprescindible tenir-la per");
                                        System.out.println("poder agafar l’eina que ens permetrà reparar els motors.");
                                        System.out.println("");
                                        System.out.println("VESTIT ESPACIAL");
                                        System.out.println("");
                                        System.out
                                                        .println("Situat als vestuaris. Simplement ens el podrem posar o treure i poca cosa més.");
                                        System.out.println("TARJA IDENTIFICADORA");
                                        System.out.println(
                                                        "Situada en alguna part de l’oficina principal de la nau. No està a simple vista.");
                                        System.out.println(
                                                        "Segurament està dins d’algun calaix d’algun escriptori de la sala. Per tant, caldrà obrir el calaix abans de poder agafar la tarja.");
                                        System.out.println("Es pot fer servir:");
                                        System.out.println(
                                                        "- Portes: Si disposem de la tarja, automàticament ens permetrà obrir la porta. En cas contrari no");
                                        System.out.println("podrem obrir-la i caldrà que ho demanem a iHall.");
                                        System.out.println("");
                                        System.out.println("TARJA IDENTIFICADORA COMPANY");
                                        System.out.println("");
                                        System.out.println(
                                                        "Podem agafar la tarja identificadora d’un company però les porten posades");
                                        System.out.println(
                                                        "i cal primer poder-los despertar. Si els despertem, el company anirà voltant per la nau lliurement i si el troba");
                                        System.out.println(
                                                        "en “Gonzalin”, finalitzarà la partida. També pot passar que el company vagi a la cuina i, si troba els dònuts,");
                                        System.out.println(
                                                        "se’ls menjarà i no podrem fer-los servir per despistar a en “Gonzalin”. El company es mourà de forma");
                                        System.out.println(
                                                        "aleatòria entre sales però el seu moviment serà d’una sala per tirada i només pot anar a les sales que estan");
                                        System.out.println("al costat de la que es trobi en aquell moment.");
                                        System.out.println("Es pot fer servir:");
                                        System.out.println(
                                                        "- Portes: iHall detectarà que no es la nostra tarja i ens obrirà la porta però ens recordarà que no es la");
                                        System.out.println("nostra tarja i ens farà la vida impossible.");
                                        System.out.println("");
                                        System.out.println("DÒNUTS");
                                        System.out.println("");
                                        System.out.println(
                                                        "Estan a la cuina de la nau i seran imprescindibles per poder despistar a en “Gonzalin” en. Tal i");
                                        System.out.println("com hem dit, si els troba el company, se’ls menjarà.");
                                        System.out.println("Els podem fer servir:");
                                        System.out
                                                        .println("- “Gonzalin”: El despista i el manté entretingut durant la resta de la partida.");
                                        System.out.println(
                                                        "“Gonzalin”: l’Alien passeja lliurament per la nau. Cada dos moviments d’en Bond, en “Gonzalin” es bellugarà.");
                                        System.out.println(
                                                        "Per tant cal anar amb compte de no trobar-nos-el per la nau. Podem preguntar a iHall per que ens digui a on es troba en cada moment.");

                                        break;
                                case 2:

                                        sortirmenuprin = false;
                                        break;
                                case 3:
                                        System.out.println("Adeu");
                                        System.exit(0);
                                        break;
                        }
                } while (sortirmenuprin == true);
                Zona zonaActual = dormitori;
                do {

                        System.out.println(
                                        "                            |-------------------------------|");
                        System.out.println(
                                        "                            |                               |");

                        System.out.println(
                                        "                            |            Tallers            |");
                        System.out.println(
                                        "                            |                               |");

                        System.out.println(
                                        "|---------------------------|-----------          ----------|----------------------------|");
                        System.out.println(
                                        "|                           |                               |                            |");
                        System.out.println(
                                        "|                           |                               |                            |");
                        System.out.println(
                                        "|                                                                                        |");
                        System.out.println(
                                        "|                                                                                        |");
                        System.out.println(
                                        "|          Vestuari                      Oficines                        Banys           |");
                        System.out.println(
                                        "|                                                                                        |");

                        System.out.println(
                                        "|                           |         |---     ---|         |                            |");
                        System.out.println(
                                        "|                           |      |--|           |--|      |                            |");
                        System.out.println(
                                        "|                           |      |                 |      |                            |");
                        System.out.println(
                                        "|---------         ---------|------|   Comandament   |------|----------         ---------|");
                        System.out.println(
                                        "|                           |      |                 |      |                            |");
                        System.out.println(
                                        "|                           |      |--|           |--|      |                            |");
                        System.out.println(
                                        "|                           |         |-----------|         |                            |");

                        System.out.println(
                                        "|                                                                                        |");
                        System.out.println(
                                        "|           Cuina                                                      Dormitori         |");
                        System.out.println(
                                        "|                                        Menjador                                        |");
                        System.out.println(
                                        "|                                                                                        |");
                        System.out.println(
                                        "|                           |                               |                            |");
                        System.out.println(
                                        "|---------------------------|-----------         -----------|----------------------------|");
                        System.out.println(
                                        "                            |                               |");
                        System.out.println(
                                        "                            |      Sala sortida exterior    |");
                        System.out.println(
                                        "                            |                               |");
                        System.out.println(
                                        "                            |-------------------------------|");
                        System.out.println("                                       __________");
                        System.out.println(
                                        "                                      |__________|   Propulsors");
                        System.out.println("                                      |__________|");

                        System.out.println("Estas a la zona: " + zonaActual.getNom());
                        zonaActual.setPersonatge(bond);
                        System.out.println("Que vols fer?");
                        System.out.println("1 - Objectes de la zona");
                        System.out.println("2 - Personatges de la zona");
                        System.out.println("3 - Cambiar Zona");
                        int opcio2 = sc.nextInt();
                        switch (opcio2) {
                                case 1:
                                        System.out.println("Objectes de la zona: ");
                                        for (Objecte objecte : zonaActual.getArrayObjectes()) {
                                                System.out.println(objecte.getNom());
                                        }
                                        if (zonaActual.getArrayObjectes().isEmpty()) {
                                                System.out.println("No hi ha objectes a la zona");
                                        }

                                        System.out.println("Que vols fer?");
                                        System.out.println("1 - Agafar objecte");
                                        System.out.println("2 - Deixar objecte");
                                        int opcio4 = sc.nextInt();
                                        switch (opcio4) {
                                                case 1:
                                                        System.out.println("Quin objecte vols agafar?");

                                                        int i = 1;
                                                        for (Objecte objecte : zonaActual.getArrayObjectes()) {
                                                                System.out.println(i + ". " + objecte.getNom());
                                                                i++;
                                                        }
                                                        System.out.println(i + ". Tots els objectes");

                                                        int eleccio = sc.nextInt();
                                                        if (i - 1 == 1) {
                                                                switch (eleccio) {
                                                                        case 1:
                                                                                Objecte obj1 = zonaActual
                                                                                                .getArrayObjectes()
                                                                                                .get(0);
                                                                                Bond.Inventari.add(obj1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .remove(obj1);
                                                                                System.out.println(
                                                                                                "Has agafat l'objecte "
                                                                                                                + obj1.getNom());
                                                                                break;

                                                                        default:
                                                                                for (Objecte objecte : zonaActual
                                                                                                .getArrayObjectes()) {
                                                                                        Bond.Inventari.add(objecte);

                                                                                }
                                                                                zonaActual.arrayObjectes.clear();
                                                                                System.out.println(
                                                                                                "Has agafat tots els objectes");
                                                                                break;
                                                                }
                                                        }
                                                        break;
                                                case 2:
                                                        System.out.println("Quin objecte vols deixar?");

                                                        int i1 = 1;
                                                        for (Objecte objecte : Bond.Inventari) {
                                                                System.out.println(
                                                                                i1 + ". " + objecte.getNom());
                                                                i1++;
                                                        }
                                                        System.out.println(i1 + ". Tots els objectes");

                                                        int eleccio1 = sc.nextInt();

                                                        switch (eleccio1) {
                                                                case 1:
                                                                        Objecte obj1 = Bond.Inventari.get(0);
                                                                        zonaActual.getArrayObjectes().add(obj1);
                                                                        Bond.Inventari.remove(obj1);
                                                                        System.out.println(
                                                                                        "Has deixat l'objecte "
                                                                                                        + obj1.getNom());
                                                                        break;

                                                                default:
                                                                        for (Objecte objecte : Bond.Inventari) {
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(objecte);
                                                                        }
                                                                        Bond.Inventari.clear();
                                                                        System.out.println(
                                                                                        "Has deixat tots els objectes");
                                                                        break;
                                                        }

                                        }

                                        break;
                                case 2:
                                        System.out.println("Personatges de la zona: ");
                                        System.out.println(zonaActual.getArrayPersonatges());
                                        break;
                                case 3:
                                        do {
                                                System.out.println("A quina zona vols anar?");
                                                System.out.println("1 - Adalt");
                                                System.out.println("2 - Abaix");
                                                System.out.println("3 - Dreta");
                                                System.out.println("4 - Esquerra");

                                                String opcio3 = sc.next();

                                                switch (opcio3) {
                                                        case "1":

                                                                if (zonaActual.isAdalt()) {
                                                                        int idNord = zonaActual.getNord();

                                                                        String zona = Zona.getNombrePorId(idNord);
                                                                        zonaActual = getZonaPorNombre(zona);
                                                                        zonaActual.setPersonatge(bond);
                                                                        acabarjoc = false;

                                                                        break;
                                                                } else {
                                                                        System.out.println("No pots anar cap adalt");
                                                                        acabarjoc = true;
                                                                        break;
                                                                }

                                                        case "2":
                                                                if (zonaActual.isAbaix()) {
                                                                        int idSud = zonaActual.getSud();
                                                                        String zona = Zona.getNombrePorId(idSud);
                                                                        zonaActual = getZonaPorNombre(zona);
                                                                        zonaActual.setPersonatge(bond);
                                                                        acabarjoc = false;
                                                                        break;
                                                                } else {
                                                                        System.out.println("No pots anar cap abaix");
                                                                        acabarjoc = true;
                                                                        break;
                                                                }

                                                        case "3":
                                                                if (zonaActual.isDreta()) {
                                                                        int idest = zonaActual.getEst();
                                                                        String zona = Zona.getNombrePorId(idest);
                                                                        zonaActual = getZonaPorNombre(zona);
                                                                        zonaActual.setPersonatge(bond);
                                                                        acabarjoc = false;
                                                                        break;
                                                                } else {
                                                                        System.out.println(
                                                                                        "No pots anar cap a la dreta");
                                                                        acabarjoc = true;
                                                                        break;
                                                                }
                                                        case "4":
                                                                if (zonaActual.isEsquerra()) {

                                                                        int idOest = zonaActual.getOest();
                                                                        String zona = Zona.getNombrePorId(idOest);
                                                                        zonaActual = getZonaPorNombre(zona);
                                                                        zonaActual.setPersonatge(bond);
                                                                        acabarjoc = false;
                                                                        break;
                                                                } else {
                                                                        System.out.println(
                                                                                        "No pots anar cap a l'esquerra");
                                                                        acabarjoc = true;
                                                                        break;
                                                                }
                                                        default: {
                                                                System.out.println("Opcio incorrecta");
                                                                acabarjoc = true;
                                                                break;
                                                        }

                                                }

                                        } while (acabarjoc == true);
                        }

                } while (sortirjoc1 == true);
                sc.close();

        }

}
