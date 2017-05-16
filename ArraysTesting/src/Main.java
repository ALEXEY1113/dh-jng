import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * Created by ALEXEY on 5/15/2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("/********** ARRAYS *********/");
        String[] names = { "Bob", "Mike", "Sam" };

        /*for(String n : names) {
            System.out.println("Name: " + n);
        }*/

        ArrayList<Object> nameList = new ArrayList<>();
        for(String n : names) {
            nameList.add(n);
        }

        nameList.add(22);
        nameList.add(new Person("Saul"));

        /*for (Object o : nameList) {
            if (o instanceof Person)
                System.out.println("Object Person: " + o.toString());
            else
                System.out.println("Object: " + o);
        }*/

        System.out.println("/********** GENERIC CLASS *********/");
        OracleArrayList<Person> list = new OracleArrayList<>();
        for (int i = 0; i < nameList.size(); i++) {
            list.add(new Person(nameList.get(i).toString()));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Person: " + list.get(i));
        }

        System.out.println("/********** USING COLLECTORS *********/");
//        Collections.sort(nameList);
//        for (Object item : nameList) {
//            System.out.println(item.toString());
//        }
    }
}
