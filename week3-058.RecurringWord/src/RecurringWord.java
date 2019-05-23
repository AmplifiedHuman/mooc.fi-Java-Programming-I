
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        System.out.print("Type a word: ");
        String newWord = reader.nextLine();
        while (!strings.contains(newWord)) {
            strings.add(newWord);
            System.out.print("Type a word: ");
            newWord = reader.nextLine();
        }
        System.out.println("You gave the word " + newWord + " twice");
        reader.close();

    }
}
