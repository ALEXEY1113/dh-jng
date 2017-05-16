import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ALEXEY on 5/15/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Bob Marley", 55, new Person.Address("New York", "Detroit", "298 Orange"));
        Person person2 = new Person("Sam Sanders", 45, new Person.Address("New Jersey", "New Jersey", "238 Orange"));
        Person person3 = new Person("Robert Jr.", 40, new Person.Address("Orlando", "Disney", "238 O.F."));
        Person person4 = new Person("Mario Bros", 75, new Person.Address("Washington", "Washington", "198 WSC"));

        ArrayList<Person> listPerson = new ArrayList(Arrays.asList(
                new Person[] {
                        person1, person2, person3, person4
                }
        ));

        for (Person p : listPerson) {
            System.out.println("Name: " + p.getmName());
        }

        System.out.println("************ USING LAMBDA EXP ***********");
        listPerson.forEach(
                //( Params )   -> { BODY }
                (loopItem) -> System.out.println(loopItem.getmName())
        );
    }
}
