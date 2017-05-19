import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ALEXEY on 5/18/2017.
 */
public class Main {

    public static Person a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t,u, v, w, x, y, z;
    public static Room r01, r02, r03, r04, r05, r06, r07, r08, r09, r10, r11, r12;
    public static Building bPublic1, bPublic2, bPublic3, bPublic4, bPrivate1, bPrivate2, bPrivate3;

    public static Builder builder1, builder2, builder3, builder4;

    public static ArrayList<Person> listPersons;
    public static ArrayList<Room> listRooms;
    public static ArrayList<Building> listBuildings;

    public static void main(String[] args) {

        // Setup Values for Test
        init();

        // A) En ambos edificios se puede incrementar la cantidad de personas que habitan en ellos. (+el número de personas).
        incrementPersons();

        // B) Buscar en que numero de oficina o habitación se encuentra una Persona ‘x’."
        System.out.println("\n=================================================================================");
        System.out.println("B.1) Buscar en que numero de oficina o habitación se encuentra una Persona ‘x’.");
        System.out.println("Buscamos a la Persona: " + g.getmName());
        searchPerson(g);    // Search with a Person Object
        System.out.println("\nB.2) Buscar en que numero de oficina o habitación se encuentra una Persona ‘x’.");
        System.out.println("Buscamos a la Persona: A");
        searchPerson("A");  // Search with a String Name

        // C) Mostrar datos de los edificios que tienen edad > 4 años.
        System.out.println("\n=================================================================================");
        System.out.println("C) Mostrar datos de los edificios que tienen edad > 4 años.");
        searchBuildingFourYears();

        // D) Guardar en un archivo de texto detalles de las constructoras que realizaron edificios industriales.
        System.out.println("\n=================================================================================");
        System.out.println("D) Guardar en un archivo de texto detalles de las constructoras que realizaron edificios industriales.");
        makeTextFileBuilders();
    }

    private static void makeTextFileBuilders() {

        File file = new File("./builders.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);

            for (Building building : listBuildings) {

                if (building instanceof BuildingPublic) {

                    if (((BuildingPublic) building).getmActivityJob().equals("INDUSTRIAL")) {
                        out.write(building.getmCod().getBytes());
                        out.write("\n\tBuilder: ".getBytes());
                        out.write(building.getmBuilder().toString().getBytes());
                    }
                }
            }

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found Exception...");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("IO Exception...");
        }

        System.out.println("File Generated...");
    }

    private static void searchBuildingFourYears() {
        listBuildings.forEach(building -> {
            if (building.getmBuildingAge() > 4) {
                System.out.println("Building: " + building.getmCod() + "\n\tAge: " + building.getmBuildingAge());
                System.out.println("\tType: " + building.getmType() + "\n\tCost: " + building.getmCostBuild());
                System.out.println("\tNumHabitants: " + building.countPersons() + "\n\tNumCurrentRooms: " + building.getmListOfRoomsInTheBuilding().size());
                System.out.println("\tBuilder: " + building.getmBuilder().toString());
            }
        });
    }

    private static void searchPerson(String namePerson) {
        Person person = new Person();
        person.setmName(namePerson);

        searchPerson(person);
    }

    private static void searchPerson(Person person) {
        for (Building building : listBuildings) {
            building.getmListOfRoomsInTheBuilding().forEach(room -> {
                room.getmListPersonsOnRoom().forEach(p -> {
                    if (p.getmName().toLowerCase().equals(person.getmName().toLowerCase())) {
                        System.out.println("La persona esta en la: " + room.getmType() + " - " + room.getmCod());
                    }
                });
            });
        }
    }

