/**
 * Created by ALEXEY on 5/12/2017.
 */
public class Car implements MyInterface, MySecondInterface {

    @Override
    public void doSomething() {
        System.out.println("I am a Car...");
    }

    @Override
    public void doSomethingAgain() {

    }
}
