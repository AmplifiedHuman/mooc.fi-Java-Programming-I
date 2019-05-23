import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("Factorial is " + Fact(n));
        reader.close();
    }

    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Fact(n - 1);
    }
}
