import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());

        if (x > y) {
            System.out.println("Greater number: " + x);
        } else if (y > x) {
            System.out.println("Greater number: " + y);
        } else {
            System.out.println("The numbers are equal!");
        }
        reader.close();
    }
}
