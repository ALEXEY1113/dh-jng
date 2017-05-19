/**
 * Created by ALEXEY on 5/18/2017.
 */
public class BuildingPublic extends Building{
    // Fields
    private String mNameEntityOwner;
    // Type Activity
    private String mActivityJob;
    //public enum mActivityJob { COMERCIAL, INDUSTRIAL, MILITAR, ONG, TECHNOLOGY };

    /****
     *      CONSTRUCTORS
     ***/
    public BuildingPublic () {  }

    public BuildingPublic(String mCode, String mType, int mBuildingAge, int mCurrentPeople, double mCostBuild, Builder mBuilder,
                          String mNameEntityOwner, String mActivityJob) {

        super(mCode, mType, mBuildingAge, mCurrentPeople, mCostBuild, mBuilder);
        this.mNameEntityOwner = mNameEntityOwner;
        this.mActivityJob = mActivityJob;
    }

    /****
     *      METHODS
     ***/
    @Override
    public void addRoom(Room room) {
        super.addRoom(room);
    }

    /****
     *      GETTERS AND SETTERS
     ***/
    public String getmNameEntityOwner() {
        return mNameEntityOwner;
    }

    public void setmNameEntityOwner(String mNameEntityOwner) {
        this.mNameEntityOwner = mNameEntityOwner;
    }

    public String getmActivityJob() {
        return mActivityJob;
    }

    public void setmActivityJob(String mActivityJob) {
        this.mActivityJob = mActivityJob;
    }
}
