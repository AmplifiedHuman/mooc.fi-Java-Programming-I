import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int even = 0;
        System.out.println("Type numbers: ");
        int n = Integer.parseInt(reader.nextLine());
        while (n != -1) {
            count++;
            sum += n;
            if (n % 2 == 0) {
                even++;
            }
            n = Integer.parseInt(reader.nextLine());
        }
        reader.close();
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (count - even));
    }
}
