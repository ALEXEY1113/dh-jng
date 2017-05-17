/**
 * Created by ALEXEY on 5/16/2017.
 */
public class Person {

    private String mName;
    private int mAge;

    public Person () {  }

    public Person(String mName, int mAge) {
        this.mName = mName;
        this.mAge = mAge;
    }

    @Override
    public String toString() {
        return this.mName;
    }

    /********** GETTERS AND SETTERS *********/
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
}
