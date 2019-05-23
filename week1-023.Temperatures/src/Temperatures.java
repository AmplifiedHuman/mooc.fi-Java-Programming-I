
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double input;
        while (true) {
            input = Double.parseDouble(reader.nextLine());
            if ((input >= -30) && (input <= 40)) {
                Graph.addNumber(input);
            } 
        }
    }
}
