/**
 * Created by ALEXEY on 5/15/2017.
 */
public class OracleArrayList<T> {

    private T[] mItems;
    private int mFilledSpots;

    public OracleArrayList() {
        this.mItems = (T[])new Object[10];
        this.mFilledSpots = 0;
    }

    public OracleArrayList(T[] mItems, int mFilledSpots) {
        this.mItems = mItems;
        this.mFilledSpots = mFilledSpots;
    }

    public void add(T s) {
        if (mFilledSpots < mItems.length) {
            mItems[mFilledSpots] = s;
            mFilledSpots++;
        } else {
            T[] copy = mItems;
            mItems = (T[]) new Object[mItems.length + 10];

            for (int i = 0; i < copy.length; i++){
                mItems[i] = copy[i];
            }

            add(s);
        }
    }

    public T get(int index) {
        return (index < this.mItems.length) ? mItems[index] : null;
    }

    public int size() {
        return mItems.length;
    }

    /********* GETTERS AND SETTERS ********/
    public T[] getmItems() {
        return mItems;
    }

    public void setmItems(T[] mItems) {
        this.mItems = mItems;
    }

    public int getmFilledSpots() {
        return mFilledSpots;
    }

    public void setmFilledSpots(int mFilledSpots) {
        this.mFilledSpots = mFilledSpots;
    }
}
