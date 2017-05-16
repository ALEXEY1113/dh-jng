/**
 * Created by ALEXEY on 5/15/2017.
 */
public class Person {

    private String mName;
    private int mAge;
    private Address mAddress;

    public Person () {  }

    public Person (String mName, int mAge, Address mAddress) {
        this.mName = mName;
        this.mAge = mAge;
        this.mAddress = mAddress;
    }

    /****************** GETTERS AND SETTERS *******************/
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public Address getmAddress() {
        return mAddress;
    }

    public void setmAddress(Address mAddress) {
        this.mAddress = mAddress;
    }

    /***
     *  INNER CLASS
    ***/
    public static class Address {

        private String mCity;
        private String mState;
        private String Street;

        public Address () {  }

        public Address(String mCity, String mState, String street) {
            this.mCity = mCity;
            this.mState = mState;
            Street = street;
        }

        /****************** GETTERS AND SETTERS *******************/
        public String getmCity() {
            return mCity;
        }

        public void setmCity(String mCity) {
            this.mCity = mCity;
        }

        public String getmState() {
            return mState;
        }

        public void setmState(String mState) {
            this.mState = mState;
        }

        public String getStreet() {
            return Street;
        }

        public void setStreet(String street) {
            Street = street;
        }
    }
}
