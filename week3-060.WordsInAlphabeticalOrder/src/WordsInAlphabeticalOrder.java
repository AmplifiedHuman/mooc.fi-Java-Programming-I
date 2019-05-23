
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> composers = new ArrayList<String>();
        System.out.print("Type a word: ");
        String name = reader.nextLine();
        while (!name.isEmpty()) {
            composers.add(name);
            System.out.print("Type a word: ");
            name = reader.nextLine();
        }
        System.out.println("You typed the following words: ");
        Collections.sort(composers);
        for (String word : composers) {
            System.out.println(word);
        }
        reader.close();
    }
}
