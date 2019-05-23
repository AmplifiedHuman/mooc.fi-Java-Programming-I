import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeBook book = new GradeBook();
        System.out.println("Type exam scores, -1 completes:");

        int n = Integer.parseInt(reader.nextLine());
        while (n != -1) {
            book.addScore(n);
            n = Integer.parseInt(reader.nextLine());
        }
        reader.close();
        book.printSummary();
    }
}
