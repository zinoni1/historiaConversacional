import java.util.Scanner;

public class Joc {
        static boolean sortirmenuprin = true;
        static boolean acabarjoc = true;
        static boolean sortirjoc1 = true;

        public static void main(String[] args) throws Exception {

                String zonaAl = Zona.getNombrePorId(numrandom());
                Zona ZonaAleatoria = getZonaPorNombre(zonaAl);

                String zonaAl2 = Zona.getNombrePorId(numrandom1());
                Zona ZonaAleatoria2 = getZonaPorNombre(zonaAl2);

                Jugar();

        }

        static Zona dormitori = new Zona("dormitori", "Estas al dormitori", 0, -1, -1, 0, 1, 10, 1, 1, 2);
        static Zona menjador = new Zona("menjador", "Estas al menjador", -1, 0, 0, 0, 2, 2, 3, 1, 5);
        static Zona cuina = new Zona("cuina", "Estas a la cuina", 0, -1, 0, -1, 5, 6, 5, 2, 5);
        static Zona banys = new Zona("banys", "Estas als banys", -1, 0, -1, 0, 10, 10, 1, 10, 7);
        static Zona vestuari = new Zona("vestuari", "Estas al vestuari", -1, 0, 0, -1, 6, 6, 5, 7, 6);
        static Zona taller = new Zona("taller", "Estas al taller", -1, 0, -1, -1, 9, 9, 7, 9, 9);
        static Zona comandament = new Zona("comandament", "Estas al comandament", 0, -1, -1, -1, 8, 7, 8, 8, 8);
        static Zona oficines = new Zona("oficines", "Estas a les oficines", 0, 0, 0, 0, 7, 9, 8, 10, 6);
        static Zona salaSortidaExterior = new Zona("Sala sortida exterior", "Estas a la sala sortida exterior", 0, 0,
                        -1, -1, 3, 2, 4, 3, 3);
        static Zona propulsors = new Zona("Propulsors", "Estas als propulsors", 0, -1, -1, -1, 4, 3, 4, 4, 4);

        static Personatges bond = new Personatges(" Bond", "Un agent secret");
        static Personatges iHall = new Personatges(" iHall", "Un robot");
        static Personatges gonzalin = new Personatges(" Gonzalin", "sóc un alien");
        static Personatges npc = new Personatges(" Npc", "sóc un company");

        static Objecte einaTaller = new Objecte("Eina del taller", "Una eina que es troba al taller");
        static Objecte llanterna = new Objecte("Llanterna", "Una llanterna que es troba al vestuari");
        static Objecte vestitEspacial = new Objecte("Vestit espacial", "Un vestit espacial que es troba al vestuari");
        static Objecte tarjaIdentificadora = new Objecte("Tarja identificadora",
                        "Una tarja identificadora que es troba a les oficines");
        static Objecte tarjaIdentificadoraCompany = new Objecte("Tarja identificadora company",
                        "Una tarja identificadora company que es troba a les oficines");
        static Objecte donuts = new Objecte("Dònut", "Uns dònuts que es troben a la cuina");

        public static int numrandom() {
                int random = (int) (Math.random() * 10 + 1);
                if (random != 4) {
                        return random;
                } else {
                        return numrandom();
                }
        }

        public static int numrandom1() {
                int random = (int) (Math.random() * 10 + 3);
                if (random != 4 && random != 1) {
                        return random;
                } else {

                        return numrandom();
                }
        }

        static String zonaAl = Zona.getNombrePorId(numrandom());
        static Zona ZonaAleatoria = getZonaPorNombre(zonaAl);
        static {
                vestuari.arrayObjectes.add(vestitEspacial);
                menjador.arrayObjectes.add(donuts);
                ZonaAleatoria.arrayObjectes.add(llanterna);
                taller.arrayObjectes.add(einaTaller);
                oficines.arrayObjectes.add(tarjaIdentificadora);
                dormitori.arrayObjectes.add(tarjaIdentificadoraCompany);
        }
        static String zonaAl2 = Zona.getNombrePorId(numrandom1());
        public static Zona ZonaAleatoria2 = getZonaPorNombre(zonaAl2);

        static {
                dormitori.arrayPersonatges.add(bond);
                try {
                        ZonaAleatoria2.arrayPersonatges.add(gonzalin);
                } catch (NullPointerException e) {
                        ZonaAleatoria2 = vestuari;
                }

                dormitori.arrayPersonatges.add(npc);
        }

        public static boolean TeLlanterna() {
                for (Objecte obj : Bond.Inventari) {
                        if (obj.getNom().equals("Llanterna")) {
                                return true;
                        }
                }
                return false;
        }

        public static int ZonaAleatoria() {
                int num = (int) (Math.random() * 10 + 1);
                if (num != 4) {
                        return num;
                } else {

                        return numrandom();
                }
        }

