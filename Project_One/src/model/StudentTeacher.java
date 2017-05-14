package model;

/**
 * Created by ALEXEY on 5/10/2017.
 */
public class StudentTeacher extends Teacher {

    private String mSchoolName;

    public StudentTeacher() {  }

    public StudentTeacher(String mCiStudentTeacher, String mNameStudentTeacher,
                          String mCodStudentTeacher, String mBirthDayStudentTeacher,
                          String mSpecialityStudentTeacher, double mBaseSalaryStudentTeacher,
                          int mNumYearsAtSchool, String mSchoolName) {

        super(mCiStudentTeacher, mNameStudentTeacher, mCodStudentTeacher, mBirthDayStudentTeacher, mSpecialityStudentTeacher, mBaseSalaryStudentTeacher, mNumYearsAtSchool);
        this.mSchoolName = mSchoolName;
    }

    @Override
    public double getSalary() {
        return super.getmBaseSalaryTeacher() + 50;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("School Name: " + mSchoolName);
    }
}
