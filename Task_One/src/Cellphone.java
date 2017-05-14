/**
 * Created by ALEXEY on 5/11/2017.
 */
public class Cellphone {

    private String mName;
    private String mModel;
    private Battery mBattery;

    public static double mSumList;
    public static double mSumDuration;
    public static int mSizeListBatteryDurations;

    public Cellphone(String mName, String mModel, Battery mBattery) {
        this.mName = mName;
        this.mModel = mModel;
        this.mBattery = mBattery;

        mSumList = 0;
        mSumDuration = 0;
        mSizeListBatteryDurations = 0;
    }

    public double getAverageDuration(Battery... durations) {

        for (Battery durationBattery : durations) {
            mSumDuration = mSumDuration + durationBattery.getmDuration();
            mSizeListBatteryDurations++;

            mSumList = mSumList + durationBattery.getmDuration();
        }

        return (mSumDuration / mSizeListBatteryDurations);
    }

    public Battery getmBattery() {
        return mBattery;
    }

    public void setmBattery(Battery mBattery) {
        this.mBattery = mBattery;
    }

    /********* GETTERS AND SETTERS ********/


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }


    public static class Battery {
        private double mDuration;

        public Battery() {  }

        public Battery(double mDuration) {
            this.mDuration = mDuration;
        }

        /********* GETTERS AND SETTERS ********/
        public double getmDuration() {
            return mDuration;
        }

        public void setmDuration(int mDuration) {
            this.mDuration = mDuration;
        }
    }
}
