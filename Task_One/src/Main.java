import java.util.ArrayList;

/**
 * Created by ALEXEY on 5/11/2017.
 */
public class Main {

    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone("Duck Duck", "Super Duck", new Cellphone.Battery(6));

        // Battery Average Duration
        System.out.println("Cellphone Name: " + cellphone.getmName());
        System.out.println("Cellphone Model: " + cellphone.getmModel());

        System.out.println("-> The average is: " +

                cellphone.getAverageDuration(
                    new Cellphone.Battery(1.5),
                    new Cellphone.Battery(2.3),
                    new Cellphone.Battery(3.9),
                    new Cellphone.Battery(4.7),
                    new Cellphone.Battery(5.9),
                    new Cellphone.Battery(6.5),
                    new Cellphone.Battery(7.3),
                    new Cellphone.Battery(8.8),
                    new Cellphone.Battery(9.5),
                    new Cellphone.Battery(10.0),
                        cellphone.getmBattery()
            ));

        System.out.println("--> Total SUM: " + cellphone.mSumList);
        System.out.println("---> Total SUM DURATION: " + cellphone.mSumDuration);
        System.out.println("----> Total LIST DURATION SIZE: " + cellphone.mSizeListBatteryDurations);
    }
}
