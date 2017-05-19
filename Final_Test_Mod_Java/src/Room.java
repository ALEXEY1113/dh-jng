import java.util.ArrayList;

/**
 * Created by ALEXEY on 5/18/2017.
 */
public class Room implements UtilsOperations.IPerson {
    // Fields
    private String mCod;
    private int mCurrentNumberPersons;
    private static final int MAX_PERSONS_IN_ROOM = 7;
    // Type of Room
    private String mType;
    //private enum mType { OFFICE, DEPARTMENT }

    private ArrayList<Person> mListPersonsOnRoom;

    /****
     *      CONSTRUCTORS
     ***/
    public Room () {  }

    public Room(String mCod, String mType) {
        this.mCod = mCod;
        this.mType = mType;

        this.mListPersonsOnRoom = new ArrayList<>();
    }

    /****
     *      METHODS
     ***/
    @Override
    public void addPerson(Person person) {
        try {
            if (mCurrentNumberPersons < MAX_PERSONS_IN_ROOM) {
                mListPersonsOnRoom.add(person);
                mCurrentNumberPersons++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No hay espacio en la Habitacion para más personas...");
        }
    }

    /****
     *      GETTERS AND SETTERS
     ***/
    public String getmCod() {
        return mCod;
    }

    public void setmCod(String mCod) {
        this.mCod = mCod;
    }

    public int getmCurrentNumberPersons() {
        return mCurrentNumberPersons;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public ArrayList<Person> getmListPersonsOnRoom() {
        return mListPersonsOnRoom;
    }

    public void setmListPersonsOnRoom(ArrayList<Person> mListPersonsOnRoom) {
        this.mListPersonsOnRoom = mListPersonsOnRoom;
    }
}
