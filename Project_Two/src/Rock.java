/**
 * Created by ALEXEY on 5/12/2017.
 */
public class Rock implements NonMovableActivityClient {

    private String mTypeRock;

    @Override
    public void onUseRequest() {
        System.out.println("I am being used...");
    }

    @Override
    public void doSomething() {
        System.out.println("I can't do anything... because i am a rock");
    }

    /********** GETTERS AND SETTERS **********/
    public String getmTypeRock() {
        return mTypeRock;
    }

    public void setmTypeRock(String mTypeRock) {
        this.mTypeRock = mTypeRock;
    }
}
