/**
 * Created by ALEXEY on 5/12/2017.
 */
public abstract class Animal implements MyInterface {

    private String mName;

    @Override
    public void doSomething() {
        System.out.println("I am an Animal...");
    }

    public abstract void walk();

    public abstract void eat();
}
