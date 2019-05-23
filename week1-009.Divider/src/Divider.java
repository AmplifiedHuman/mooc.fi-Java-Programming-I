
import java.util.Scanner;

public class Divider {
    //Division: 3 / 2 = 1.5
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("Division: " + x + " / " + y + " = " + ((double) x / y));

        reader.close();

    }
}
