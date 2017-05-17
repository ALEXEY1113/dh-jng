import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ALEXEY on 5/16/2017.
 */
public class Main {

    public static void main(String[] args) {

        /***************** SCANNER IO ********************/
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your Username:");
        String username = input.nextLine();
        System.out.println("Your Username is: " + username);*/

        /***************** FILES *******************/
        File file = new File("./test.txt");
        /*try {
            String value = null;
            int length = value.length();
        } catch (NullPointerException npe) {
            System.out.println("There is a problem... " + npe.getMessage());
        }
        System.out.println("Continue with the program...");
        */

        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write("Test for OutputStream Class".getBytes());
            out.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.out.println("File Not Found Exception...");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("IO Exception...");
        }
    }
}
