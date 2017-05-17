import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ALEXEY on 5/16/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Bob A.", 35);
        Person p2 = new Person("Sally M.", 40);
        Person p3 = new Person("Samantha S.", 30);
        Person p4 = new Person("Alex R.", 22);
        Person p5 = new Person("Willy M.", 16);
        Person p6 = new Person("Jason D.", 40);
        Person p7 = new Person("Edwin B.", 20);
        Person p8 = new Person("Tesla C.", 35);
        Person p9 = new Person("Newton Ch..", 30);
        Person p10 = new Person("Lady J.", 22);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

        /*people = new ArrayList<>(
                people.stream()
                        .filter(
                            (person -> person.getmAge() <= 25)      // Filter the ArrayList with condition for age <= 25
                        )
                        .collect(Collectors.toList())               // Return a new ArrayList filtered
        );*/

        System.out.println("/******************* USING SIMPLE FOREACH *******************/");
        /*for (Person p : people) {
            System.out.println(p.getmName() + " Age: " + p.getmAge());
        }*/

        System.out.println("/******************* USING LAMBDA EXP *******************/");
        /*people.stream()
                .forEach(
                        (person -> System.out.println(person.getmName() + " Age: " + person.getmAge()))
                );*/

        System.out.println("/******************* GROUPING PEOPLE *******************/");
        ArrayList<Person> peopleGroup = people;
        Map<Integer, List<Person>> groupedMapResult = peopleGroup
                .stream()
                .collect(Collectors.groupingBy((p)->p.getmAge()));

        System.out.println(groupedMapResult.toString());
    }
}
