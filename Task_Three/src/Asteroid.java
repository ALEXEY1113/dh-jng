/**
 * Created by ALEXEY on 5/16/2017.
 */
public class Asteroid {

    private String mId;
    private double mMass;

    public Asteroid () {  }

    public Asteroid(String mId, double mMass) {
        this.mId = mId;
        this.mMass = mMass;
    }

    @Override
    public String toString() {
        return "Mass: " + mMass;
    }

    /************* GETTERS AND SETTERS ***************/
    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public double getmMass() {
        return mMass;
    }

    public void setmMass(double mMass) {
        this.mMass = mMass;
    }
}
