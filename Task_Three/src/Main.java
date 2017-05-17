import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ALEXEY on 5/16/2017.
 */
public class Main {

    public static void main(String[] args) {

        /************* INPUT STREAM *************/
        Scanner input = new Scanner(System.in);
        System.out.println("What Asteroid do you want search?");
        String asteroid = input.nextLine();

        /************* ASTEROIDS *************/
        Asteroid ast1 = new Asteroid("AST1", 3550.0);
        Asteroid ast2 = new Asteroid("AST2", 2000.0);
        Asteroid ast3 = new Asteroid("AST3", 1563.0);
        Asteroid ast4 = new Asteroid("AST4", 2500.0);
        Asteroid ast5 = new Asteroid("AST5", 1698.0);
        Asteroid ast6 = new Asteroid("AST6", 2017.0);
        Asteroid ast7 = new Asteroid("AST7", 6523.0);
        Asteroid ast8 = new Asteroid("AST8", 5218.0);
        Asteroid ast9 = new Asteroid("AST9", 8956.0);
        Asteroid ast10 = new Asteroid("AST10", 4512.0);

        Map<String, Asteroid> asteroids = new HashMap<>();
        asteroids.put(ast1.getmId(), ast1);
        asteroids.put(ast2.getmId(), ast2);
        asteroids.put(ast3.getmId(), ast3);
        asteroids.put(ast4.getmId(), ast4);
        asteroids.put(ast5.getmId(), ast5);
        asteroids.put(ast6.getmId(), ast6);
        asteroids.put(ast7.getmId(), ast7);
        asteroids.put(ast8.getmId(), ast8);
        asteroids.put(ast9.getmId(), ast9);
        asteroids.put(ast10.getmId(), ast10);

        Map<String, Asteroid> result = asteroids.entrySet().stream().filter(a -> a.getKey().toLowerCase().equals(asteroid.toLowerCase()))
                                            .collect(Collectors.toMap(a->a.getKey(), a->a.getValue()));

        System.out.println((result.size() < 1) ? "There is no Asteroids with this ID" : result.toString());

        /************* FILE INPUT STREAM *************/
        File file = new File("./Asteroid.txt");
        try {
            FileOutputStream outFile = new FileOutputStream(file);
            String text = "The Asteroid is:\n" + "Key: " + asteroid + "\n" + "Value: " + result.toString();
            outFile.write(text.getBytes());
            outFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found Exception...");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("IO Exception...");
        }
    }
}
