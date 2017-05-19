/**
 * Created by ALEXEY on 5/18/2017.
 */
public interface UtilsOperations {

    interface IPerson {
        void addPerson(Person person);
    }

    interface IRoom {
        void addRoom(Room room);

        int countPersons();
    }
}
