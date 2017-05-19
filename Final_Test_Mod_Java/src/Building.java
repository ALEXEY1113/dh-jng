import java.util.ArrayList;

/**
 * Created by ALEXEY on 5/18/2017.
 */
public abstract class Building implements UtilsOperations.IRoom{
    private String mCod;
    // Type Building
    private String mType;
    //private enum mType { PUBLIC, PRIVATE }
    // Fields
    private int mBuildingAge;
    private int mCurrentNumberPersons;
    private double mCostBuild;
    // Office Or Department
    private ArrayList<Room> mListOfRoomsInTheBuilding;
    // Builder
    private Builder mBuilder;
    // Max Number Habitants
    public static final int MAX_HABITANTS = 80;
    // Persons
    private ArrayList<Person> mListPeopleInTheBuilding;

    /****
     *      CONSTRUCTORS
     ***/
    public Building () {  }

    public Building(String mCod, String mType, int mBuildingAge, int mCurrentPeople, double mCostBuild, Builder mBuilder) {
        this.mCod = mCod;
        this.mType = mType;
        this.mBuildingAge = mBuildingAge;
        this.mCurrentNumberPersons = mCurrentPeople;
        this.mCostBuild = mCostBuild;
        this.mBuilder = mBuilder;

        // Initialize ArrayLists
        mListPeopleInTheBuilding = new ArrayList<>();
        mListOfRoomsInTheBuilding = new ArrayList<>();
    }

    /****
     *      METHODS
     ***/
    @Override
    public void addRoom(Room room) {
        mListOfRoomsInTheBuilding.add(room);

        for (Person person : room.getmListPersonsOnRoom()) {
            mListPeopleInTheBuilding.add(person);
        }
    }

    @Override
    public int countPersons() {
        int total = 0;

        for (Room room : mListOfRoomsInTheBuilding) {
            total = total + room.getmCurrentNumberPersons();
        }

        return total;
    }

    public void setRoom(Room room) {
        for (int i =0; i < mListOfRoomsInTheBuilding.size(); i++) {
            if (mListOfRoomsInTheBuilding.get(i).getmCod() == room.getmCod()) {
                mListOfRoomsInTheBuilding.set(i, room);
            }
        }
    }

    /****
     *      GETTERS AND SETTERS
     ***/
    public String getmCod() {
        return mCod;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public int getmBuildingAge() {
        return this.mBuildingAge;
    }

    public void setmBuildingAge(int mBuildingAge) {
        this.mBuildingAge = mBuildingAge;
    }

    public int getmCurrentNumberPersons() {
        return mCurrentNumberPersons;
    }

    public void setmCurrentNumberPersons(int mCurrentNumberPersons) {
        this.mCurrentNumberPersons = mCurrentNumberPersons;
    }

    public double getmCostBuild() {
        return mCostBuild;
    }

    public void setmCostBuild(int mCostBuild) {
        this.mCostBuild = mCostBuild;
    }

    public ArrayList<Room> getmListOfRoomsInTheBuilding() {
        return mListOfRoomsInTheBuilding;
    }

    public void setmListOfRoomsInTheBuilding(ArrayList<Room> mListOfRoomsInTheBuilding) {
        this.mListOfRoomsInTheBuilding = mListOfRoomsInTheBuilding;
    }

    public Builder getmBuilder() {
        return mBuilder;
    }

    public void setmBuilder(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public static int getMaxHabitants() {
        return MAX_HABITANTS;
    }

    public ArrayList<Person> getmListPeopleInTheBuilding() {
        return mListPeopleInTheBuilding;
    }

    public void setmListPeopleInTheBuilding(ArrayList<Person> mListPeopleInTheBuilding) {
        this.mListPeopleInTheBuilding = mListPeopleInTheBuilding;
    }

    private void addPersonInBuilding(Person person) {
        this.mListPeopleInTheBuilding.add(person);
    }

    /***********************
     *      INNER CLASS    *
     ***********************/
    public static class BuildingPrivate extends Building {
        // Fields
        private int mCountRoomNumber;

        /****
         *      CONSTRUCTORS
         ***/
        public BuildingPrivate() {  }

        public BuildingPrivate(String mCode, String mType, int mBuildingAge, int mCurrentPeople,
                               double mCostBuild, Builder mBuilder,
                               int mCountRoomNumber) {

            super(mCode, mType, mBuildingAge, mCurrentPeople, mCostBuild, mBuilder);
            this.mCountRoomNumber = mCountRoomNumber;
        }

        /****
         *      METHODS
         ***/
        @Override
        public void addRoom(Room room) {
            super.addRoom(room);
            mCountRoomNumber++;
        }

        /****
         *      GETTERS AND SETTERS
         ***/
        public int getmCountRoomNumber() {
            return mCountRoomNumber;
        }

        public void setmCountRoomNumber(int mCountRoomNumber) {
            this.mCountRoomNumber = mCountRoomNumber;
        }
    }
}
