import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        int n = Integer.parseInt(reader.nextLine());
        while (n != -1) {
            stats.addNumber(n);
            if (n % 2 == 0) {
                even.addNumber(n);
            } else {
                odd.addNumber(n);
            }
            n = Integer.parseInt(reader.nextLine());
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
