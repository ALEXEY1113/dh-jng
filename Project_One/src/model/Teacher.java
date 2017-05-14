package model;

/**
 * Created by ALEXEY on 5/9/2017.
 */
public class Teacher extends Person {

    /*** Uses Nested Class ***/
    //private String mSpecialityTeacher;
    private Speciality mSpecialityTeacher;
    private double mBaseSalaryTeacher;
    private int mNumYearsAtSchool;

    public Teacher() {}

    public Teacher(String mCiTeacher, String mNameTeacher,
                   String mCodTeacher, String mBirthDayTeacher,
                   String mSpecialityTeacher, double mBaseSalaryTeacher,
                   int mNumYearsAtSchool) {

        super(mCiTeacher, mNameTeacher, mCodTeacher, mBirthDayTeacher);
        //this.mSpecialityTeacher = mSpecialityTeacher;
        this.mSpecialityTeacher = new Speciality(mSpecialityTeacher);
        this.mBaseSalaryTeacher = mBaseSalaryTeacher;
        this.mNumYearsAtSchool = mNumYearsAtSchool;
    }

    /*public String getmSpecialityTeacher() {
        return mSpecialityTeacher;
    }*/
    public Speciality getmSpecialityTeacher() {
        return this.mSpecialityTeacher;
    }

    /*public void setmSpecialityTeacher(String mSpecialityTeacher) {
        this.mSpecialityTeacher = mSpecialityTeacher;
    }*/

    public void setmSpeciality(Speciality mSpecialityTeacher) {
        this.mSpecialityTeacher = mSpecialityTeacher;
    }

    public double getmBaseSalaryTeacher() {
        return mBaseSalaryTeacher;
    }

    public void setmBaseSalaryTeacher(double mBaseSalaryTeacher) {
        this.mBaseSalaryTeacher = mBaseSalaryTeacher;
    }

    public double getSalary() {
        return mBaseSalaryTeacher + (mNumYearsAtSchool * 100);
    }

    @Override
    public void showInfo() {
        //super.showInfo();
        //System.out.println("My Speciality is: " + mSpecialityTeacher);
        System.out.println("My Speciality is: " + mSpecialityTeacher.getmName());
        mSpecialityTeacher.showInfoSpeciality();
        System.out.println("Total Salary: " + getSalary());
        System.out.println("Number At School: " + mNumYearsAtSchool);
    }

    /**
     *  Nested Class
     */
    public static class Speciality {

        private String mName;

        public Speciality() {  }

        public Speciality(String mName) {
            this.mName = mName;
        }

        public void showInfoSpeciality() {
            //System.out.println("Name model.Teacher: " + model.Teacher.this.getmName());
            System.out.println("Name Speciality: " + getmName());
            //System.out.println("Base Salary: " + getmBaseSalaryTeacher());
        }

        public String getmName() {
            return mName;
        }

        public void setmName(String mName) {
            this.mName = mName;
        }
    }
}