    private static void incrementPersons() {
        System.out.println("\n=================================================================================");
        System.out.println("A) En ambos edificios se puede incrementar la cantidad de personas que habitan en ellos. (+el número de personas).");

        /** PUBLIC **/
        System.out.println("PUBLIC - BEFORE - BUILDING: " + bPublic1.getmCod());
        System.out.println("Rooms: " + bPublic1.getmListOfRoomsInTheBuilding().size());
        System.out.println("Person: " + bPublic1.getmListPeopleInTheBuilding().size());
        // Rooms r01-r03 add Persons
        r01.addPerson(a); r01.addPerson(b); r02.addPerson(c); r02.addPerson(d);
        r03.addPerson(z); r02.addPerson(g); r02.addPerson(p); r02.addPerson(h);
        // Add Rooms to Building
        bPublic1.addRoom(r01);
        bPublic1.addRoom(r02);
        bPublic1.addRoom(r03);
        System.out.println("PUBLIC - AFTER - BUILDING: " + bPublic1.getmCod());
        System.out.println("Rooms: " + bPublic1.getmListOfRoomsInTheBuilding().size());
        System.out.println("Person: " + bPublic1.getmListPeopleInTheBuilding().size());

        /** PRIVATE **/
        System.out.println("\nPRIVATE - BEFORE - BUILDING: " + bPrivate1.getmCod());
        System.out.println("Rooms: " + bPrivate1.getmListOfRoomsInTheBuilding().size());
        System.out.println("Person: " + bPrivate1.getmListPeopleInTheBuilding().size());
        // Rooms r04-r08 add Persons
        r04.addPerson(t); r04.addPerson(l); r04.addPerson(c); r04.addPerson(t);
        r06.addPerson(e); r05.addPerson(i); r05.addPerson(y); r05.addPerson(k);
        r07.addPerson(q); r06.addPerson(c); r06.addPerson(r); r05.addPerson(u);
        r07.addPerson(w); r08.addPerson(s); r07.addPerson(o); r04.addPerson(p);
        // Add Rooms to Building
        bPrivate1.addRoom(r04);
        bPrivate1.addRoom(r05);
        bPrivate1.addRoom(r06);
        bPrivate1.addRoom(r07);
        bPrivate1.addRoom(r08);
        System.out.println("PRIVATE - AFTER - BUILDING: " + bPrivate1.getmCod());
        System.out.println("Rooms: " + bPrivate1.getmListOfRoomsInTheBuilding().size());
        System.out.println("Person: " + bPrivate1.getmListPeopleInTheBuilding().size());


        System.out.println("\n=============== Add 2 Person to each Building ===============");
        // Add Persons PUBLIC
        System.out.println("PUBLIC");
        Room R1 = bPublic1.getmListOfRoomsInTheBuilding().get(0);
        Room R2 = bPublic1.getmListOfRoomsInTheBuilding().get(1);
        R1.addPerson(g);
        R2.addPerson(z);
        System.out.println("Rooms: " + bPublic1.getmListOfRoomsInTheBuilding().size());
        System.out.println("Person: " + bPublic1.countPersons());

        // Add Persons PRIVATE
        System.out.println("\nPRIVATE");
        Room P1 = bPrivate1.getmListOfRoomsInTheBuilding().get(0);
        Room P2 = bPrivate1.getmListOfRoomsInTheBuilding().get(1);
        P1.addPerson(a);
        P2.addPerson(p);
        System.out.println("Rooms: " + bPrivate1.getmListOfRoomsInTheBuilding().size());
        System.out.println("Person: " + bPrivate1.countPersons());
    }

