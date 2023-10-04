import java.util.Scanner;

public class Joc {
        static boolean sortir = true;

        public static void main(String[] args) throws Exception {
                Jugar();

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
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println(
                                                        "                            |-------------------------------|");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |            Tallers            |");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "|---------------------------|-----------          ----------|----------------------------|");
                                        System.out.println(
                                                        "|                           |                               |                            |");
                                        System.out.println(
                                                        "|                           |                               |                            |");
                                        System.out.println(
                                                        "|                           |                               |                            |");
                                        System.out.println(
                                                        "|                                        Oficines                                        |");
                                        System.out.println(
                                                        "|                                                                                        |");
                                        System.out.println(
                                                        "|          Vestuari                                                      Banys           |");
                                        System.out.println(
                                                        "|                                                                                        |");
                                        System.out.println(
                                                        "|                           |                               |                            |");
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
                                                        "|                           |                               |                            |");
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
                                                        "|                           |                               |                            |");
                                        System.out.println(
                                                        "|                           |                               |                            |");
                                        System.out.println(
                                                        "|---------------------------|-----------         -----------|----------------------------|");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |      Sala sortida exterior    |");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |                               |");
                                        System.out.println(
                                                        "                            |-------------------------------|");
                                        System.out.println("                                       __________");
                                        System.out.println(
                                                        "                                      |__________|   Propulsors");
                                        System.out.println("                                      |__________|");

                                        break;
                                case 2:
                                        System.out.println(
                                                        "Estas al dormitori");
                                        sortir = false;
                                        break;
                                case 3:
                                        System.out.println("Adeu");
                                        System.exit(0);
                                        break;
                        }
                } while (sortir == true);
                Bond.zonaActual.dormitori();

                sc.close();
        }

}
