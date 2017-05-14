package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ALEXEY on 5/9/2017.
 */
public class Student extends Person{

    private final int MAX_ASSIGNMENTS = 10;
    private int mCurrentNumberAssignments;

    private double mAverageStudent;
    private Assignment mCurrentAssignment;
    private ArrayList<Assignment> mAssignments;

    public Student() {
    }

    public Student(String mCciStudent, String mNameStudent, String mCodStudent, String mBirthDayStudent, double mAverageStudent) {
        super(mCciStudent, mNameStudent, mCodStudent, mBirthDayStudent);
        this.mAverageStudent = mAverageStudent;
        this.mCurrentNumberAssignments = 0;
        this.mAssignments = new ArrayList<>(MAX_ASSIGNMENTS);
    }

    public void setCurrentAssignment(Assignment assignment) {
        this.mCurrentAssignment = assignment;
    }

    public void setCurrentAssignment(String assignmentName){
        this.mCurrentAssignment = new Assignment(assignmentName, "Default Class", new Date());
    }

    public ArrayList<Assignment> getmAssignments() {
        return mAssignments;
    }

    public void setmAssignments(ArrayList<Assignment> mAssignments) {
        this.mAssignments = mAssignments;
    }

    public double getmAverageStudent() {
        return mAverageStudent;
    }

    public void setmAverageStudent(double mAverageStudent) {
        this.mAverageStudent = mAverageStudent;
    }

    public Assignment getmCurrentAssignment() {
        return mCurrentAssignment;
    }

    public void setmCurrentAssignment(Assignment mCurrentAssignment) {
        this.mCurrentAssignment = mCurrentAssignment;
    }

    public int getmCurrentNumberAssignments() {
        return mCurrentNumberAssignments;
    }

    public void addAssignment(Assignment assignment) {
        if (mAssignments.size() <= MAX_ASSIGNMENTS) {
            mAssignments.add(assignment);
            mCurrentNumberAssignments ++;
        }
    }

    public void addListAssignment(ArrayList<Assignment> assignmentArrayList) {
        if (assignmentArrayList.size() <= MAX_ASSIGNMENTS) {
            mAssignments = assignmentArrayList;
            mCurrentNumberAssignments = assignmentArrayList.size();
        }
    }

    // Varargs Uses
    public void addAssignments(Assignment... assignments) {
        for (Assignment assignment : assignments) {
            mAssignments.add(assignment);
            mCurrentNumberAssignments ++;
        }
    }

    @Override
    public String toString() {
        return "My Name is: " + getmName() + " and I am a model.Student...!!!";
    }

    @Override
    public void showInfo() {
//        super.showInfo();
//        System.out.println("Average: " + mAverageStudent);
        System.out.println("*********** ASSIGNMENT ************");
        System.out.println("Assignments: " + mCurrentNumberAssignments);
        System.out.println("Current model.Assignment: " + mCurrentAssignment.getmName());
        for (Assignment a : mAssignments) {
            System.out.println("model.Assignment: " + a.getmName());
        }
    }

    @Override
    public void doSomething(Person person) {
    }
}
