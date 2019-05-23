
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int score = Integer.parseInt(reader.nextLine());
        int grade;
        if (score >= 50 && score <= 60) {
            grade = 5;
        } else if (score >= 45 && score <= 49) {
            grade = 4;
        } else if (score >= 40 && score <= 44) {
            grade = 3;
        } else if (score >= 35 && score <= 39) {
            grade = 2;
        } else if (score >= 30 && score <= 34) {
            grade = 1;
        } else {
            grade = 0;
        }
        if (grade != 0) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("fail");

        }

        reader.close();
    }
}
