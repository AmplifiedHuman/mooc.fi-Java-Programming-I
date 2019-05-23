
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account mySavings = new Account("Jason", 100);
        mySavings.deposit(20);
        System.out.println(mySavings);
    }

}
