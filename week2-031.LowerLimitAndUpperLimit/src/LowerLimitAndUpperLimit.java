
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int n = Integer.parseInt(reader.nextLine());
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        reader.close();
    }
}
