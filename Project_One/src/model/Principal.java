package model;

import java.util.Date;

/**
 * Created by ALEXEY on 5/10/2017.
 */
public class Principal extends Person {

    private Date mJoinDate;

    public Principal() {  }

    public Principal(String mCiPerson, String mNamePerson, String mCodPerson, String mBirthDayPerson, Date mJoinDate) {
        super(mCiPerson, mNamePerson, mCodPerson, mBirthDayPerson);
        this.mJoinDate = mJoinDate;
    }

    public Date getmJoinDate() {
        return mJoinDate;
    }

    public void setmJoinDate(Date mJoinDate) {
        this.mJoinDate = mJoinDate;
    }

    @Override
    public void showInfo() {
        //super.showInfo();
        System.out.println("Join Date: " + mJoinDate);
    }
}
