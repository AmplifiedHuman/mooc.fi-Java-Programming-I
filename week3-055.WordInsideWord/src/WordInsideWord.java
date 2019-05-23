
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.println("Type the second word: ");
        String secondWord = reader.nextLine();
        System.out.print("The word \'" + secondWord +"\' is ");
        if (firstWord.contains(secondWord)) {
            System.out.print("found ");
        } else {
            System.out.print("not found ");
        }
        System.out.println("in the word \'" + firstWord + "\'.");
    }
}
