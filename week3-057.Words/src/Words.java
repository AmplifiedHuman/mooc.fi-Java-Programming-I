import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String newWord = reader.nextLine();
        while (!newWord.isEmpty()) {
            words.add(newWord);
            System.out.print("Type a word: ");
            newWord = reader.nextLine();
        }
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
        reader.close();
    }
}
