
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String guess;
        System.out.print("Type the password: ");
        guess = reader.nextLine();
        while (!guess.equals(password)) {
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            guess = reader.nextLine();
        }
        System.out.println("Right!");
        System.out.println("");
        System.out.println("The secret is: jryy qbar!");
        reader.close();
    }
}
