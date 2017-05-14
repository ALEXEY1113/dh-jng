/**
 * Created by ALEXEY on 5/12/2017.
 */
public interface MyInterface {

    void doSomething();

    //Default Activity
    default void defaultActivity() {
        System.out.println("This is a default activity...");
    }
}
