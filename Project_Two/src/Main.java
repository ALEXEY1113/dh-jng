/**
 * Created by ALEXEY on 5/12/2017.
 */
public class Main {

    public static void main(String[] args) {

        /************ INTERFACES ***********/
        /*//Tiger tiger = new Tiger();
        Animal tiger = new Tiger();
        Car car = new Car();
        Rock rock = new Rock();

        MyInterface[] items = {
                tiger, car, rock
        };

        for (MyInterface item : items) {
            item.doSomething();
            item.defaultActivity();
        }*/

        /************ ANONYMOUS CLASSES ***********/
        AnimateActivityManager animateActivityManager = new AnimateActivityManager();
        Rock rock = new Rock();
        // 1er Method
        //animateActivityManager.accept(rock);

        // 2do Method
        /*animateActivityManager.accept(new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Test for Message...");
            }
        });*/

        MyInterface client = new MyInterface() {
            private double myVal = 7;

            @Override
            public void doSomething() {
                myVal = Math.pow(myVal/3, myVal/2);
                System.out.println("Test for MyInterface Interface... MyVAL: " + myVal);
            }
        };
        client.doSomething();
    }
}