        static String Zaleatoria = Zona.getNombrePorId(numrandom());
        static Zona Zaleatoria1 = getZonaPorNombre(Zaleatoria);

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
                                        // historia
                                        System.out.println(Historia.agafarHistoria());
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
                Zona zonaActualGonza = ZonaAleatoria2;
                Zona zonaActualNpc = dormitori;
                boolean propulsorsReparats = false;
                int moviments = 0;
                int SetMoviments = -1000;
                int opcio2 = 0;
                boolean npcDespert = false;
                boolean llanternaEncesa = false;
                boolean donutDonat = false;
                do {
                        if (zonaActualNpc == zonaActualGonza) {
                                System.out.println("Gonzalin ha matat al company");
                                npcDespert = false;
                                zonaActualNpc.getArrayPersonatges().remove(npc);

                        }
                        if (Bond.Inventari.contains(tarjaIdentificadoraCompany)) {
                                npcDespert = true;
                        }
                        if (SetMoviments == 7) {
                                System.out.println(
                                                "S'ha t'ha colat Gonzalin per la gola. Et sortira un nou Gonzalin petit per l'estómac.");
                                System.exit(0);
                        }
                        if (moviments > 0 && opcio2 == 3) {
                                do {
                                        int opcioNpc = (int) (Math.random() * 4 + 1);

                                        switch (opcioNpc) {
                                                case 1:
                                                        if (zonaActualNpc.isAdalt()) {
                                                                int idNord = zonaActualNpc.getNord();
                                                                String zona = Zona.getNombrePorId(idNord);
                                                                zonaActualNpc = getZonaPorNombre(zona);

                                                                zonaActualNpc.setPersonatge(gonzalin);

                                                                zonaActualNpc.arrayPersonatges.add(gonzalin);

                                                                acabarjoc = false;
                                                                break;
                                                        }
                                                case 2:
                                                        if (zonaActualNpc.isAbaix()) {
                                                                int idSud = zonaActualNpc.getSud();
                                                                String zona = Zona.getNombrePorId(idSud);
                                                                zonaActualNpc = getZonaPorNombre(zona);
                                                                zonaActualNpc.setPersonatge(gonzalin);
                                                                zonaActualNpc.arrayPersonatges.add(gonzalin);

                                                                acabarjoc = false;
                                                                break;
                                                        }
                                                case 3:
                                                        if (zonaActualNpc.isDreta()) {
                                                                int idest = zonaActualNpc.getEst();
                                                                String zona = Zona.getNombrePorId(idest);
                                                                zonaActualNpc = getZonaPorNombre(zona);
                                                                zonaActualNpc.setPersonatge(gonzalin);
                                                                zonaActualNpc.arrayPersonatges.add(gonzalin);

                                                                acabarjoc = false;
                                                                break;
                                                        }

                                                case 4:
                                                        if (zonaActualNpc.isEsquerra()) {
                                                                int idOest = zonaActualNpc.getOest();
                                                                String zona = Zona.getNombrePorId(idOest);
                                                                zonaActualNpc = getZonaPorNombre(zona);
                                                                zonaActualNpc.setPersonatge(gonzalin);
                                                                zonaActualNpc.arrayPersonatges.add(gonzalin);

                                                                acabarjoc = false;
                                                                break;
                                                        }
                                                default:
                                                        break;
                                        }

                                } while (acabarjoc == true);
                        }
                        if (moviments % 2 == 0 && moviments != 0 && opcio2 == 3) {
                                do {
                                        int opcioGonza = (int) (Math.random() * 4 + 1);

                                        switch (opcioGonza) {
                                                case 1:
                                                        if (zonaActualGonza.isAdalt()) {
                                                                int idNord = zonaActualGonza.getNord();
                                                                String zona = Zona.getNombrePorId(idNord);
                                                                zonaActualGonza = getZonaPorNombre(zona);
                                                                if (SetMoviments < 0) {
                                                                        zonaActualGonza.setPersonatge(gonzalin);

                                                                        zonaActualGonza.arrayPersonatges.add(gonzalin);
                                                                }
                                                                acabarjoc = false;
                                                                break;
                                                        } else {
                                                                acabarjoc = true;
                                                        }
                                                case 2:
                                                        if (zonaActualGonza.isAbaix()) {
                                                                int idSud = zonaActualGonza.getSud();
                                                                String zona = Zona.getNombrePorId(idSud);
                                                                zonaActualGonza = getZonaPorNombre(zona);
                                                                if (SetMoviments < 0) {
                                                                        zonaActualGonza.setPersonatge(gonzalin);

                                                                        zonaActualGonza.arrayPersonatges.add(gonzalin);
                                                                }
                                                                acabarjoc = false;
                                                                break;
                                                        } else {
                                                                acabarjoc = true;
                                                        }
                                                case 3:
                                                        if (zonaActualGonza.isDreta()) {
                                                                int idest = zonaActualGonza.getEst();
                                                                String zona = Zona.getNombrePorId(idest);
                                                                zonaActualGonza = getZonaPorNombre(zona);
                                                                if (SetMoviments < 0) {
                                                                        zonaActualGonza.setPersonatge(gonzalin);

                                                                        zonaActualGonza.arrayPersonatges.add(gonzalin);
                                                                }
                                                                acabarjoc = false;
                                                                break;
                                                        } else {
                                                                acabarjoc = true;
                                                        }

                                                case 4:
                                                        if (zonaActualGonza.isEsquerra()) {
                                                                int idOest = zonaActualGonza.getOest();
                                                                String zona = Zona.getNombrePorId(idOest);
                                                                zonaActualGonza = getZonaPorNombre(zona);
                                                                if (SetMoviments < 0) {
                                                                        zonaActualGonza.setPersonatge(gonzalin);

                                                                        zonaActualGonza.arrayPersonatges.add(gonzalin);
                                                                }
                                                                acabarjoc = false;
                                                                break;
                                                        } else {
                                                                acabarjoc = true;
                                                        }
                                                default:
                                                        break;
                                        }

                                } while (acabarjoc == true);

                        }
                        if (zonaActual.getArrayPersonatges().contains(gonzalin)
                                        && Bond.Inventari.contains(donuts) && Bond.Inventari.contains(einaTaller)
                                        && SetMoviments < 0) {
                                System.out.println("Tria una opcio");
                                System.out.println("1 - Donarli el donut a Gonzalin");
                                System.out.println("2 - Tirar-li l'eina a Gonzalin");
                                int opcio = sc.nextInt();
                                switch (opcio) {
                                        case 1:
                                                for (Objecte objecte : Bond.Inventari) {
                                                        if (objecte.getNom().equals(
                                                                        "Dònut")) {
                                                                Bond.Inventari.remove(
                                                                                objecte);
                                                                System.out.println(
                                                                                "Li has donat el "
                                                                                                + objecte.getNom()
                                                                                                + " a "
                                                                                                + gonzalin.getNom()
                                                                                                + " , estara entretingut durant la resta de la partida");
                                                                donutDonat = true;
                                                                zonaActual.getArrayPersonatges().remove(gonzalin);
                                                                zonaActualGonza.getArrayPersonatges().remove(gonzalin);
                                                                break;
                                                        }

                                                }
                                                continue;
                                        case 2:
                                                for (Objecte objecte : Bond.Inventari) {
                                                        if (objecte.getNom().equals(
                                                                        "Eina del taller")) {

                                                                System.out.println(
                                                                                "Li has donat el "
                                                                                                + objecte.getNom()
                                                                                                + " a "
                                                                                                + gonzalin.getNom()
                                                                                                + " , estara confós durant 7 torns");
                                                                zonaActual.getArrayPersonatges().remove(gonzalin);
                                                                zonaActualGonza.getArrayPersonatges().remove(gonzalin);
                                                                SetMoviments = 0;
                                                                break;
                                                        }

                                                }

                                }
                        }
                        if (zonaActual == zonaActualGonza
                                        && Bond.Inventari.contains(donuts) && SetMoviments < 0) {

                                for (Objecte objecte : Bond.Inventari) {
                                        if (objecte.getNom().equals(
                                                        "Dònut")) {
                                                Bond.Inventari.remove(
                                                                objecte);
                                                System.out.println(
                                                                "Li has donat el "
                                                                                + objecte.getNom()
                                                                                + " a "
                                                                                + gonzalin.getNom()
                                                                                + " , estara entretingut durant la resta de la partida");
                                                donutDonat = true;
                                                zonaActual.getArrayPersonatges().remove(gonzalin);
                                                zonaActualGonza.getArrayPersonatges().remove(gonzalin);
                                                break;
                                        }

                                }

                        }
                        if (zonaActual == zonaActualGonza
                                        && Bond.Inventari.contains(einaTaller) && SetMoviments < 0
                                        && !Bond.Inventari.contains(donuts)) {

                                for (Objecte objecte : Bond.Inventari) {
                                        if (objecte.getNom().equals(
                                                        "Eina del taller")) {

                                                System.out.println(
                                                                "Li has llençat l'"
                                                                                + objecte.getNom()
                                                                                + " a "
                                                                                + gonzalin.getNom()
                                                                                + " , estara confós durant 7 torns");
                                                zonaActualGonza.getArrayPersonatges().remove(gonzalin);
                                                zonaActual.getArrayPersonatges().remove(gonzalin);
                                                SetMoviments = 0;
                                                break;
                                        }

                                }
                        } else if (Bond.Inventari.contains(donuts) == false
                                        && zonaActual == zonaActualGonza && SetMoviments < 0 && donutDonat == false) {
                                System.out.println("No tens donuts, has mort per culpa de Gonzalin");
                                System.exit(0);

                        } else

                                System.out.println("Estas a la zona: " + zonaActual.getNom());
                        zonaActual.setPersonatge(bond);
                        System.out.println("Que vols fer?");
                        System.out.println("1 - Objectes de la zona");
                        System.out.println("2 - Personatges de la zona");
                        System.out.println("3 - Cambiar Zona");
                        System.out.println("4 - Inventari");
                        System.out.println("5 - Mostrar mapa");
                        System.out.println("6 - Parlar amb iHall");

                        if (zonaActual == zonaActualNpc && npcDespert == true) {
                                System.out.println("7 - Parlar amb el company");
                        }
                        opcio2 = sc.nextInt();
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
                                        System.out.println("3 - Res");
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

                                                        if (eleccio <= i - 1) {
                                                                Objecte objSelected = zonaActual
                                                                                .getArrayObjectes()
                                                                                .get(eleccio - 1);

                                                                if (objSelected.getNom()
                                                                                .equals("Eina del taller")
                                                                                && TeLlanterna()
                                                                                && llanternaEncesa == false) {
                                                                        System.out.println(
                                                                                        "No pots agafar la eina del taller amb la llanterna apagada!");
                                                                        System.out.println(
                                                                                        "Vols encendre la llanterna?");
                                                                        System.out.println("1 - Si");
                                                                        System.out.println("2 - No");
                                                                        int opcioLlanterna = sc.nextInt();
                                                                        switch (opcioLlanterna) {
                                                                                case 1:
                                                                                        if (Bond.Inventari.contains(
                                                                                                        llanterna)) {
                                                                                                llanternaEncesa = true;
                                                                                                System.out.println(
                                                                                                                "Has encès la llanterna i pots agafar l'eina del taller");
                                                                                                break;
                                                                                        } else {
                                                                                                System.out.println(
                                                                                                                "La llanterna continua apagada");
                                                                                                break;
                                                                                        }
                                                                                case 2:
                                                                                        break;
                                                                        }
                                                                } else if (objSelected.getNom()
                                                                                .equals("Eina del taller")
                                                                                && !TeLlanterna()) {
                                                                        System.out.println(
                                                                                        "No pots agafar la eina del taller sense la llanterna!");
                                                                } else if (zonaActual.getNom()
                                                                                .equals("oficines")
                                                                                && objSelected.getNom().equals(
                                                                                                "Tarja identificadora")) {
                                                                        System.out.println("Has de buscar la Tarja");
                                                                        System.out.println("Obrir l'armari");
                                                                        System.out.println("Obrir el calaix");
                                                                        System.out.println("Obrir la caixa");
                                                                        int opcioTarja = sc.nextInt();
                                                                        switch (opcioTarja) {
                                                                                case 1:
                                                                                        break;
                                                                                case 2:
                                                                                        Bond.Inventari.add(objSelected);
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .remove(objSelected);
                                                                                        System.out.println(
                                                                                                        "Has agafat l'objecte "
                                                                                                                        + objSelected.getNom());
                                                                                case 3:
                                                                                        break;

                                                                        }
                                                                } else {
                                                                        Bond.Inventari.add(objSelected);
                                                                        zonaActual.getArrayObjectes()
                                                                                        .remove(objSelected);
                                                                        System.out.println(
                                                                                        "Has agafat l'objecte "
                                                                                                        + objSelected.getNom());
                                                                        if (objSelected.getNom().equals(
                                                                                        "Tarja identificadora company")) {
                                                                                System.out.println(
                                                                                                "Has despertat al company");
                                                                        }
                                                                }
                                                        } else {

                                                                for (Objecte objecte : zonaActual
                                                                                .getArrayObjectes()) {
                                                                        Bond.Inventari.add(objecte);
                                                                }
                                                                zonaActual.arrayObjectes.clear();
                                                                System.out.println(
                                                                                "Has agafat tots els objectes");
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
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else {
                                                                                Objecte obj1 = Bond.Inventari
                                                                                                .get(eleccio1 - 1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(obj1);
                                                                                Bond.Inventari.remove(obj1);
                                                                                System.out.println(
                                                                                                "Has deixat l'objecte "
                                                                                                                + obj1.getNom());
                                                                        }
                                                                        break;
                                                                case 2:
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else if (Bond.Inventari.size() >= 2) {
                                                                                Objecte obj1 = Bond.Inventari
                                                                                                .get(eleccio1 - 1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(obj1);
                                                                                Bond.Inventari.remove(obj1);
                                                                                System.out.println(
                                                                                                "Has deixat l'objecte "
                                                                                                                + obj1.getNom());
                                                                        } else {
                                                                                for (Objecte objecte : Bond.Inventari) {
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .add(objecte);
                                                                                }
                                                                                Bond.Inventari.clear();
                                                                                System.out.println(
                                                                                                "Has deixat tots els objectes");
                                                                        }
                                                                        break;
                                                                case 3:
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else if (Bond.Inventari.size() >= 3) {
                                                                                Objecte obj1 = Bond.Inventari
                                                                                                .get(eleccio1 - 1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(obj1);
                                                                                Bond.Inventari.remove(obj1);
                                                                                System.out.println(
                                                                                                "Has deixat l'objecte "
                                                                                                                + obj1.getNom());
                                                                        } else {
                                                                                for (Objecte objecte : Bond.Inventari) {
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .add(objecte);
                                                                                }
                                                                                Bond.Inventari.clear();
                                                                                System.out.println(
                                                                                                "Has deixat tots els objectes");
                                                                        }
                                                                        break;
                                                                case 4:
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else if (Bond.Inventari.size() >= 4) {
                                                                                Objecte obj1 = Bond.Inventari
                                                                                                .get(eleccio1 - 1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(obj1);
                                                                                Bond.Inventari.remove(obj1);
                                                                                System.out.println(
                                                                                                "Has deixat l'objecte "
                                                                                                                + obj1.getNom());
                                                                        } else {
                                                                                for (Objecte objecte : Bond.Inventari) {
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .add(objecte);
                                                                                }
                                                                                Bond.Inventari.clear();
                                                                                System.out.println(
                                                                                                "Has deixat tots els objectes");
                                                                        }
                                                                        break;
                                                                case 5:
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else if (Bond.Inventari.size() >= 5) {
                                                                                Objecte obj1 = Bond.Inventari
                                                                                                .get(eleccio1 - 1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(obj1);
                                                                                Bond.Inventari.remove(obj1);
                                                                                System.out.println(
                                                                                                "Has deixat l'objecte "
                                                                                                                + obj1.getNom());
                                                                        } else {
                                                                                for (Objecte objecte : Bond.Inventari) {
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .add(objecte);
                                                                                }
                                                                                Bond.Inventari.clear();
                                                                                System.out.println(
                                                                                                "Has deixat tots els objectes");
                                                                        }
                                                                        break;
                                                                case 6:
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else if (Bond.Inventari.size() >= 6) {
                                                                                Objecte obj1 = Bond.Inventari
                                                                                                .get(eleccio1 - 1);
                                                                                zonaActual.getArrayObjectes()
                                                                                                .add(obj1);
                                                                                Bond.Inventari.remove(obj1);
                                                                                System.out.println(
                                                                                                "Has deixat l'objecte "
                                                                                                                + obj1.getNom());
                                                                        } else {
                                                                                for (Objecte objecte : Bond.Inventari) {
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .add(objecte);
                                                                                }
                                                                                Bond.Inventari.clear();
                                                                                System.out.println(
                                                                                                "Has deixat tots els objectes");
                                                                        }
                                                                        break;
                                                                default:
                                                                        if (Bond.Inventari.isEmpty()) {
                                                                                System.out.println(
                                                                                                "No tens objectes");
                                                                                break;
                                                                        } else {
                                                                                for (Objecte objecte : Bond.Inventari) {
                                                                                        zonaActual.getArrayObjectes()
                                                                                                        .add(objecte);
                                                                                }
                                                                                Bond.Inventari.clear();
                                                                                System.out.println(
                                                                                                "Has deixat tots els objectes");
                                                                        }
                                                                        break;
                                                        }
                                                case 3:
                                                        break;
                                        }

                                        break;
                                case 2:
                                        System.out.println("Personatges de la zona: ");
                                        for (Personatges personatge : zonaActual.getArrayPersonatges()) {
                                                System.out.println(personatge.getNom());
                                        }
                                        break;
                                case 3:
                                        zonaActual.getArrayPersonatges().remove(bond);

                                        do {
                                                System.out.println("A quina zona vols anar?");
                                                System.out.println("1 - Adalt");
                                                System.out.println("2 - Abaix");
                                                System.out.println("3 - Dreta");
                                                System.out.println("4 - Esquerra");

                                                String opcio3 = sc.next();
                                                if (Bond.Inventari.contains(tarjaIdentificadoraCompany)
                                                                || Bond.Inventari.contains(
                                                                                tarjaIdentificadora)) {

                                                        switch (opcio3) {
                                                                case "1":

                                                                        if (zonaActual.isAdalt()) {
                                                                                int idNord = zonaActual
                                                                                                .getNord();

                                                                                String zona = Zona
                                                                                                .getNombrePorId(idNord);
                                                                                zonaActual = getZonaPorNombre(
                                                                                                zona);
                                                                                zonaActual.setPersonatge(bond);
                                                                                acabarjoc = false;
                                                                                zonaActual.arrayPersonatges
                                                                                                .add(bond);
                                                                                moviments++;
                                                                                SetMoviments++;
                                                                                break;
                                                                        } else {
                                                                                System.out.println(
                                                                                                "No pots anar cap adalt");
                                                                                acabarjoc = true;
                                                                                break;
                                                                        }

                                                                case "2":
                                                                        int nomzonaara = zonaActual.getSud();
                                                                        String zonaAra = Zona
                                                                                        .getNombrePorId(nomzonaara);
                                                                        if (zonaActual.isAbaix()
                                                                                        && zonaAra == "propulsors"
                                                                                        && Bond.Inventari
                                                                                                        .contains(vestitEspacial)
                                                                                        && Bond.Inventari.contains(
                                                                                                        einaTaller)) {

                                                                                int idSud = zonaActual.getSud();
                                                                                String zona = Zona
                                                                                                .getNombrePorId(idSud);
                                                                                zonaActual = getZonaPorNombre(
                                                                                                zona);
                                                                                zonaActual.setPersonatge(bond);
                                                                                acabarjoc = false;
                                                                                zonaActual.arrayPersonatges
                                                                                                .add(bond);
                                                                                propulsorsReparats = true;
                                                                                System.out.println(
                                                                                                "Has reparat els propulsors, ves a comandament per encendre els propulsors");

                                                                                break;

                                                                        } else if (zonaActual.isAbaix()
                                                                                        && zonaAra == "comandament"
                                                                                        && propulsorsReparats == true) {
                                                                                {
                                                                                        System.out.println(
                                                                                                        "Has guanyat, has reparat els propulsors i has encès els propulsors, ara pots anar a Summem");
                                                                                        acabarjoc = true;
                                                                                        System.exit(0);
                                                                                        break;

                                                                                }
                                                                        } else if (zonaActual.isAbaix()
                                                                                        && zonaAra == "propulsors"
                                                                                        && Bond.Inventari
                                                                                                        .contains(vestitEspacial) == false) {
                                                                                System.out.println(
                                                                                                "No pots anar cap abaix, no tens el vestit espacial");
                                                                                acabarjoc = true;
                                                                                break;
                                                                        } else if (zonaActual.isAbaix()
                                                                                        && zonaAra != "propulsors") {
                                                                                int idSud = zonaActual.getSud();
                                                                                String zona = Zona
                                                                                                .getNombrePorId(idSud);
                                                                                zonaActual = getZonaPorNombre(
                                                                                                zona);
                                                                                zonaActual.setPersonatge(bond);
                                                                                acabarjoc = false;
                                                                                zonaActual.arrayPersonatges
                                                                                                .add(bond);
                                                                                moviments++;
                                                                                SetMoviments++;
                                                                                break;
                                                                        } else if (zonaActual.isAbaix()
                                                                                        && zonaAra == "propulsors"
                                                                                        && Bond.Inventari
                                                                                                        .contains(vestitEspacial) == true) {
                                                                                int idSud = zonaActual.getSud();
                                                                                String zona = Zona
                                                                                                .getNombrePorId(idSud);
                                                                                zonaActual = getZonaPorNombre(
                                                                                                zona);
                                                                                zonaActual.setPersonatge(bond);
                                                                                acabarjoc = false;
                                                                                zonaActual.arrayPersonatges
                                                                                                .add(bond);
                                                                                break;
                                                                        }

                                                                case "3":
                                                                        if (zonaActual.isDreta()) {
                                                                                int idest = zonaActual.getEst();
                                                                                String zona = Zona
                                                                                                .getNombrePorId(idest);
                                                                                zonaActual = getZonaPorNombre(
                                                                                                zona);
                                                                                zonaActual.setPersonatge(bond);
                                                                                acabarjoc = false;
                                                                                zonaActual.arrayPersonatges
                                                                                                .add(bond);
                                                                                moviments++;
                                                                                SetMoviments++;
                                                                                break;
                                                                        } else {
                                                                                System.out.println(
                                                                                                "No pots anar cap a la dreta");
                                                                                acabarjoc = true;
                                                                                break;
                                                                        }
                                                                case "4":
                                                                        if (zonaActual.isEsquerra()) {

                                                                                int idOest = zonaActual
                                                                                                .getOest();
                                                                                String zona = Zona
                                                                                                .getNombrePorId(idOest);
                                                                                zonaActual = getZonaPorNombre(
                                                                                                zona);
                                                                                zonaActual.setPersonatge(bond);
                                                                                acabarjoc = false;
                                                                                zonaActual.arrayPersonatges
                                                                                                .add(bond);
                                                                                moviments++;
                                                                                SetMoviments++;
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
                                                } else {
                                                        System.out.println(
                                                                        "No pots sortir de la zona sense la tarja identificadora");
                                                        acabarjoc = false;
                                                        break;
                                                }

                                        } while (acabarjoc == true);
                                        break;
                                case 4:
                                        // mostrar inventari
                                        int i = 1;
                                        int a = 0;
                                        for (Objecte objecte : Bond.Inventari) {
                                                System.out.println(i + ". " + objecte.getNom());
                                                i++;
                                                a++;
                                        }
                                        if (a == 0) {
                                                System.out.println("No tens objectes al inventari");

                                        }

                                        break;
                                case 5:
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
                                        System.out.println(
                                                        "                                      |__________|");
                                        break;
                                case 6:

                                        System.out.println("Que vols preguntar?");
                                        System.out.println("1 - On esta la llanterna?");
                                        System.out.println("2 - On esta en Gonzalin?");
                                        System.out.println("3 - Em pots obrir la porta?");
                                        int opcio6 = sc.nextInt();
                                        switch (opcio6) {
                                                case 1:
                                                        int num = (int) (Math.random() * 2 + 1);

                                                        if (num == 1) {
                                                                System.out.println(
                                                                                "La llanterna esta a la zona: "
                                                                                                + ZonaAleatoria.getNom());
                                                        } else {
                                                                System.out.println(
                                                                                "La llanterna esta a la zona: "
                                                                                                + Zaleatoria1.getNom());
                                                        }

                                                        break;
                                                case 2:
                                                        if (SetMoviments < 0 || donutDonat == true) {
                                                                System.out.println(
                                                                                "En Gonzalin esta a la zona: "
                                                                                                + zonaActualGonza
                                                                                                                .getNom());
                                                                break;
                                                        } else {
                                                                System.out.println("En Gonzalin esta confós");
                                                        }
                                                case 3:
                                                        if (numrandom() > 5) {
                                                                System.out.println("No, no puc obrir la porta");
                                                                break;
                                                        }

                                                        else {
                                                                System.out.println("Si, si puc obrir la porta");
                                                                do {
                                                                        System.out.println("A quina zona vols anar?");
                                                                        System.out.println("1 - Adalt");
                                                                        System.out.println("2 - Abaix");
                                                                        System.out.println("3 - Dreta");
                                                                        System.out.println("4 - Esquerra");

                                                                        String opcio3 = sc.next();
                                                                        if (Bond.Inventari.contains(
                                                                                        tarjaIdentificadoraCompany)
                                                                                        || !Bond.Inventari.contains(
                                                                                                        tarjaIdentificadoraCompany)) {

                                                                                switch (opcio3) {
                                                                                        case "1":

                                                                                                if (zonaActual.isAdalt()) {
                                                                                                        int idNord = zonaActual
                                                                                                                        .getNord();

                                                                                                        String zona = Zona
                                                                                                                        .getNombrePorId(idNord);
                                                                                                        zonaActual = getZonaPorNombre(
                                                                                                                        zona);
                                                                                                        zonaActual.setPersonatge(
                                                                                                                        bond);
                                                                                                        acabarjoc = false;
                                                                                                        zonaActual.arrayPersonatges
                                                                                                                        .add(bond);
                                                                                                        moviments++;
                                                                                                        SetMoviments++;
                                                                                                        break;
                                                                                                } else {
                                                                                                        System.out.println(
                                                                                                                        "No pots anar cap adalt");
                                                                                                        acabarjoc = true;
                                                                                                        break;
                                                                                                }

                                                                                        case "2":
                                                                                                int nomzonaara = zonaActual
                                                                                                                .getSud();
                                                                                                String zonaAra = Zona
                                                                                                                .getNombrePorId(nomzonaara);
                                                                                                if (zonaActual.isAbaix()
                                                                                                                && zonaAra == "propulsors"
                                                                                                                && Bond.Inventari
                                                                                                                                .contains(vestitEspacial)
                                                                                                                && Bond.Inventari
                                                                                                                                .contains(
                                                                                                                                                einaTaller)) {

                                                                                                        int idSud = zonaActual
                                                                                                                        .getSud();
                                                                                                        String zona = Zona
                                                                                                                        .getNombrePorId(idSud);
                                                                                                        zonaActual = getZonaPorNombre(
                                                                                                                        zona);
                                                                                                        zonaActual.setPersonatge(
                                                                                                                        bond);
                                                                                                        acabarjoc = false;
                                                                                                        zonaActual.arrayPersonatges
                                                                                                                        .add(bond);
                                                                                                        propulsorsReparats = true;
                                                                                                        System.out.println(
                                                                                                                        "Has reparat els propulsors, ves a comandament per encendre els propulsors");

                                                                                                        break;

                                                                                                } else if (zonaActual
                                                                                                                .isAbaix()
                                                                                                                && zonaAra == "comandament"
                                                                                                                && propulsorsReparats == true) {
                                                                                                        {
                                                                                                                System.out.println(
                                                                                                                                "Has guanyat, has reparat els propulsors i has encès els propulsors, ara pots anar a Summem");
                                                                                                                acabarjoc = true;
                                                                                                                System.exit(0);
                                                                                                                break;

                                                                                                        }
                                                                                                } else if (zonaActual
                                                                                                                .isAbaix()
                                                                                                                && zonaAra == "propulsors"
                                                                                                                && Bond.Inventari
                                                                                                                                .contains(vestitEspacial) == false) {
                                                                                                        System.out.println(
                                                                                                                        "No pots anar cap abaix, no tens el vestit espacial");
                                                                                                        acabarjoc = true;
                                                                                                        break;
                                                                                                } else if (zonaActual
                                                                                                                .isAbaix()
                                                                                                                && zonaAra != "propulsors") {
                                                                                                        int idSud = zonaActual
                                                                                                                        .getSud();
                                                                                                        String zona = Zona
                                                                                                                        .getNombrePorId(idSud);
                                                                                                        zonaActual = getZonaPorNombre(
                                                                                                                        zona);
                                                                                                        zonaActual.setPersonatge(
                                                                                                                        bond);
                                                                                                        acabarjoc = false;
                                                                                                        zonaActual.arrayPersonatges
                                                                                                                        .add(bond);
                                                                                                        moviments++;
                                                                                                        SetMoviments++;
                                                                                                        break;
                                                                                                } else if (zonaActual
                                                                                                                .isAbaix()
                                                                                                                && zonaAra == "propulsors"
                                                                                                                && Bond.Inventari
                                                                                                                                .contains(vestitEspacial) == true) {
                                                                                                        int idSud = zonaActual
                                                                                                                        .getSud();
                                                                                                        String zona = Zona
                                                                                                                        .getNombrePorId(idSud);
                                                                                                        zonaActual = getZonaPorNombre(
                                                                                                                        zona);
                                                                                                        zonaActual.setPersonatge(
                                                                                                                        bond);
                                                                                                        acabarjoc = false;
                                                                                                        zonaActual.arrayPersonatges
                                                                                                                        .add(bond);
                                                                                                        break;
                                                                                                }

                                                                                        case "3":
                                                                                                if (zonaActual.isDreta()) {
                                                                                                        int idest = zonaActual
                                                                                                                        .getEst();
                                                                                                        String zona = Zona
                                                                                                                        .getNombrePorId(idest);
                                                                                                        zonaActual = getZonaPorNombre(
                                                                                                                        zona);
                                                                                                        zonaActual.setPersonatge(
                                                                                                                        bond);
                                                                                                        acabarjoc = false;
                                                                                                        zonaActual.arrayPersonatges
                                                                                                                        .add(bond);
                                                                                                        moviments++;
                                                                                                        SetMoviments++;
                                                                                                        break;
                                                                                                } else {
                                                                                                        System.out.println(
                                                                                                                        "No pots anar cap a la dreta");
                                                                                                        acabarjoc = true;
                                                                                                        break;
                                                                                                }
                                                                                        case "4":
                                                                                                if (zonaActual.isEsquerra()) {

                                                                                                        int idOest = zonaActual
                                                                                                                        .getOest();
                                                                                                        String zona = Zona
                                                                                                                        .getNombrePorId(idOest);
                                                                                                        zonaActual = getZonaPorNombre(
                                                                                                                        zona);
                                                                                                        zonaActual.setPersonatge(
                                                                                                                        bond);
                                                                                                        acabarjoc = false;
                                                                                                        zonaActual.arrayPersonatges
                                                                                                                        .add(bond);
                                                                                                        moviments++;
                                                                                                        SetMoviments++;
                                                                                                        break;
                                                                                                } else {
                                                                                                        System.out.println(
                                                                                                                        "No pots anar cap a l'esquerra");
                                                                                                        acabarjoc = true;
                                                                                                        break;
                                                                                                }
                                                                                        default: {
                                                                                                System.out.println(
                                                                                                                "Opcio incorrecta");
                                                                                                acabarjoc = true;
                                                                                                break;
                                                                                        }

                                                                                }
                                                                        } else {
                                                                                System.out.println(
                                                                                                "No pots sortir de la zona sense la tarja identificadora");
                                                                                acabarjoc = false;
                                                                                break;
                                                                        }

                                                                } while (acabarjoc == true);
                                                                break;
                                                        }

                                        }
                                        break;
                                case 7:

                                        System.out.println("Que li vols dir?");
                                        System.out.println("1 - Saludar");
                                        System.out.println("2 - Preguntar que està fent");
                                        System.out.println("3 - Preguntar on va");
                                        System.out.println("4 - Preguntar si ha vist la llanterna");
                                        int opcio7 = sc.nextInt();
                                        switch (opcio7) {
                                                case 1:
                                                        npc.parlar();
                                                        break;
                                                case 2:
                                                        System.out.println("Estic fent un treball");
                                                        break;
                                                case 3:
                                                        if (numrandom() > 5) {
                                                                System.out.println("No ho se, estic fent voltes");
                                                                ;
                                                        } else {
                                                                System.out.println("No se a on vaig, estic perdut");
                                                        }

                                                        break;
                                                case 4:
                                                        System.out.println("No, no l'he vist");
                                                        break;
                                        }

                        }
                } while (sortirjoc1 == true);
                sc.close();

        }

}
