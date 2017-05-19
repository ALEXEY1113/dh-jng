/**
 * Created by ALEXEY on 5/18/2017.
 */
public class Builder {
    // Fields
    private String mName;
    private String mPhone;
    private String mAddress;

    /****
     *      CONSTRUCTORS
     ***/
    public Builder () {  }

    public Builder(String mName, String mPhone, String mAddress) {
        this.mName = mName;
        this.mPhone = mPhone;
        this.mAddress = mAddress;
    }

    /****
     *      METHODS
     ***/
    @Override
    public String toString() {
        return "\n\t\tName: " + mName + "\n\t\tPhone: " + mPhone + "\n\t\ttAddress: " + mAddress + "\n";
    }

    /****
     *      GETTERS AND SETTERS
     ***/
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
}
