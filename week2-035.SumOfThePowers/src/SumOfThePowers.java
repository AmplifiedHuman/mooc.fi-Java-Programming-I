
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("The result is " + ((int)Math.pow(2, n + 1) - 1));
        reader.close();
    }
}
