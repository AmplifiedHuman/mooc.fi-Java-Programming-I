
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");

    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");
        while (!reader.hasNextInt()) {
            System.out.println("Invalid integer");
            reader.next();
        }
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < n; i++) {
            printText();
        }
        reader.close();
    }
}
