import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ALEXEY on 5/16/2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("/********** HASH MAPS *********/");
        Holder<Integer, String> holder1 = new Holder<>(100, "Bob");
        Holder<Integer, String> holder2 = new Holder<>(200, "Willy");
        Holder<Integer, String> holder3 = new Holder<>(300, "Emily");
        Holder<Integer, String> holder4 = new Holder<>(400, "Samantha");

        ArrayList<Holder<Integer, String>> list = new ArrayList<>();
        list.add(holder1);
        list.add(holder2);
        list.add(holder3);
        list.add(holder4);

        /*int desiredId = 100;
        for (Holder h : list) {
            //System.out.println(h.value);
            if (h.key.equals(desiredId)) {
                System.out.println("Name: " + h.value);
            }
        }*/

        HashMap<Integer, String> schoolRecords = new HashMap<>();
        schoolRecords.put(100, "Bob Marley");
        schoolRecords.put(200, "Sabrina S.");
        schoolRecords.put(300, "Marcelo M.");
        schoolRecords.put(400, null);
        schoolRecords.put(500, "J. K. Rowling");

        System.out.println("/********** SIMPLE IF CONDITION *********/");
        if (schoolRecords.get(200) == null) {
            System.out.println("There is no student for this Key...");
        } else {
            System.out.println(schoolRecords.get(200));
        }

        System.out.println("/********** USING TERNARY CONDITION *********/");
        System.out.println(
                (schoolRecords.get(400) == null) ? "There is no student for this Key..." : schoolRecords.get(400)
        );
    }

    static class Holder<K, V> {
        private K key;
        private V value;

        public Holder(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
