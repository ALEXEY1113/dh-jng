/**
 * Created by ALEXEY on 5/18/2017.
 */
public class Person {
    // Type
    private String mType;
    public enum mType { WORKER, OCCUPANT }
    // Fields
    private String mName;

    /****
     *      CONSTRUCTORS
     ***/
    public Person () {  }

    public Person(String mType, String mName) {
        this.mType = mType;
        this.mName = mName;
    }

    /****
     *      GETTERS AND SETTERS
     ***/
    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
