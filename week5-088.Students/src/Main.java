import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        System.out.print("name: ");
        String name = reader.nextLine();
        String studentNumber;
        while (!name.isEmpty()) {
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
            System.out.print("name: ");
            name = reader.nextLine();
        }

        for (Student person : list) {
            System.out.println(person);
        }

        System.out.print("Give search term: ");
        System.out.println("Result: ");
        String term = reader.nextLine();
        for (Student person : list) {
            if (person.getName().contains(term)) {
                System.out.println(person);
            }
        }
    }
}