package model;

/**
 * Created by ALEXEY on 5/9/2017.
 */
public abstract class Person {

    private String mCi;
    private String mName;
    private String mCod;
    private String mBirthDay;

    public Person() {}

    public Person(String mCiPerson, String mNamePerson, String mCodPerson, String mBirthDayPerson) {
        this.mCi = mCiPerson;
        this.mName = mNamePerson;
        this.mCod = mCodPerson;
        this.mBirthDay = mBirthDayPerson;
    }

    public String getmCi() {
        return mCi;
    }

    public void setmCi(String mCi) {
        this.mCi = mCi;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCod() {
        return mCod;
    }

    public void setmCod(String mCod) {
        this.mCod = mCod;
    }

    public String getmBirthDay() {
        return mBirthDay;
    }

    public void setmBirthDay(String mBirthDay) {
        this.mBirthDay = mBirthDay;
    }

    /***************** Uses Abstract Class ****************/
    public abstract void showInfo();/*{
        System.out.println("CI: " + getmCi());
        System.out.println("Name: " + getmName());
        System.out.println("COD: " + getmCod());
        System.out.println("Birthday: " + getmBirthDay());
    }*/

    public void doSomething(Person person) {
        System.out.println("I am a " + person.getmName());
    }
}
