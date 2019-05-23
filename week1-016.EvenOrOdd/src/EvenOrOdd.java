
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("Number " + n + " is " + (n % 2 == 0 ? "even" : "odd"));

    }
}
