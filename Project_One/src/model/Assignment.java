package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ALEXEY on 5/9/2017.
 */
public class Assignment {

    private String mName;
    private String mClassName;
    private Date mDueDate;
    public static final int ASSIGNMENT_DEFAULT_SCORE = 20;

    public Assignment() {}

    public Assignment(String mName, String mClassName, Date mDueDate) {
        this.mName = mName;
        this.mClassName = mClassName;
        this.mDueDate = mDueDate;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmClassName() {
        return mClassName;
    }

    public void setmClassName(String mClassName) {
        this.mClassName = mClassName;
    }

    public Date getmDueDate() {
        return mDueDate;
    }

    public void setmDueDate(Date mDueDate) {
        this.mDueDate = mDueDate;
    }

    public static Assignment getFarthestInPastAssignment(ArrayList<Assignment> assignments) {

        long date = Long.MAX_VALUE;
        Assignment farthestAssignment = null;

        for (Assignment assignment : assignments) {
            if (assignment.getmDueDate().getTime() < date) {
                date = assignment.getmDueDate().getTime();
                farthestAssignment = assignment;
            }
        }

        return farthestAssignment;
    }
}
