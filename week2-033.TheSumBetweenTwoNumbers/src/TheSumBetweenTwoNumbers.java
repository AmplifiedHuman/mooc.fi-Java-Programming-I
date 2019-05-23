
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
        reader.close();
    }
}