    public static void init() {

        // Rooms
        r01 = new Room("R01", "Office"); r02 = new Room("R02", "Department"); r03 = new Room("R03", "Office");
        r04 = new Room("R04", "Department"); r05 = new Room("R05", "Department"); r06 = new Room("R06", "Department");
        r07 = new Room("R07", "Office"); r08 = new Room("R08", "Office"); r09 = new Room("R09", "Office");
        r10 = new Room("R10", "Department"); r11 = new Room("R11", "Office"); r12 = new Room("R12", "Office");
        listRooms = new ArrayList<>();
        listRooms.add(r01); listRooms.add(r02); listRooms.add(r03); listRooms.add(r04);
        listRooms.add(r05); listRooms.add(r06); listRooms.add(r07); listRooms.add(r08);
        listRooms.add(r09); listRooms.add(r10); listRooms.add(r11); listRooms.add(r12);

        // Persons
        a = new Person("Worker", "A"); b = new Person("Occupant", "B"); c = new Person("Occupant", "C"); d = new Person("Occupant", "D");
        e = new Person("Worker", "E"); f = new Person("Occupant", "F"); g = new Person("Worker", "G"); h = new Person("Occupant", "H");
        i = new Person("Occupant", "I"); j = new Person("Worker", "J"); k = new Person("Occupant", "K"); l = new Person("Occupant", "L");
        m = new Person("Occupant", "M"); n = new Person("Occupant", "N"); o = new Person("Worker", "O"); p = new Person("Worker", "P");
        q = new Person("Occupant", "Q"); r = new Person("Occupant", "R"); s = new Person("Worker", "S"); t = new Person("Occupant", "T");
        u = new Person("Worker", "U"); v = new Person("Occupant", "V"); w = new Person("Occupant", "W"); x = new Person("Worker", "X");
        y = new Person("Occupant", "Y"); z = new Person("Worker", "Z");
        listPersons = new ArrayList<>();
        listPersons.add(a); listPersons.add(b); listPersons.add(c); listPersons.add(d); listPersons.add(e);
        listPersons.add(f); listPersons.add(g); listPersons.add(h); listPersons.add(i); listPersons.add(j);
        listPersons.add(o); listPersons.add(n); listPersons.add(m); listPersons.add(l); listPersons.add(k);
        listPersons.add(p); listPersons.add(q); listPersons.add(r); listPersons.add(s); listPersons.add(t);
        listPersons.add(y); listPersons.add(x); listPersons.add(w); listPersons.add(v); listPersons.add(u);
        listPersons.add(z);

        // Builders
        builder1 = new Builder("Cabezas Inc.", "23654123", "Av. Santa Cruz #562");
        builder2 = new Builder("RoadMap Inc.", "89654874", "Av. Pando #154");
        builder3 = new Builder("Forks Inc.", "56248974", "Av. Portales #856");
        builder4 = new Builder("Casas & Family Inc.", "25415986", "Av. Ayacucho #321");

        // Buildings Publics
        bPublic1 = new BuildingPublic("BUILDING-PUB-01", "PUBLIC", 8, 0, 36210, builder2, "DH", "TECHNOLOGY");
        bPublic2 = new BuildingPublic("BUILDING-PUB-02", "PUBLIC", 4, 0, 40550, builder4, "EMI", "INDUSTRIAL");
        bPublic3 = new BuildingPublic("BUILDING-PUB-03", "PUBLIC", 2, 0, 30000, builder3, "eBay", "BUSINESS");
        bPublic4 = new BuildingPublic("BUILDING-PUB-04", "PUBLIC", 16, 0, 322000, builder3, "Coca-Cola", "INDUSTRIAL");
        // Buildings Privates
        bPrivate1 = new Building.BuildingPrivate("BUILDING-PRV-01", "PRIVATE", 7, 0, 57000, builder1, 16);
        bPrivate2 = new Building.BuildingPrivate("BUILDING-PRV-02", "PRIVATE", 9, 0, 87000, builder3, 20);
        bPrivate3 = new Building.BuildingPrivate("BUILDING-PRV-03", "PRIVATE", 4, 0, 157000, builder4, 30);
        listBuildings = new ArrayList<>();
        listBuildings.add(bPublic1); listBuildings.add(bPrivate1);
        listBuildings.add(bPublic2); listBuildings.add(bPrivate2);
        listBuildings.add(bPublic3); listBuildings.add(bPrivate3);
        listBuildings.add(bPublic4);

    }
}
