
import java.util.Scanner;

public class Adder {
    /*
     * Type a number: 6 Type another number: 2 Sum of the numbers: 8
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (x + y));

        reader.close();

    }
}
